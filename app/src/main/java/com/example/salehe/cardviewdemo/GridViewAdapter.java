package com.example.salehe.cardviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Salehe on 8/16/2016.
 */
public class GridViewAdapter extends BaseAdapter {

    Context context;
    ArrayList<Information> list = new ArrayList<Information>();
    GridViewAdapter(Context context,ArrayList<Information> list){
        this.context = context;
        this.list = list;
    }

    class ViewHolder {
        TextView title;

        ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.info_text);
        }

    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder viewHolder = null;
        if (view==null){
            view = LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);
            viewHolder =new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Information information = list.get(position);
        viewHolder.title.setText(information.info);

        return view;
    }
}
