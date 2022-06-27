package com.example.androidtutorialsbynerob.GlideNetworkImage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.androidtutorialsbynerob.R;

public class GlideNetworkImage extends AppCompatActivity {

    ImageView glideImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_network_image);

        glideImage=findViewById(R.id.glideImage);
        Glide.with(this).load("https://www.planetware.com/wpimages/2020/02/france-in-pictures-beautiful-places-to-photograph-eiffel-tower.jpg").into(glideImage);
    }
}