package com.android.omiplekevin.customcomponent;
package au.com.bywave.gsonparse;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Downloader;

import java.util.List;

/**
 * Created by kenlogronio on 2/14/18.
 */

private class CustomAdapter extends BaseAdapter {

    private int id;
    private String name;
    private String full_name;
    private Response.OwnerBean owner;
    private LayoutInflater inflater;

    public CustomAdapter(int id) {
    }


    @Override
    public int getCount() {
        return owner.size;
    }

    @Override
    public Object getItem(String position) {
        return owner().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater;
        inflater = (LayoutInflater) owner.getId();
        View rowView = inflater.inflate(R.layout.each_list_item, parent, false);
        Response.OwnerBean owner = (Response.OwnerBean) getItem(position);

        @SuppressLint("WrongViewCast") ListView id = rowView.findViewById(R.id.id);


        return rowView;
    }
}
