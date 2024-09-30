package com.example.applicationform;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        val etName = findViewById<EditText>(R.id.etName)
                val etEmail = findViewById<EditText>(R.id.etEmail)
                val btnSubmit = findViewById<Button>(R.id.btnSubmit)

                btnSubmit.setOnClickListener {
            val name = etName.text.toString()
            val email = etEmail.text.toString()

            // Displaying a Toast message
            Toast.makeText(this, "Name: $name\nEmail: $email", Toast.LENGTH_LONG).show()
        }
    }
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText etName = findViewById(R.id.etName);
        EditText etEmail = findViewById(R.id.etEmail);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();

            // Displaying a Toast message
            Toast.makeText(MainActivity.this, "Name: " + name + "\nEmail: " + email, Toast.LENGTH_LONG).show();
        });
    }
}