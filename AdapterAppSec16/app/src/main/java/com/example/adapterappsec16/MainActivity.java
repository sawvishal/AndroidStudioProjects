package com.example.adapterappsec16;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
     ListView listView;

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

        listView = findViewById(R.id.listView);

          //Data source: String Array
          String[] countries = {"USA","Germany","India","Pakistan","Russia"};


           //Adapter: acts as a bridge between the
           //         'data source' and the 'adapterView'

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                 android.R.layout.simple_list_item_1,
                countries
        );

        //Link listview with the Adapter
        listView.setAdapter(adapter);

    }
}