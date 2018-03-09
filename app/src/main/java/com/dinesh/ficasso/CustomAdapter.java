package com.dinesh.ficasso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by DPogula on 3/7/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    int imageItems [];
    private LayoutInflater inflater;
    @Override
    public int getCount() {
        return imageItems.length;
    }

    public CustomAdapter(Context context, int[] items){
        mContext = context;
        imageItems = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.image_adapter_items, null);
        ImageView images = convertView.findViewById(R.id.imageItem);


        //Ficasso.getInstance().load(R.drawable.natureimage3).into(images);



        return convertView;
    }

}
