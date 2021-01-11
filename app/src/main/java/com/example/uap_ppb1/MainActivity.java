package com.example.uap_ppb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int tinggi = 0;
    int hasil = 0;

    TextView text_hasil;
    Button btn_hitung;
    EditText text_tinggi,edit_nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_nama = (EditText) findViewById(R.id.edit_nama);
        text_tinggi = (EditText) findViewById(R.id.edit_tinggi);
        text_hasil = (TextView) findViewById(R.id.text_hasil);
        btn_hitung = (Button) findViewById(R.id.btn_hitung);
    }

    public void hitung (View view){
        tinggi = Integer.parseInt((text_tinggi.getText().toString()));
        hasil = (tinggi-110);
        text_hasil.setText("Saudara " + edit_nama.getText() +
                "\n" + "Berat badan ideal Anda adalah " + hasil + " kg.");
    }
}