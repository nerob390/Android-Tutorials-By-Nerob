package com.example.androidtutorialsbynerob.PiccasoNetworkImage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidtutorialsbynerob.R;
import com.squareup.picasso.Picasso;

public class PiccasoNetworkImage extends AppCompatActivity {
    ImageView piccasoImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piccaso_network_image);

        piccasoImage=findViewById(R.id.piccasoImage);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png").into(piccasoImage);

    }
}