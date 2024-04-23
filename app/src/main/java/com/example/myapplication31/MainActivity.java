package com.example.myapplication31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity implements plantinterface{


    ArrayList<plantModel> plantmodelIs = new ArrayList<>();

    int[] image = {R.drawable.sawkendha,R.drawable.puswanna,R.drawable.malabulath,R.drawable.ekaaweriya,
                   R.drawable.galdemata,R.drawable.mahaaniththa,R.drawable.katuwalbatu,R.drawable.katupila,
                   R.drawable.ranawara,R.drawable.thippili,R.drawable.kuppameniya,R.drawable.akkapana,
                   R.drawable.aththikka,R.drawable.binpol,R.drawable.binthal,R.drawable.buthsarana,R.drawable.gasniwithiya,
                   R.drawable.walgotukola};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);



        setUpPlantModelIs();
        elementAdapter adapter = new elementAdapter(this,plantmodelIs, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpPlantModelIs(){
        String[] plantName = getResources().getStringArray(R.array.recyclerview_element_name);
        String[] plantScName = getResources().getStringArray(R.array.recyclerview_element_sign);
        String[] plantDescription = getResources().getStringArray(R.array.plant_description);



        for (int i = 0; i<plantName.length;i++){

            plantmodelIs.add(new plantModel(plantName[i],plantScName[i],image[i],plantDescription[i]));
        }
    }

    @Override
    public void onItemClick(int position){

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra("IMAGE",plantmodelIs.get(position).getImage());
        intent.putExtra("DESCRIPTION",plantmodelIs.get(position).getDescription());

        startActivity(intent);


    }
}
