package com.example.testone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextUsername = findViewById(R.id.editTextUsername);
        final EditText editTextContactNumber = findViewById(R.id.editTextContactNumber);
        final EditText editTextEmail = findViewById(R.id.editTextEmail);
        final TextView text_view = findViewById(R.id.text_view);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String contactNumber = editTextContactNumber.getText().toString();
                String email = editTextEmail.getText().toString();


                String displayText = "Username: " + username + "\nContact Number: " + contactNumber + "\nEmail: " + email;

                    text_view.setText(displayText);
            }
        });
    }
}
