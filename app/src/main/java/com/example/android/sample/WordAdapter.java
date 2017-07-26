package com.example.android.sample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by Dell on 21-07-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();


    public WordAdapter(Activity context, ArrayList<Word> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentAndroidFlavor = getItem(position);

        ImageView ProductImage = (ImageView) listItemView.findViewById(R.id.image);

        Picasso.with(getContext()).load(currentAndroidFlavor.getmImageId()).into(ProductImage);

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentAndroidFlavor.getmName());

        return listItemView;
    }

}
