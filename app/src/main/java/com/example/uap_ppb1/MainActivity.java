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

    TextView textHasil;
    Button buttonHitung;
    EditText textTinggi,editNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama (EditText) findViewById(R.id.edit_nama);
        textTinggi : (EditText) findViewById(R.id.edit_tinggi);
        textHasil = (TextView) findViewById(R.id.text_hasil):
        buttonHitung = (Button findViewById(R.id.btn_hitung);
    }

    public void hitung (View view){
        tinggi = Integer.parseInt((textTinggi.getText().toString()));
        hasil = (tinggi-110);
        textHasil.setText("Saudara " + editNama.getText() +
                "\n" + "Berat badan ideal Anda adalah " + hasil + " kg.")
    }
}