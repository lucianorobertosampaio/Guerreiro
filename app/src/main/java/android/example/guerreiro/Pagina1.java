package android.example.guerreiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Pagina1 extends AppCompatActivity {

    ImageView botaoProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina1);

        getWindow() .setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        botaoProximo = findViewById(R.id.proximo);

        botaoProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Pagina2 = new Intent(getApplicationContext(), Pagina2.class);

                startActivity(Pagina2);
            }

        });
    }

}

