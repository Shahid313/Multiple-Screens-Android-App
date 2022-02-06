package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class OtherActivity2 extends AppCompatActivity {

    TextView UserInfo;
    Button GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other2);

        UserInfo = (TextView)findViewById(R.id.userData);
        GoBack = (Button)findViewById(R.id.goBack);

        Bundle getData = getIntent().getExtras();
        String result = getData.getString("userInfo");
        UserInfo.setText(String.valueOf(result));

        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}