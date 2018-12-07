package com.example.johnson.gridviewassignment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

//BaseAdapter allows implementations for an Adapter
//Adapter provides access to the data items.
public class ImageChange extends BaseAdapter {
    private Context context;

    //Images from drawable stored onto a array
    private Integer[] DragonBall = {
            R.drawable.dbshenron,R.drawable.star1,
            R.drawable.star2,R.drawable.star3,
            R.drawable.star4,R.drawable.star5,
            R.drawable.star6,R.drawable.star7,
            R.drawable.quit
    };


    public ImageChange(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return DragonBall.length;
    }

    //This function gives specific item position on the gridView
    @Override
    public Object getItem(int position) {
        return null;
    }

    //Returns the row ID
    @Override
    public long getItemId(int position) {
        return 0;
    }

    //Gives the imageViews its positioning
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(10,10,10,10);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(DragonBall[position]);
        return imageView;
    }


}
