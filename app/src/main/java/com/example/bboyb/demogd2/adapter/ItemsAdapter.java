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

import com.example.bboyb.demogd2.ItemsInfo;
import com.example.bboyb.demogd2.R;
import com.example.bboyb.demogd2.bean.Heroes;
import com.example.bboyb.demogd2.bean.Items;

import java.util.ArrayList;

/**
 * Created by bboyb on 29/04/2017.
 */

public class ItemsAdapter extends BaseAdapter {
    Context context;
    ArrayList<Items> listItems;
    LayoutInflater inflater;

    public ItemsAdapter(ArrayList<Items> listItems, Context context) {
        this.context=context;
        this.inflater=LayoutInflater.from(this.context);
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Items item=listItems.get(position);
        TextView tvNameItems;
        ImageButton ibItems;
        if(convertView==null){
            convertView=inflater.inflate(R.layout.list_item_layout,parent,false);
        }
        tvNameItems=(TextView) convertView.findViewById(R.id.tvNameItems);
        ibItems=(ImageButton) convertView.findViewById(R.id.ibItems);

        tvNameItems.setText(item.getTenItem());

        ibItems.setImageBitmap(BitmapFactory.decodeByteArray(item.getHinhAnh(),0,item.getHinhAnh().length));
        ibItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemsInfo fragment= new ItemsInfo();
                Bundle bundle=new Bundle();
                bundle.putString("Name",item.getTenItem());
                bundle.putString("Description",item.getCongDung());
                bundle.putInt("Cost",item.getGia());
                bundle.putByteArray("Image",item.getHinhAnh());
                Intent intent= new Intent(context.getApplicationContext(),ItemsInfo.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                context.getApplicationContext().startActivity(intent);
            }
        });

        return convertView;
    }
}
