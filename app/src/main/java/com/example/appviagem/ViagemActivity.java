package com.example.appviagem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ViagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
    }

    public void selecionarDestino(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.imageButtonBrasil:
                intent = new Intent(this, ActivityBrasil.class);
                startActivity(intent);
                break;
            case R.id.imageButtonArgentina:
                intent = new Intent(this, ActivityArgentina.class);
                startActivity(intent);
                break;
            case R.id.imageButtonFranca:
                intent = new Intent(this, ActivityFranca.class);
                startActivity(intent);
                break;
            case R.id.imageButtonJapao:
                intent = new Intent(this, ActivityJapao.class);
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }
}
