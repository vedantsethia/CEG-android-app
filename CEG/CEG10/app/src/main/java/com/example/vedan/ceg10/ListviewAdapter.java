package com.example.vedan.ceg10;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter
{
    private ArrayList<String> listCountry;
    private ArrayList<String> listFlag1;
    private ArrayList<Integer> listFlag;
    private Activity activity;

    public ListviewAdapter(Activity activity, ArrayList <String> listCountry, ArrayList <Integer> listFlag, ArrayList <String> listFlag1) {
        super();
        this.listCountry = listCountry;
        this.listFlag = listFlag;
        this.listFlag1 = listFlag1;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        if(listFlag == null){
            return 0;
        }
        return listFlag.size();
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return String.valueOf(listFlag.get(position));
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
        public TextView txtViewTitle2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        GridviewAdapter.ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if(convertView==null)
        {
            view = new GridviewAdapter.ViewHolder();
            convertView = inflator.inflate(R.layout.traning_index, null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textViewName);
            view.txtViewTitle2 = (TextView) convertView.findViewById(R.id.textViewVersion);
            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(view);
        }
        else
        {
            view = (GridviewAdapter.ViewHolder) convertView.getTag();
        }

        view.txtViewTitle.setText(listCountry.get(position));
        view.txtViewTitle2.setText(listFlag1.get(position));
        view.imgViewFlag.setImageResource(listFlag.get(position));

        return convertView;
    }
}
