package com.example.asuandroid.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asuandroid.R;

/**
 * Created by GIGAMOLE on 8/18/16.
 */
public class Utils {

    public static void setupItem(final View view, final LibraryObject libraryObject) {
        final TextView txt = (TextView) view.findViewById(R.id.txt_item);
        txt.setText(libraryObject.getTitle());

        final ImageView img = (ImageView) view.findViewById(R.id.img_item);
        img.setImageDrawable(libraryObject.getRes());
    }

    public static class LibraryObject {

        private String mTitle;
        private Drawable mRes;

        public LibraryObject(final Drawable res, final String title) {
            mRes = res;
            mTitle = title;
        }

        public String getTitle() {
            return mTitle;
        }

        public void setTitle(final String title) {
            mTitle = title;
        }

        public Drawable getRes() {
            return mRes;
        }

        public void setRes(final Drawable res) {
            mRes = res;
        }


    }
}
