package com.example.bboyb.demogd2;


import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class    NewsInfo extends ActionBarActivity {
    TextView tvTittle,tvContent,tvDate;
    ImageView ivNews;

    public NewsInfo() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_news_info);

        Bundle bundle=getIntent().getExtras();
        tvTittle = (TextView) findViewById(R.id.tvNameNewsInfo);
        tvContent = (TextView) findViewById(R.id.tvContentNews);
        tvDate = (TextView) findViewById(R.id.tvDateNews);
        ivNews = (ImageView) findViewById(R.id.ivNewsInfo);

        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        tvTittle.setText(bundle.getString("Tittle"));
        tvContent.setText(bundle.getString("Content"));
        tvDate.setText(bundle.getString("Date"));
        ivNews.setImageBitmap(BitmapFactory.decodeByteArray(bundle.getByteArray("Image"),0,bundle.getByteArray("Image").length));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        return true;
    }
}
