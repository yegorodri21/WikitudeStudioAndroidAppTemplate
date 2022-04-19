package com.wikitude.wikitudestudioandroidapptemplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InstitucionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class InstitucionFragment extends Fragment {


    Button btnCamera;
    //SE DEBE GENERAR SI O SI VIEW PARA HACER PUENTE
    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_institucion, container, false);
        btnCamera = vista.findViewById(R.id.btnCamera);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CAMBIAR DE FRAGMENTO A OTRO FRAGMENTO
// Crear fragmento de tu clase
                Fragment fragment = new RuntimePermissionRequestActivity();
// Obtener el administrador de fragmentos a través de la actividad
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
// Definir una transacción
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
// Remplazar el contenido principal por el fragmento
                fragmentTransaction.replace(R.id.Institucion, fragment);
                fragmentTransaction.addToBackStack(null);
// Cambiar
                fragmentTransaction.commit();
            }
        });
        return vista;

    }

}