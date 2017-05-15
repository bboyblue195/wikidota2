package com.example.bboyb.demogd2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.bboyb.demogd2.adapter.NewsAdapter;
import com.example.bboyb.demogd2.bean.News;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {
    NewsAdapter adapter;
    ListView lvNews;
    private ArrayList<News> listNews;


    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_news, container, false);
        lvNews=(ListView) view.findViewById(R.id.lvNews);
        createData();
        adapter=new NewsAdapter(listNews,getActivity());
        lvNews.setAdapter(adapter);
        return view;
    }
    private void createData() {
        listNews=new ArrayList<>();
        SQLiteDB sqLiteDB=new SQLiteDB(getContext());
        listNews=sqLiteDB.getListNews();
    }

}
