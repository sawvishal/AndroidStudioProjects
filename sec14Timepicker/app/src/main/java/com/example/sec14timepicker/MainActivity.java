package com.example.sec14timepicker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    DatePicker datePicker;
    Button button;

    @SuppressLint("NewApi")
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

        timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {

                //Handle time change
                Toast.makeText(MainActivity.this,
                        "Hour "+i +   " min"+i1,
                        Toast.LENGTH_SHORT).show();
            }
        });

        datePicker = findViewById(R.id.datePicker);
        button = findViewById(R.id.button);

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 String day = "day"+ datePicker.getDayOfMonth();
                 String month = "month"+ (datePicker.getMonth()+1);
                 String year = "year"+ datePicker.getYear();


                 Toast.makeText(MainActivity.this,
                         day+" "+ month+" "+ year+" ",
                         Toast.LENGTH_SHORT).show();
            }
        });
    }

}