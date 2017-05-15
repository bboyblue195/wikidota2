package com.example.bboyb.demogd2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainPageFragment extends Fragment implements View.OnClickListener{
    CustomButton cbHeroes,cbItems,cbNews;

    public MainPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_page, container, false);
        cbHeroes=(CustomButton)view.findViewById(R.id.mainPageHeroes);
        cbItems=(CustomButton)view.findViewById(R.id.mainPageItems);
        cbNews=(CustomButton)view.findViewById(R.id.mainPageNews);
        cbHeroes.setOnClickListener(this);
        cbNews.setOnClickListener(this);
        cbItems.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        Fragment fragment=null;
       switch(v.getId()){
            case R.id.mainPageHeroes:fragment=new HeroesFragment();break;
            case R.id.mainPageItems:fragment=new ItemsFragment();break;
            case R.id.mainPageNews:fragment=new NewsFragment();break;
        }
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
    }



}
