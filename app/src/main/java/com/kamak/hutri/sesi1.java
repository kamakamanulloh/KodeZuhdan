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
public class sesi1 extends Fragment {
    public static final String judul="Masa penjajahan oleh Portugis (1511-1602 M)";


    public sesi1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview=inflater.inflate(R.layout.fragment_sesi1, container, false);
        Button btnpilih=(Button)rootview.findViewById(R.id.button1);
        ImageView img=(ImageView)rootview.findViewById(R.id.imageView);
        img.setImageResource(R.drawable.portugis);
        TextView txtjudul=(TextView)rootview.findViewById(R.id.textView);
        txtjudul.setText(judul);

        btnpilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),video.class);
                i.putExtra("title",judul);
                i.putExtra("activity","portugis");
                startActivity(i);
                //

            }
        });
        return rootview;
    }

}
