package com.example.myapplication31;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class elementAdapter extends RecyclerView.Adapter<elementAdapter.MyViewHolder> {
    private final plantinterface plantinterface;

    Context context;
    ArrayList<plantModel> plantModelIs;

    public elementAdapter(MainActivity context, ArrayList<plantModel> plantModelIs, plantinterface plantinterface){
        this.context = context;
        this.plantModelIs = plantModelIs;
        this.plantinterface = plantinterface;
    }

    @NonNull
    @Override
    public elementAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //this is where you inflate the layout(giving a look to our rows.)
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.elementdesign,parent, false);
        return new elementAdapter.MyViewHolder(view,plantinterface);
    }

    @Override
    public void onBindViewHolder(@NonNull elementAdapter.MyViewHolder holder, int position) {
        //assigning values to the views we created in the layout.xml layout file
        //based on the position of the recycler view
        holder.nameView.setText(plantModelIs.get(position).getPlantName());
        holder.scView.setText(plantModelIs.get(position).getPlantScName());



    }

    @Override
    public int getItemCount() {
        //the recycler view just wants to know the number of items you want displayed
        return plantModelIs.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        //grabbing the view from our layout.xml layout file
        //kinda like in the onCreate method


        TextView nameView, scView;

        public MyViewHolder(@NonNull View itemView, plantinterface plantinterface) {
            super(itemView);

            nameView = itemView.findViewById(R.id.textView);
            scView = itemView.findViewById(R.id.textview2);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (plantinterface != null) {
                        int pos = getAdapterPosition();
                        if (pos != RecyclerView.NO_POSITION) {
                            plantinterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }

}
