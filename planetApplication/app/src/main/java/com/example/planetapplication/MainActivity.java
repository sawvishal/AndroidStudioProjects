package com.example.planetapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<planet> planetArrayList;
    private static myCustomAdapter adapter;

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

        //1- AdapterView : a ListView
        listview = findViewById(R.id.listView);

        //2- data source: ArrayList
        planetArrayList = new ArrayList<>();

        planet planet1 = new planet(R.drawable.earth, "Earth","1");
        planet planet2 = new planet(R.drawable.mercury, "Mercury","0");
        planet planet3 = new planet(R.drawable.venus, "Venus","0");
        planet planet4 = new planet(R.drawable.mars, "Mars","2 moons");
        planet planet5 = new planet(R.drawable.jupiter, "Jupiter","79 moons");
        planet planet6 = new planet(R.drawable.saturn, "Saturn","83 moons");
        planet planet7 = new planet(R.drawable.uranus, "Uranus","27");
        planet planet8 = new planet(R.drawable.neptune, "Neptune","14 moons");
        planet planet9 = new planet(R.drawable.pluto, "Pluto","0 moons");

        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);
        planetArrayList.add(planet9);

        //Adapter:
        adapter = new myCustomAdapter(getApplicationContext(), planetArrayList);
        listview.setAdapter(adapter);

        //Handling Click Events

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                                                Toast.makeText(MainActivity.this, "planet Name :" +adapter.getItem(position).getPlanetName(),
                                                        Toast.LENGTH_SHORT).show();
                                            }
                                        }
        );

    }
}