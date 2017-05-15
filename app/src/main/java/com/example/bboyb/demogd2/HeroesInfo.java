package com.example.bboyb.demogd2;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bboyb.demogd2.bean.Heroes;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroesInfo extends ActionBarActivity {
    TextView tvName,tvDescription,tvAttribute,tvStrength,tvAgility,tvIntelligent,tvSpeed;
    ImageView ivHero,ivStr,ivInt,ivAgi,ivSpd;
    ImageButton ibSkill;
    static String idHero;
    public HeroesInfo() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_heroes_info);
        SQLiteDB sqLiteDB=new SQLiteDB(getApplicationContext());

        tvName=(TextView)findViewById(R.id.tvNameHeroesInfo);
        tvDescription=(TextView)findViewById(R.id.tvDescriptionHeroesInfo);
        tvAttribute=(TextView)findViewById(R.id.tvAttributeHero);
        tvStrength=(TextView)findViewById(R.id.tvStrengthHero);
        tvAgility=(TextView)findViewById(R.id.tvAgilityHero);
        tvIntelligent=(TextView)findViewById(R.id.tvIntelligentHero);
        tvSpeed=(TextView)findViewById(R.id.tvSpeedHero);
        ivHero=(ImageView) findViewById(R.id.ivHeroesInfo);
        ivAgi=(ImageView) findViewById(R.id.ivAgi) ;
        ivStr=(ImageView) findViewById(R.id.ivStr) ;
        ivSpd=(ImageView) findViewById(R.id.ivSpd) ;
        ivInt=(ImageView) findViewById(R.id.ivInt) ;
        ibSkill=(ImageButton) findViewById(R.id.ibSkills) ;
        Bundle bundle=getIntent().getExtras();

        ivAgi.setImageResource(R.drawable.agility);
        ivSpd.setImageResource(R.drawable.speed);
        ivStr.setImageResource(R.drawable.strength);
        ivInt.setImageResource(R.drawable.intelligent);
        ibSkill.setImageResource(R.drawable.skillnext);


        this.idHero= bundle.getString("idHero");
        final Heroes hero=sqLiteDB.getHero(idHero);




        tvName.setText(hero.getTenHero());
        tvDescription.setText(hero.getMoTa());
        String thuocTinh=hero.getAgility();
        if(thuocTinh.equalsIgnoreCase("t1")){
            thuocTinh="Strength";
        }else if(thuocTinh.equalsIgnoreCase("t2")){
            thuocTinh="Agility";
        }else thuocTinh="Intelligent";
        tvAttribute.setText(tvAttribute.getText()+ "("+thuocTinh+")");
        tvStrength.setText(hero.getStrength());
        tvAgility.setText(hero.getAgility());
        tvIntelligent.setText(hero.getIntelligent());
        tvSpeed.setText(hero.getTocDoChay());
        ivHero.setImageBitmap(BitmapFactory.decodeByteArray(hero.getHinhAnh(),0,hero.getHinhAnh().length));



        ImageButton ibskill= (ImageButton)findViewById(R.id.ibSkills);
        ibskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SkillInfo skillFragment= new SkillInfo();
                Bundle bundle=new Bundle();
                bundle.putString("idHero",idHero);
                bundle.putString("Name",hero.getTenHero());
                bundle.putByteArray("Image",hero.getHinhAnh());
                Intent intent=new Intent(getApplicationContext(),SkillInfo.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
       ;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        return true;
    }




}
