package com.example.volumecalculator;

import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1- AdapterView: GridView
    GridView gridView;

    // 2- Data Source: ArrayList;
    Arraylist<Shape> shapeArraylist;

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

        gridView = findViewById(R.id.gridView);
        shapeArraylist = new Arraylist<>();

        Shape s1 = new Shape(R.drawable.cylinder,"Cylinder");
        Shape s2 = new Shape(R.drawable.square,"Square");
        Shape s3 = new Shape(R.drawable.sphare,"Sphare");
        Shape s4 = new Shape(R.drawable.rectanglecube,"Rectangle");

    }
}