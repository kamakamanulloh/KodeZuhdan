package com.kamak.hutri;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class sesi4 extends Fragment {
    public static final String judul="Masa penjajahan oleh Jepang (1942-1945 M)";


    public sesi4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.fragment_sesi1, container, false);

        ImageView img=(ImageView)rootview.findViewById(R.id.imageView);
        img.setImageResource(R.drawable.belanda);
        TextView teks=(TextView)rootview.findViewById(R.id.textView);
        teks.setText(judul);

        Button btnpilih=(Button)rootview.findViewById(R.id.button1);
        btnpilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),video.class);
                i.putExtra("title",judul);
                i.putExtra("activity","jepang");
                startActivity(i);
                //

            }
        });
        return rootview;
    }

}
