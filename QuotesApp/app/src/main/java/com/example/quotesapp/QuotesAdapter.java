package com.example.quotesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.MyViewHolder> {

    QuotesActivity quotesActivity;
    ArrayList<ModalClassQuotes> quoteslist;
    public QuotesAdapter(QuotesActivity quotesActivity, ArrayList<ModalClassQuotes> quoteslist) {

        this.quotesActivity = quotesActivity;
        this.quoteslist = quoteslist;


    }

    @NonNull
    @Override
    public QuotesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(quotesActivity).inflate(R.layout.quotes_item_file,parent,false);
        MyViewHolder m = new MyViewHolder(view);
        return m;
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesAdapter.MyViewHolder holder, int position) {

        holder.txtQuotes.setText(quoteslist.get(position).Quotes);


    }

    @Override
    public int getItemCount() {
        return quoteslist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtQuotes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtQuotes = itemView.findViewById(R.id.txtQuotes);
        }
    }
}
