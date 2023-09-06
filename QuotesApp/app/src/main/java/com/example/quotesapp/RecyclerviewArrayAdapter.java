package com.example.quotesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerviewArrayAdapter extends RecyclerView.Adapter<RecyclerviewArrayAdapter.MyViewHolder> {

    MainActivity mainActivity;
    ArrayList<Modal> arrayList;
    QuotesCategoryInterface quotesCategoryInterface;
    public RecyclerviewArrayAdapter(MainActivity mainActivity, ArrayList<Modal> arrayList, QuotesCategoryInterface quotesCategoryInterface) {

        this.mainActivity = mainActivity;
        this.arrayList = arrayList;
        this.quotesCategoryInterface = quotesCategoryInterface;

    }

    @NonNull
    @Override
    public RecyclerviewArrayAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.category_item_file,parent, false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewArrayAdapter.MyViewHolder holder, int position) {

        int i = position;

        holder.txt.setText(arrayList.get(i).QuotesName);
        holder.img.setImageResource(arrayList.get(i).QuotesImg);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                quotesCategoryInterface.QuotesClick(arrayList.get(i).QuotesName);

            }
        });

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txt;
        ImageView img;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.txt);
            img = itemView.findViewById(R.id.img);


        }
    }
}
