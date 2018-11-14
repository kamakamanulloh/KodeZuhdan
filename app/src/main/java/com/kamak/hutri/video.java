package com.kamak.hutri;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    private VideoView videoV;
    String activity,title;
    TextView txtv;
    TextView txtjudul;
    Button btnkuis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        txtv=(TextView)findViewById(R.id.textView2);
        activity=getIntent().getStringExtra("activity");
        title=getIntent().getStringExtra("title");

        actionBar.setTitle(title);
        txtjudul=(TextView)findViewById(R.id.txtjudul);
        txtjudul.setText(title);
        videoV=(VideoView)findViewById(R.id.videoView2);
        btnkuis=(Button)findViewById(R.id.btnkuis);
        btnkuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(video.this,quis.class);
                startActivity(i);
            }
        });
        if(activity.equals("portugis")){
            txtv.setText(R.string.portugis);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.portugis));
            videoV.setMediaController(new MediaController(this));
            videoV.start();



        }
        else if(activity.equals("belanda")){
            txtv.setText(R.string.Belanda);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.belanda));
            videoV.setMediaController(new MediaController(this));
            videoV.start();




        }

        else if(activity.equals("inggris")){
            txtv.setText(R.string.inggris);


            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.inggris));
            videoV.setMediaController(new MediaController(this));
            videoV.start();



        }

        else if(activity.equals("jepang")){
            txtv.setText(R.string.jepang);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jepang));
            videoV.setMediaController(new MediaController(this));
            videoV.start();


        }

        else if(activity.equals("hiroshima")){
            txtv.setText(R.string.bom);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bom));
            videoV.setMediaController(new MediaController(this));
            videoV.start();


        }

        else if(activity.equals("rengasdengklok")){
            txtv.setText(R.string.rengasdengklok);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rengasdengklok));
            videoV.setMediaController(new MediaController(this));
            videoV.start();


        }





        else if(activity.equals("proklamasi")){
            txtv.setText(R.string.proklamasi);

            videoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.proklamasi));
            videoV.setMediaController(new MediaController(this));
            videoV.start();


        }


    }
}
