package uz.ithelp.varatsion;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {


    Context context;
    ArrayList<Model> modelArrayList;

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_recycler_grid, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {


        holder.textView.setText(modelArrayList.get(position).getName());
        holder.imageView.setImageResource(modelArrayList.get(position).getImg());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "" + modelArrayList.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();

                if (modelArrayList.get(holder.getAdapterPosition()).getUrl().startsWith("file") ){
                    Intent intent = new Intent(context, MainActivity2.class);
                    intent.putExtra("data", modelArrayList.get(holder.getAdapterPosition()).getUrl());
                    context.startActivity(intent);
                }
                else {
                    Intent intent = new Intent(context, MainActivity3.class);
                    intent.putExtra("data", modelArrayList.get(holder.getAdapterPosition()).getUrl());
                    context.startActivity(intent);
                }




            }
        });

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {


        TextView textView;
        ImageView imageView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageViewImage);
            textView = itemView.findViewById(R.id.textViewImage);

        }
    }
}
