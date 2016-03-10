package com.example.luisenrique.abrirotraactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    EditText eTextNum;
    EditText eTextPassword;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button);
        eTextNum=(EditText)findViewById(R.id.etPhone);
        eTextPassword=(EditText)findViewById(R.id.etPassword);
        textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button:
                Intent intent=new Intent(this,ValidateLoginAct.class);
                String tel=eTextNum.getText().toString();
                String pass=eTextPassword.getText().toString();
                intent.putExtra("tel",tel);
                intent.putExtra("pass",pass);
                startActivity(intent);
                break;
            default:
                break;

        }
    }
}
