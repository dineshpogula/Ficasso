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


        Ficasso.getInstance().load(R.drawable.natureimage5);
       // Picasso.with(this).load().into();

        /*mGridView = findViewById(R.id.gridView);
        Utils imageItems = new Utils();
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, imageItems.items);
        mGridView.setAdapter(customAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Image was selected", Toast.LENGTH_SHORT).show();
            }
        });
    }*/
    }
}
