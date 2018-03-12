package com.dinesh.ficasso;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by DPogula on 3/8/2018.
 */

public class Ficasso {

    public static Ficasso ourInstance = null;

    public static int load;
    public static  int defaultImage;



    public static ImageView into;


    public static Ficasso getInstance() {
        return ourInstance;
    }


    public Ficasso with(Context context){
        return this.with(context);
    }

    public static int getLoad() {
        return load;
    }

    public static void load(int imageID) {
        Ficasso.load = imageID;
    }


    public static int getDefaultImage() {
        return defaultImage;
    }

    public static void defaultImage(int defaultImage) {
            Ficasso.defaultImage = defaultImage;
    }



    public static void into(ImageView into) {
        Ficasso.into = into;

        if(getLoad() != 0) {
            Ficasso.into.setImageResource(getLoad());
        } else {
            Ficasso.into.setImageResource(getDefaultImage());
        }

    }



}

