package com.dinesh.ficasso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);


        Ficasso.load(0).defaultImage(R.drawable.natureimage1).into(imageView);

    }
}
