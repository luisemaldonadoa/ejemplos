package com.example.luisenrique.cuadrodialogo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button boton;
    Context context=this;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        boton.setOnClickListener(new View.OnClickListener() {
            String respuesta="";
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage("Mensaje")
                .setCancelable(false)
                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //lo que quieras hacer cuando si
                        respuesta="Si";
                        textView.setText(respuesta);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        respuesta = "No";
                        textView.setText(respuesta);
                        //lo que quieras hacer cuando no
                    }
                });

                
                AlertDialog alertDialog=alertDialogBuilder.create();
                alertDialog.show();
            }
        });

    }//ciere on create
}
