package com.example.javaandrotestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showNameButton;
    private TextView nametextView;
    private EditText editNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showNameButton = findViewById(R.id.showNameButton);
        nametextView = findViewById(R.id.nameTextView);
        editNameEditText = findViewById(R.id.editTextEnterName);

        showNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredName = editNameEditText.getText().toString();
                if(!enteredName.isEmpty()){
                    editNameEditText.setText("");
                    nametextView.setText(enteredName);
                    nametextView.setTextColor(Color.CYAN);
                }
            }
        });


    }
}