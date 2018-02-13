package com.android.omiplekevin.customcomponent.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.omiplekevin.customcomponent.R;
import com.android.omiplekevin.customcomponent.dao.CustomContent;

import java.util.List;

/**
 * Created by OMIPLEKEVIN on February 13, 2018.
 * CustomComponent
 * com.android.omiplekevin.customcomponent.adapter
 */

public class CustomListViewAdapter extends ArrayAdapter<CustomContent> {

    private Context context;
    private List<CustomContent> contents;

    /**
     * CustomListViewAdapter constructor
     * @param context application context
     * @param resource layoutResId
     * @param contents collection of data
     */
    public CustomListViewAdapter(@NonNull Context context, int resource, @NonNull List<CustomContent> contents) {
        super(context, resource, contents);
        this.context = context;
        this.contents = contents;
    }

    @Override
    public int getCount() {
        return this.contents.size();
    }

    @NonNull
    @Override
    public CustomContent getItem(int position) {
        return this.contents.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.layout_listview_list_item, null);
            holder = new ViewHolder();
            holder.listImageView = (ImageView) convertView.findViewById(R.id.listImageView);
            holder.listStringContent = (TextView) convertView.findViewById(R.id.listStringContent);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.listStringContent.setText(this.contents.get(position).content);
        holder.listImageView.setImageResource(this.contents.get(position).imageResId);
        holder.listImageView.invalidate();

        return convertView;
    }

    static class ViewHolder {
        ImageView listImageView;
        TextView listStringContent;
    }
}
