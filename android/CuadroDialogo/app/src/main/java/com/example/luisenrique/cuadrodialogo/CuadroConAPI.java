package com.example.luisenrique.cuadrodialogo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class CuadroConAPI extends AppCompatActivity {
    Button boton;
    Context context=this;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadro_con_api);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        boton = (Button) findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        //final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                //alertDialogBuilder.setMessage("Mensaje");
                //String url = "http://httpbin.org/html";
                String url = "http://pruebasluis.260mb.net/api/api.php/user/1";
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                // Result
                                //System.out.println(response.substring(0,500));
                                System.out.println(response);
                                //textView.setText(response);
                                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                                alertDialogBuilder.setMessage(response);
                                AlertDialog alertDialog = alertDialogBuilder.create();
                                alertDialog.show();
                                //alertDialogBuilder.setMessage(response);

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // Error handling
                        System.out.println("Something went wrong!");
                        error.printStackTrace();
                    }
                });
                Volley.newRequestQueue(context).add(stringRequest);
                //alertDialogBuilder.setMessage("Mensaje")
                        /*.setCancelable(false)
                        .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //lo que quieras hacer cuando si
                                String respuesta = "";
                                respuesta = "Si";
                                String url = "http://httpbin.org/html";
                                textView.setText(respuesta);
                                // Request a string response
                                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                                        new Response.Listener<String>() {
                                            @Override
                                            public void onResponse(String response) {

                                                // Result
                                                //System.out.println(response.substring(0,500));
                                                System.out.println(response);

                                            }
                                        }, new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {

                                        // Error handling
                                        System.out.println("Something went wrong!");
                                        error.printStackTrace();

                                    }
                                });
                                // Add the request to the queue
                                //Volley.newRequestQueue(this).add(stringRequest);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //respuesta = "No";
                                textView.setText("No");
                                //lo que quieras hacer cuando no
                            }
                        });*/
                /*AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();*/
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
