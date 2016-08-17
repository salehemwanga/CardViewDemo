package com.example.salehe.cardviewdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Salehe on 8/16/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<Information> arrayList = new ArrayList<Information>();
    public MyAdapter(ArrayList<Information> arrayList) {
        this.arrayList = arrayList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView,dateInfo;
        CardView cardView;
        public ViewHolder(final View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.info_text);
            dateInfo = (TextView) v.findViewById(R.id.date_id);

            /*adding click event on cardView
            * sah.......*/
            cardView = (CardView) v.findViewById(R.id.card_view);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    v.getContext().startActivity(new Intent(v.getContext(),HomeDetails.class));
                }
            });
        }
    }


    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Information information = arrayList.get(position);
        holder.mTextView.setText(information.info);
        holder.dateInfo.setText(information.date);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
