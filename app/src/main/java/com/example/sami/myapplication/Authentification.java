package com.example.sami.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sami on 17/10/15.
 */
public class Authentification extends Activity {

    private Button login;
    private EditText textlogin;
    private EditText textpass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=(Button)findViewById(R.id.btn_login);
        textlogin=(EditText)findViewById(R.id.input_login);
        textpass=(EditText)findViewById(R.id.toolbar);
        login.setOnClickListener(new View.OnClickListener() {

                                     public void onClick(View v) {

                                         String log = textlogin.getText().toString();
                                         String password = textpass.getText().toString();
                                         if (log.compareToIgnoreCase("admin") == 0 && password.compareToIgnoreCase("pass") == 0) {
                                             Intent intent = new Intent(getApplicationContext(), Activity.class);
                                             startActivity(intent);
                                         }

                                     }

                                 }

        );
    }







}
