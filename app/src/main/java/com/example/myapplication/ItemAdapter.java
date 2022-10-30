package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private List<ListItem> list;
    private Context context;

    public ItemAdapter(Context context, List<ListItem> list) {
        this.context = context;
        this.list = list;
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
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item,
                    parent,false);
            holder.listId = convertView.findViewById(R.id.tv_id);
            holder.name = convertView.findViewById(R.id.tv_name);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        ListItem newItem = list.get(position);
        holder.listId.setText("" + newItem.getListId());
        holder.name.setText(newItem.getName());
        return convertView;
    }

    class  ViewHolder{
        TextView listId;
        TextView name;
    }
}
