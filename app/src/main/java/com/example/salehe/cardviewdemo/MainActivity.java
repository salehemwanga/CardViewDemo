package com.example.salehe.cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    /*declaration for gridview*/
    GridView gridView;
//    ArrayAdapter<Information> adapter= new ArrayAdapter<Information>();

    ArrayList<Information> list = new ArrayList<Information>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] titles = {
                "Video: Zawadi aliyoitoa Mhe Salehe leo dar es Salaam",
                "Video: Angalia hali ya kisiasa Nchini Sudan ya Kusini",
                "Video: Goli alilofunga Mbwana Samatta yaiweka sehemu nzuri Timu yake ya Genk",
                "Video: Zawadi aliyoitoa Mhe Salehe leo dar es Salaam",
                "Video: Angalia hali ya kisiasa Nchini Sudan ya Kusini",
                "Video: Goli alilofunga Mbwana Samatta yaiweka sehemu nzuri Timu yake ya Genk"
        };
        String[] date = {"1 min ago", "28 mins ago", "1 hr","1 min ago", "28 mins ago", "1 hr"};

        /*
        * this code below is for recycler view
        * uncomment this code to see the effect
        * >>>>this is me Salehe>>>*/

        /*mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setHasFixedSize(true);*/


        /*code when using gridview
        * >>>>It's me Sah
        * .............*/


        for (int i = 0; i < titles.length; i++) {
            Information information = new Information(titles[i], date[i]);
            list.add(information);
        }

        /*mAdapter = new MyAdapter(list);
        mRecyclerView.setAdapter(mAdapter);*/

        gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new GridViewAdapter(this,list));
    }
}