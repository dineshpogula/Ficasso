package com.dinesh.ficasso;

import android.widget.ImageView;

/**
 * Created by DPogula on 3/8/2018.
 */

public class Ficasso {

    public static Ficasso ourInstance = new Ficasso();

    public static int load;
    public static  int defaultImage;



    public static ImageView into;


    public static Ficasso getInstance() {
        return ourInstance;
    }


    public static int getLoad() {
        return load;
    }

    public Ficasso load(int imageID) {
        Ficasso.load = imageID;
        return ourInstance;
    }


    public static int getDefaultImage() {
        return defaultImage;
    }

    public Ficasso defaultImage(int defaultImage) {
            Ficasso.defaultImage = defaultImage;
            return ourInstance;
    }



    public Ficasso into(ImageView into) {
        Ficasso.into = into;

        if(getLoad() != 0) {
            Ficasso.into.setImageResource(getLoad());
        } else {
            Ficasso.into.setImageResource(getDefaultImage());
        }

        return ourInstance;
    }



}

