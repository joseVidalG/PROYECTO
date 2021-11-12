package com.example.peliflix;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Peli_Recycle extends RecyclerView.Adapter<Peli_Recycle.MyViewHolder> {
    Context context;
    ArrayList<Model> models;


    //lista de matrices

    public Peli_Recycle(Context context, ArrayList<Model> models){
     this.context = context;
     this.models = models;
    }

    @NonNull
    @Override
    public Peli_Recycle.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //aspecto a las filas

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view_row,parent,false);
        //retornar el adaptador de las vistas
        return new Peli_Recycle.MyViewHolder(view);
    }


    //actualice datos
    @Override
    public void onBindViewHolder(@NonNull Peli_Recycle.MyViewHolder holder, int position) {

        holder.tvName.setText(models.get(position).getModelname());
        holder.tvlista.setText(models.get(position).getModeldescripcion());
        holder.tvletras.setText(models.get(position).getModelgenero());
        holder.imageView.setImageResource(models.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{
        //tomar las vistas
        //actualizar vistas

        ImageView imageView;
        TextView tvName, tvlista, tvletras;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            //id de imagen
            imageView= itemView.findViewById(R.id.imageView7);
            tvName=itemView.findViewById(R.id.textView13);
            tvlista=itemView.findViewById(R.id.textView12);
            tvletras=itemView.findViewById(R.id.textView14);

        }
    }

}
