package com.example.nathali.tutorcontactapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class LoginTutor extends AppCompatActivity {

    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_tutor);

        Intent i = getIntent();

        ImageAdapter adapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[0]);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TutorContact");
    }


    public void autenticar(View v) {
        Intent intent = new Intent(context, PantallaPrincipalTutor.class);
        startActivity(intent);
    }

    public void registrar(View v) {
        Intent intent = new Intent(context, RegistroTutor.class);
        startActivity(intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.salir:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
