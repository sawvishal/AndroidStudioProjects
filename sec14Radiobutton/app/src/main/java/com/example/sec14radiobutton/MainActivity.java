package com.example.sec14radiobutton;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(MainActivity.this,
                        "You select"+radioButton.getText().toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });


        spinner = findViewById(R.id.spinner);

        //Data source:
        String[] courses = {"C++","Java","Kotlin","Python"};

        //ArrayAdapter: used to populate the 'spinner' with
        //              items from a string array resource.

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                  android.R.layout.simple_list_item_1,
                  courses
        );

       // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}