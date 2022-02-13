package com.example.usermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 TextView loginlink;
 EditText name,email,password;
 Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        name=findViewById(R.id.etname);
        email=findViewById(R.id.etemail);
        password=findViewById(R.id.etpassword);
        register=findViewById(R.id.btnregister);
        loginlink=findViewById(R.id.loginlink);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnregister:
                Toast.makeText(this, "resgter", Toast.LENGTH_SHORT).show();
                break;
            case R.id.loginlink:
                SwitchonLogin();

        }
    }
    private void SwitchonLogin(){
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}