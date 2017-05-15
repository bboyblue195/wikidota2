package com.example.bboyb.demogd2;


import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bboyb.demogd2.bean.Skills;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SkillInfo extends FragmentActivity {
    private ArrayList<Skills> listSkills;
    TextView tvNameHero,tvNameSkill1,tvNameSkill2,tvNameSkill3,tvNameSkill4,tvContentSkill1,tvContentSkill2,tvContentSkill3,tvContentSkill4;
    ImageView ivHero,ivSkill1,ivSkill2,ivSkill3,ivSkill4;
    public SkillInfo() {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_skill_info);

        tvNameHero=(TextView)findViewById(R.id.tvNameHeroesInfoInSkill);
        tvNameSkill1=(TextView)findViewById(R.id.tvNameSkill1);
        tvNameSkill2=(TextView)findViewById(R.id.tvNameSkill2);
        tvNameSkill3=(TextView)findViewById(R.id.tvNameSkill3);
        tvNameSkill4=(TextView)findViewById(R.id.tvNameSkill4);
        tvContentSkill1=(TextView)findViewById(R.id.tvContentSkill1);
        tvContentSkill2=(TextView)findViewById(R.id.tvContentSkill2);
        tvContentSkill3=(TextView)findViewById(R.id.tvContentSkill3);
        tvContentSkill4=(TextView)findViewById(R.id.tvContentSkill4);
        ivHero=(ImageView)findViewById(R.id.ivHeroesInfoInSkill);
        ivSkill1=(ImageView)findViewById(R.id.ivSkill1);
        ivSkill2=(ImageView)findViewById(R.id.ivSkill2);
        ivSkill3=(ImageView)findViewById(R.id.ivSkill3);
        ivSkill4=(ImageView)findViewById(R.id.ivSkill4);
        Bundle bundle=getIntent().getExtras();
        tvNameHero.setText(bundle.getString("Name"));
        ivHero.setImageBitmap(BitmapFactory.decodeByteArray(bundle.getByteArray("Image"),0,bundle.getByteArray("Image").length));

        listSkills=new ArrayList<>();
        SQLiteDB sqLiteDB=new SQLiteDB(getApplicationContext());
        listSkills=sqLiteDB.getSkills(bundle.getString("idHero"));

        tvNameSkill1.setText(listSkills.get(0).getTenSkill());
        tvNameSkill2.setText(listSkills.get(1).getTenSkill());
        tvNameSkill3.setText(listSkills.get(2).getTenSkill());
        tvNameSkill4.setText(listSkills.get(3).getTenSkill());
        tvContentSkill1.setText(listSkills.get(0).getCongDung());
        tvContentSkill2.setText(listSkills.get(1).getCongDung());
        tvContentSkill3.setText(listSkills.get(2).getCongDung());
        tvContentSkill4.setText(listSkills.get(3).getCongDung());
        ivSkill1.setImageBitmap(BitmapFactory.decodeByteArray(listSkills.get(0).getHinhAnh(),0,listSkills.get(0).getHinhAnh().length));
        ivSkill2.setImageBitmap(BitmapFactory.decodeByteArray(listSkills.get(1).getHinhAnh(),0,listSkills.get(1).getHinhAnh().length));
        ivSkill3.setImageBitmap(BitmapFactory.decodeByteArray(listSkills.get(2).getHinhAnh(),0,listSkills.get(2).getHinhAnh().length));
        ivSkill4.setImageBitmap(BitmapFactory.decodeByteArray(listSkills.get(3).getHinhAnh(),0,listSkills.get(3).getHinhAnh().length));



    }




}
