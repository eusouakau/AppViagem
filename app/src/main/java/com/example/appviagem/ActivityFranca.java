package com.example.appviagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityFranca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franca);
    }

    public void compartilharDetalhes(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String corpo = "Essa foi muma viagem que eu fiz! Venha compartilhar suas viagens também!";
        String detalhes = "Detalhes da viagem";
        intent.putExtra(Intent.EXTRA_SUBJECT, detalhes);
        intent.putExtra(Intent.EXTRA_TEXT, corpo);
        startActivity(Intent.createChooser(intent, "Compartilhar viagem"));
    }
}