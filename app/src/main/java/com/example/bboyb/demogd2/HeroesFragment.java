package com.example.bboyb.demogd2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.bboyb.demogd2.adapter.HeroesAdapter;
import com.example.bboyb.demogd2.bean.Heroes;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesFragment extends Fragment {
   // private OnFragmentInteractionListener mListener;
    HeroesAdapter adapter;
    ListView lvHeroes;
    private ArrayList<Heroes> listHeroes;

    public HeroesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_heroes, container, false);
        lvHeroes=(ListView) view.findViewById(R.id.lvHeroes);
        createData();
        adapter=new HeroesAdapter(listHeroes,getActivity());
        lvHeroes.setAdapter(adapter);

        return view;

    }



    private void createData() {
        listHeroes=new ArrayList<>();
        SQLiteDB sqLiteDB=new SQLiteDB(getContext());
        listHeroes=sqLiteDB.getListHeroes();

    }

}
