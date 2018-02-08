package com.example.farshid.recyclerviewreachendlistener;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Farshid on 2/9/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private Context context;
    private List<String> stringList;
    public ItemAdapter (Context context){
        this.context = context;
        stringList=new ArrayList<>();
    }
    public void Addtem(List<String> stringList){
        this.stringList.addAll(stringList);
        this.notifyDataSetChanged();
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemAdapter.ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.textView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ItemViewHolder(View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textViewItem);
        }
    }
}
