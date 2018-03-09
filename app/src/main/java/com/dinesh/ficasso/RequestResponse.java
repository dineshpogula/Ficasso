package com.dinesh.ficasso;

import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by DPogula on 3/8/2018.
 */

public class RequestResponse {
    private final Ficasso ficasso;
    private final Request.Builder data;


    public RequestResponse(Ficasso ficasso, Uri uri, int reourceID){

        this.ficasso = ficasso;
        this.data = new Request.Builder(uri, reourceID, ficasso.defaultConfigBitmap);

    }


    public static final class Request {
        public Uri uri;
        public int resourceID;
        public final Bitmap.Config config;
        private  Request(Uri uri, int resourceID, Bitmap.Config config){
           this.uri = uri;
           this.resourceID = resourceID;
           this.config = config;
        }

        public static class Builder {
            private Uri uri;
            private int resourceId;
            private final Bitmap.Config config;

            Builder(Uri uri, int resourceId, Bitmap.Config bitmapConfig) {
                this.uri = uri;
                this.resourceId = resourceId;
                this.config = bitmapConfig;
            }
        }
    }
}
