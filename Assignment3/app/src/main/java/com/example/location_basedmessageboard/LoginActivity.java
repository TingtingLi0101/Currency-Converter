package com.example.location_basedmessageboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Username;
    Button bntStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText) findViewById(R.id.userName);
        bntStart = (Button) findViewById(R.id.startButton);

        bntStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = Username.getText().toString().trim();
                Intent i = new Intent(LoginActivity.this, ShowActivity.class);
                i.putExtra("username", username);
                LoginActivity.this.startActivity(i);
            }
        });

    }
}
