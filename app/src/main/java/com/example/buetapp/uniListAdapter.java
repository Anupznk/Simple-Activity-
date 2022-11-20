package com.example.buetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class uniListAdapter extends ArrayAdapter<University> {
    public static final String TAG = "UniversityAdapter";
    private Context mContext;
    private int mResource;

    public uniListAdapter(@NonNull Context context, int resource, ArrayList<University> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String rank = getItem(position).getRank();

        University university = new University(name, rank);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView uniView = (TextView)convertView.findViewById(R.id.university_name_view);
        TextView rankView = (TextView)convertView.findViewById(R.id.ranking_view);
        uniView.setText(name);
        rankView.setText(rank);
        return convertView;
    }


}
