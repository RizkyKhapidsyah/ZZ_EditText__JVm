package com.rk.et;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ET_Contoh_IDJAVA;
    TextView TV_Contoh_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_Contoh_IDJAVA = findViewById(R.id.ET_Contoh_IDXML);
        TV_Contoh_IDJAVA = findViewById(R.id.TV_Contoh_IDXML);

        ET_Contoh_IDJAVA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                /* Biarkan Kosong */
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /* Biarkan Kosong */
            }

            @Override
            public void afterTextChanged(Editable s) {
                String Nama = ET_Contoh_IDJAVA.getText().toString();
                TV_Contoh_IDJAVA.setText("Hai " + Nama);
            }
        });

    }
}
