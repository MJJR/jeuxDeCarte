package com.example.sami.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by sami on 25/10/15.
 */
public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText txtUserName = (EditText)findViewById(R.id.input_email);
        final EditText txtPassword = (EditText)findViewById(R.id.input_password);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String username = txtUserName.getText().toString();
                String password = txtPassword.getText().toString();
                try{
                    if(username.length() > 0 && password.length() >0)
                    {
                        DBUserAdapter dbUser = new DBUserAdapter(LoginActivity.this);
                        dbUser.open();

                        if(dbUser.Login(username, password))
                        {
                            Toast.makeText(LoginActivity.this, "Successfully Logged In", Toast.LENGTH_LONG).show();
                        }else{
                            Toast.makeText(LoginActivity.this,"Invalid Username/Password", Toast.LENGTH_LONG).show();
                        }
                        dbUser.close();
                    }

                }catch(Exception e)
                {
                    Toast.makeText(LoginActivity.this,e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
