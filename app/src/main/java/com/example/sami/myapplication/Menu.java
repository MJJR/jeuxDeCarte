package com.example.sami.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.view.View;
import android.widget.Button;

/**
 * Created by sami on 17/10/15.
 */
public class Menu extends Activity {
    private Button buttonClassemnt;
    private Button buttonJouer;
  private  Button buttonEntrainemnt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClassemnt=(Button)findViewById(R.id.btnClassement);
        buttonJouer=(Button)findViewById(R.id.btnJouer);
        buttonEntrainemnt=(Button)findViewById(R.id.btnModeEntrainement);

    buttonJouer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(Menu.this, Authentification.class);
            startActivity(intent);

        }

    });
        buttonClassemnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Classement.class);
            }
        });
           buttonEntrainemnt.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent it=new Intent(Menu.this,Entrainement.class);
               }
           });
    }


}

