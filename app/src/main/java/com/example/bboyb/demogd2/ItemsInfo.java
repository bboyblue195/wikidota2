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


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemsInfo extends ActionBarActivity {
    TextView tvName,tvDescription,tvCost;
    ImageView ivItem,ivGold;

    public ItemsInfo() {
        // Required empty public constructor
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_items_info);


        tvName=(TextView)findViewById(R.id.tvNameItemsInfo);
        tvDescription=(TextView)findViewById(R.id.tvDescriptionItems);
        tvCost=(TextView)findViewById(R.id.tvCostItems);
        ivItem=(ImageView) findViewById(R.id.ivItemsInfo);
        ivGold=(ImageView) findViewById(R.id.ivGold);

        ivGold.setImageResource(R.drawable.gold);

        Bundle bundle=getIntent().getExtras();
        tvName.setText(bundle.getString("Name"));
        tvDescription.setText(bundle.getString("Description"));
        tvCost.setText(String.valueOf(bundle.getInt("Cost")));
        ivItem.setImageBitmap(BitmapFactory.decodeByteArray(bundle.getByteArray("Image"),0,bundle.getByteArray("Image").length));


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);
        return true;
    }

}
