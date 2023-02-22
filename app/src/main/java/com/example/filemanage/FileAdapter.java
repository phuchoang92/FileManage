package com.example.filemanage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FileAdapter extends BaseAdapter {
    List<FileModel> items;
    Context context;

    public FileAdapter(List<FileModel> items, Context context){
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        FileViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.layout_item, null);
            viewHolder = new FileViewHolder();
            viewHolder.icon = view.findViewById(R.id.item_icon);
            viewHolder.name = view.findViewById(R.id.item_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (FileViewHolder) view.getTag();
        }

        FileModel file = items.get(i);

        // Get ID of icon in drawable folder
        int id = context.getResources().getIdentifier(
                file.getIcon(),
                "drawable",
                context.getPackageName()
        );
        viewHolder.icon.setImageResource(R.drawable.ic_baseline_folder_24);
        viewHolder.name.setText(file.getName());

        return view;
    }

    static class FileViewHolder {
        ImageView icon;
        TextView name;
    }
}


