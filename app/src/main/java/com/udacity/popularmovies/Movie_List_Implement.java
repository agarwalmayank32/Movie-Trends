package com.udacity.popularmovies;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by mayank on 29/4/16.
 */
public class Movie_List_Implement extends BaseAdapter {

    private final Activity activity;
    private final String[] MoviePoster;
    private final int count;

    Movie_List_Implement(Activity activity,String[] MoviePoster, int count)
    {
        this.activity=activity;
        this.MoviePoster=MoviePoster;
        this.count=count;
    }
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if(view==null)
        {
            imageView= new ImageView(activity);
            imageView.setLayoutParams(new GridView.LayoutParams(540,810));
        }
        else
        {
            imageView=(ImageView)view;
        }
        Picasso.with(activity).load(MoviePoster[i]).into(imageView);
        return imageView;
    }
}