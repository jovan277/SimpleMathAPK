package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class hitung extends AppCompatActivity {
    EditText edithargarumah,editwaktupinjaman,editbungapinjaman,edituangmuka,plafonpinjaman,totalangsuran,angsuranperbulan,pendapatanbulanan,biayaprovisidanadmin;
    Button buttonmulaihitung,buttonkembali;
    Integer vhargarumah;
    Integer vwaktupinjaman;
    Integer vbungapinjaman;
    Integer vuangmuka;
    Integer vplafonpinjaman;
    double vtotalangsuran;
    Integer vangsuranperbulan;
    Integer vpendapatanbulanan;
    Integer vbiayaprovisidanadmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung);

        edithargarumah = (EditText)findViewById(R.id.edithargarumah);
        editwaktupinjaman = (EditText)findViewById(R.id.editwaktupinjaman);
        editbungapinjaman = (EditText)findViewById(R.id.editbungapinjaman);
        edituangmuka = (EditText)findViewById(R.id.edituangmuka);
        plafonpinjaman = (EditText)findViewById(R.id.plafonpinjaman);
        totalangsuran = (EditText)findViewById(R.id.totalangsuran);
        angsuranperbulan = (EditText)findViewById(R.id.angsuranperbulan);
        pendapatanbulanan = (EditText)findViewById(R.id.pendapatanbulanan);
        biayaprovisidanadmin = (EditText)findViewById(R.id.biayaprovisidanadmin);
        buttonmulaihitung = (Button)findViewById(R.id.buttonmulaihitung);
        buttonkembali = (Button)findViewById(R.id.buttonkembali);


    }

    public_void_mulaihitung(View view) {
        vhargarumah = Integer.parseInt(edithargarumah.getText().toString());
        vwaktupinjaman = Integer.parseInt(editwaktupinjaman.getText().toString());
        vbungapinjaman = Integer.parseInt(editbungapinjaman.getText().toString());
        vuangmuka = Integer.parseInt(edituangmuka.getText().toString());
        vplafonpinjaman = Integer.parseInt(plafonpinjaman.getText().toString());
        vtotalangsuran = Integer.parseInt(totalangsuran.getText().toString());
        vangsuranperbulan = Integer.parseInt(angsuranperbulan.getText().toString());
        vpendapatanbulanan = Integer.parseInt(pendapatanbulanan.getText().toString());
        vbiayaprovisidanadmin = Integer.parseInt(biayaprovisidanadmin.getText().toString());


        vplafonpinjaman = vhargarumah - vuangmuka;
        vtotalangsuran = vplafonpinjaman * ((vbungapinjaman* 0.01*12)/(vwaktupinjaman*12));
        vangsuranperbulan = vtotalangsuran / (vwaktupinjaman/12);
        vpendapatanbulanan = (vhargarumah/(vwaktupinjaman*12)+(vbungapinjaman*0.01*12)-vuangmuka) 0.3;
        vbiayaprovisidanadmin = (vplafonpinjaman *0.01) "dan" (vplafonpinjaman*0.001);

        edithargarumah.setText(""+vhargarumah);
        editwaktupinjaman.setText(""+vwaktupinjaman);
        editbungapinjaman.setText(""+vbungapinjaman);
        edituangmuka.setText(""+vuangmuka);
        plafonpinjaman.setText(""+vplafonpinjaman);
        totalangsuran.setText(""+vtotalangsuran);
        angsuranperbulan.setText(""+vangsuranperbulan);
        pendapatanbulanan.setText(""+vpendapatanbulanan);
        biayaprovisidanadmin.setText(""+vbiayaprovisidanadmin);


    }
}