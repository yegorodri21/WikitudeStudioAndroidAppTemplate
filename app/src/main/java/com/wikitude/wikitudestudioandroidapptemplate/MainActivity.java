package com.wikitude.wikitudestudioandroidapptemplate;

import android.app.Activity;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    //CREAMOS UN OBJETO DE LA BARRA DE NAVEGACION
    BottomNavigationView bottomNavigationView;

    //AQUI VA TODOS LOS FRAGMENTS y los inicializamos
    InicioFragment homeFragment = new InicioFragment();
    ServicesFragment servicesFragment = new ServicesFragment();
    InstitucionFragment institucionFragment = new InstitucionFragment();
    ContactosFragment contactosFragment = new ContactosFragment();

    RuntimePermissionRequestActivity cameraFragment = new RuntimePermissionRequestActivity();

    //BOTON ATRAS DE CAMARA:
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //OCULTAR ACTION BAR
        ActionBar actionbar = getSupportActionBar();
        actionbar.hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Inicio: getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;

                    case R.id.Servicios: getSupportFragmentManager().beginTransaction().replace(R.id.container, servicesFragment).commit();
                        return true;

                    case R.id.Institucion: getSupportFragmentManager().beginTransaction().replace(R.id.container, institucionFragment).commit();
                        return true;

                    case R.id.Contactos: getSupportFragmentManager().beginTransaction().replace(R.id.container, contactosFragment).commit();
                        return true;
                }
                return true;
            }
        });



    }




}