package com.kamak.hutri;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class quis extends AppCompatActivity {

    TextView mtvSkor, mtvSoal,number;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3;
    Button next;
    int skor=0;

    int x;
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quis);

        next=(Button)findViewById(R.id.btnok);
        mtvSoal = (TextView) findViewById(R.id.soal);
        mtvSkor = (TextView) findViewById(R.id.number);
        mrgPilihanJawaban=(RadioGroup)findViewById(R.id.radiogrup);

        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.j1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.j2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.j3);

        setKonten();
    }
    private void setKonten(){

        mrgPilihanJawaban.clearCheck();

        int tanya=getResources().getStringArray(R.array.tanya).length;


        if (x >= tanya) {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Hasil")
                    .setMessage("Nilai Kamu "+skor)

                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
            alert.show();
            mtvSkor.setText(String.valueOf(tanya)+"/"+String.valueOf(tanya));

        } else {
            //setting text dengan mengambil text dari method getter di kelas SoalPilihanGanda
            mtvSoal.setText(getResources().getStringArray(R.array.tanya)[x]);
            mrbPilihanJawaban1.setText(getResources().getStringArray(R.array.j1)[x]);
            mrbPilihanJawaban2.setText(getResources().getStringArray(R.array.j2)[x]);
            mrbPilihanJawaban3.setText(getResources().getStringArray(R.array.j3)[x]);
//            img1.setImageResource(soalPG.getPilihanJawaban1(x));
//            img2.setImageResource(soalPG.getPilihanJawaban2(x));
//            img3.setImageResource(soalPG.getPilihanJawaban3(x));
//            mrbPilihanJawaban4.setText(soalPG.getPilihanJawaban4(x));
            jawaban = getResources().getStringArray(R.array.sengbener)[x];


        }
        x++;
        mtvSkor.setText(String.valueOf(x)+"/"+String.valueOf(tanya));

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cekJawaban();
            }
        });
    }


    public void cekJawaban(){


        if(mrbPilihanJawaban1.isChecked()){ //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban

            if(mrbPilihanJawaban1.getText().toString().equals(jawaban)){
                skor = skor + 20;

                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{

                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban2.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban2.getText().toString().equals(jawaban)){
                skor = skor + 20;

                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{

                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(mrbPilihanJawaban3.isChecked()){
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if(mrbPilihanJawaban3.getText().toString().equals(jawaban)){
                skor = skor + 20;

                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            }else{

                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }
//        else if(mrbPilihanJawaban4.isChecked()){
//            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
//            if(mrbPilihanJawaban4.getText().toString().equals(jawaban)){
//                skor = skor + 10;
//                mtvSkor.setText(""+skor);	//mtvSkor diset nilainya = var skor
//                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
//                setKonten(); //update next konten
//            }else{
//                mtvSkor.setText(""+skor);
//                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
//                setKonten();
//            }
//        }

        else{
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

}
