package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    Button ContinueButton;
    EditText Name, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContinueButton = (Button)findViewById(R.id.continueBtn);
        Name = (EditText)findViewById(R.id.name);
        Password = (EditText)findViewById(R.id.password);

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameValue = Name.getText().toString();
                String passwordValue = Password.getText().toString();

                if(nameValue.equals(String.valueOf(""))){
                    Name.setError("Please Input Text");
                }
                else if(passwordValue.equals(String.valueOf(""))){
                    Password.setError("Please input text");
                }
                else{
                    String userInfo = "Name: "+nameValue + "Password: "+passwordValue;
                    Intent intent = new Intent(getApplicationContext(), OtherActivity2.class);
                    intent.putExtra("userInfo",userInfo);
                    startActivity(intent);
                }
            }
        });


    }
}