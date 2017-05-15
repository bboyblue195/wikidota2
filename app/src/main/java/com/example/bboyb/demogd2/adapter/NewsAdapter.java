package com.example.bboyb.demogd2.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.bboyb.demogd2.NewsInfo;
import com.example.bboyb.demogd2.R;
import com.example.bboyb.demogd2.bean.Heroes;
import com.example.bboyb.demogd2.bean.Items;
import com.example.bboyb.demogd2.bean.News;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by bboyb on 29/04/2017.
 */

public class NewsAdapter extends BaseAdapter {
    Context context;
    ArrayList<News> listNews;
    LayoutInflater inflater;
    public NewsAdapter(ArrayList<News> listNews, Context context) {
        this.context=context;
        this.inflater=LayoutInflater.from(this.context);
        this.listNews = listNews;
    }

    @Override
    public int getCount() {
        return listNews.size();
    }

    @Override
    public Object getItem(int position) {
        return listNews.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final News item=listNews.get(position);
        TextView tvNameNews,tvDescriptionNews;
        ImageButton ibNews;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.list_news_layout,parent,false);
        }
        tvNameNews=(TextView) convertView.findViewById(R.id.tvNameNews);
        ibNews=(ImageButton) convertView.findViewById(R.id.ibNews);
        tvDescriptionNews=(TextView)convertView.findViewById(R.id.tvDescriptionNews);
        tvNameNews.setText(item.getTieuDe());
        tvDescriptionNews.setText(item.getMoTa());
        ibNews.setImageBitmap(BitmapFactory.decodeByteArray(item.getHinhAnh(),0,item.getHinhAnh().length));
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        final Bundle bundle=new Bundle();
        bundle.putString("Tittle",item.getTieuDe());
        bundle.putString("Content",item.getNoiDung());
        bundle.putString("Date",sdf.format(item.getThoiGian()));
        bundle.putByteArray("Image",item.getHinhAnh());
        tvNameNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsInfo fragment= new NewsInfo();
                Intent intent= new Intent(context.getApplicationContext(),NewsInfo.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                context.getApplicationContext().startActivity(intent);
            }
        });
        ibNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsInfo fragment= new NewsInfo();
                Intent intent= new Intent(context.getApplicationContext(),NewsInfo.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                context.getApplicationContext().startActivity(intent);
            }
        });

        return convertView;
    }

}
