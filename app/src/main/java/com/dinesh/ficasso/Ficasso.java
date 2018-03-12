package com.dinesh.ficasso;

import android.widget.ImageView;

/**
 * Created by DPogula on 3/8/2018.
 */

public class Ficasso {

    private static Ficasso ourInstance = new Ficasso();

    public  static int load;
    public  int defaultImage;



    public  static Ficasso load(int targetImage) {
        load = targetImage;
        return ourInstance;
    }



    public Ficasso defaultImage(int imageID) {
            defaultImage = imageID;
            return ourInstance;
    }



    public Ficasso into(ImageView intoImage) {


        if (load == 0){
            intoImage.setImageResource(defaultImage);
        } else {
            intoImage.setImageResource(load);
        }

        return ourInstance;
    }

}

