package com.example.bboyb.demogd2;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.bboyb.demogd2.adapter.NewsAdapter;
import com.example.bboyb.demogd2.bean.News;
import com.example.bboyb.demogd2.lib.MyService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    NewsAdapter adapter;
    ListView lvNews;
    private ArrayList<News> listNews=new ArrayList<>();
    private String URL = "http://10.0.3.2/Dota2wiki/display.php";
    ProgressDialog pDialog;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news, container, false);
        lvNews=(ListView) view.findViewById(R.id.lvNews);
        new getListNews().execute();
        /*createData();
        adapter=new NewsAdapter(listNews,getActivity());
        lvNews.setAdapter(adapter);*/
        return view;
    }

    class getListNews extends AsyncTask {

        @Override
        protected Object doInBackground(Object[] params) {
            MyService jsonParser = new MyService();
            String json = jsonParser.callService(URL, MyService.GET);

            if (json != null) {
                try {
                    JSONObject jsonObj = new JSONObject(json);
                    if (jsonObj != null) {
                        JSONArray platfform = jsonObj.getJSONArray("news");

                        for (int i = 0; i < platfform.length(); i++) {
                            JSONObject obj = (JSONObject) platfform.get(i);
                            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm");
                            Timestamp tg=null;
                            try {
                                tg=new Timestamp(sdf.parse(obj.getString("ThoiGian")).getTime());
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            News news = new News(obj.getInt("id"), obj.getString("TieuDe"),obj.getString("NoiDung"),obj.getString("MoTa"),obj.getString("HinhAnh"),tg);
                            listNews.add(news);
                        }
                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            } else {
                Log.e("JSON Data", "Didn't receive any data from server!");
            }
            return null;
        }

        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(getActivity());
            pDialog.setMessage("Loading..");
            pDialog.setCancelable(false);
            pDialog.show();

        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            if (pDialog.isShowing())
                pDialog.dismiss();
            create();
        }
    }
    private void create() {


        adapter=new NewsAdapter(listNews,getActivity());
        lvNews.setAdapter(adapter);
    }
}
