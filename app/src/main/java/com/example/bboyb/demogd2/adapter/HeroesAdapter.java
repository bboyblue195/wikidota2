package com.example.bboyb.demogd2.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bboyb.demogd2.HeroesInfo;
import com.example.bboyb.demogd2.R;
import com.example.bboyb.demogd2.bean.Heroes;

import java.util.ArrayList;

/**
 * Created by bboyb on 28/04/2017.
 */

public class HeroesAdapter extends BaseAdapter {
    Context context;
    ArrayList<Heroes> listHeroes;
    LayoutInflater inflater;

    public HeroesAdapter(ArrayList<Heroes> listHeroes, Context context) {
        this.context=context;
        this.inflater=LayoutInflater.from(this.context);
        this.listHeroes = listHeroes;
    }

    @Override
    public int getCount() {
        return listHeroes.size();
    }

    @Override
    public Object getItem(int position) {
        return listHeroes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Heroes item=listHeroes.get(position);
        TextView tvNameHeroes,tvTypeHeroes;
        ImageButton ibHeroes;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.list_hero_layout,parent,false);
        }
        tvNameHeroes=(TextView) convertView.findViewById(R.id.tvNameHeroes);
        ibHeroes=(ImageButton) convertView.findViewById(R.id.ibHeroes);
        tvTypeHeroes=(TextView)convertView.findViewById(R.id.tvTypeHeroes);
        tvNameHeroes.setText(item.getTenHero());
        String thuocTinh="";
        if(item.getThuocTinh().equalsIgnoreCase("t1")){
            thuocTinh="Strength";
        }else if(item.getThuocTinh().equalsIgnoreCase("t2")){
            thuocTinh="Agility";
        }else thuocTinh="Intelligent";
        tvTypeHeroes.setText(thuocTinh);
        ibHeroes.setImageBitmap(BitmapFactory.decodeByteArray(item.getHinhAnh(),0,item.getHinhAnh().length));
        ibHeroes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("idHero",item.getIdHero());
                /*bundle.putString("Description",item.getMoTa());
                bundle.putString("Name",item.getTenHero());
                bundle.putString("Strength",item.getStrength());
                bundle.putString("Intelligent",item.getIntelligent());
                bundle.putString("Agility",item.getAgility());
                bundle.putString("Speed",item.getTocDoChay());
                bundle.putString("Attribute",item.getThuocTinh());
                bundle.putByteArray("Image",item.getHinhAnh());*/
                Intent intent= new Intent(context.getApplicationContext(),HeroesInfo.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                context.getApplicationContext().startActivity(intent);

            }
        });

        return convertView;
    }
}
