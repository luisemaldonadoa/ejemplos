package com.example.luisenrique.abrirotraactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ValidateLoginAct extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_login);
        textView=(TextView)findViewById(R.id.tvReceptor);
        Intent intent=getIntent();

        Bundle bundle =intent.getExtras();
        if(bundle!=null){
            String tel=bundle.get("tel").toString();
            String password=bundle.get("pass").toString();
            textView.setText(tel + password);
        }

    }
}
