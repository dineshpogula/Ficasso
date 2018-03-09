package com.dinesh.ficasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

/**
 * Created by DPogula on 3/8/2018.
 */

public class Ficasso {

    public static Ficasso ourInstance = null;
    final Bitmap.Config defaultConfigBitmap;



    public static Ficasso getInstance() {
        return ourInstance;
    }

    private Ficasso(Bitmap.Config defaultConfigBitmap) {
        this.defaultConfigBitmap =defaultConfigBitmap;

    }


    public Ficasso error(int errorDrawable){
        if (errorDrawable == 0) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        return this.error(errorDrawable);
    }

    public Ficasso with(Context context){
        return this.with(context);
    }


    public Ficasso load(String path){
        if (path == null) {
           return new Ficasso(defaultConfigBitmap);
        }
        if (path.trim().length() == 0) {
            throw new IllegalArgumentException("Path must not be empty.");
        }
        return this.load(String.valueOf(Uri.parse(path)));
    }

    public RequestResponse load(int  resourceID){
        if (resourceID == 0) {
            throw new IllegalArgumentException("Path must not be empty.");
        }
        return new RequestResponse(this, null, resourceID);
    }

    public Ficasso into(ImageView imageView){

        return this.into(imageView);
    }

}

