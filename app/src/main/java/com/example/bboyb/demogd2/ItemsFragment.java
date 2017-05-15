package com.example.bboyb.demogd2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.bboyb.demogd2.adapter.ItemsAdapter;
import com.example.bboyb.demogd2.bean.Items;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsFragment extends Fragment {
    ItemsAdapter adapter;
    ListView lvItems;
    private ArrayList<Items> listItems;

    public ItemsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_items, container, false);
        lvItems=(ListView) view.findViewById(R.id.lvItems);
        createData();
        adapter=new ItemsAdapter(listItems,getActivity());
        lvItems.setAdapter(adapter);
        return view;
    }

    private void createData() {
        listItems=new ArrayList<>();
        SQLiteDB sqLiteDB=new SQLiteDB(getContext());
        listItems=sqLiteDB.getListItems();
    }

}
