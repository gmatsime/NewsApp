package com.example.newsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.model.Results;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Results> articles;

    public Adapter(Context context,List<Results >results){
     this.context=context;
     this.articles=results;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {

        final Results res=articles.get(position);
        String url=res.getUrl();
        holder.newsTitle.setText(res.getTitle());
        holder.publishedDate.setText(res.getPublished_date());
        String imgUrl=res.getUrltoImage();

        Picasso.get().load(imgUrl).into((Target) holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,NewsDetails.class);
                intent.putExtra(url,res.getUrl());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView newsTitle,publishedDate;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            publishedDate=itemView.findViewById(R.id.publishedDate);
            newsTitle=itemView.findViewById(R.id.newsTitle);
            imageView=itemView.findViewById(R.id.image);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }



}
