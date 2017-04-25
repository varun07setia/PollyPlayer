package com.example.varun.pollyplayer;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Loginpage extends AppCompatActivity {
    TextView forget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        forget=(TextView)findViewById(R.id.textView4);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog d=new Dialog(Loginpage.this);
                d.setTitle("Forget Password");
                d.setContentView(R.layout.forgetpassword);
                d.show();
            }
        });
    }
}
