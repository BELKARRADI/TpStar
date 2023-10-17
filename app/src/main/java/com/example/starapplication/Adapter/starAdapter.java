package com.example.starapplication.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.starapplication.R;
import com.example.starapplication.entities.Star;
import com.squareup.picasso.Picasso;


import java.util.List;

public class starAdapter extends RecyclerView.Adapter<starAdapter.StarViewHolder> {
    private static final String TAG = "StarAdapter";
    private List<Star> stars;
    private Context context;;
    public starAdapter(Context context, List<Star> stars) {
        this.stars = stars;
        this.context = context;
    }
    @NonNull
    @Override
    public StarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.starlayout,
                viewGroup, false);
        return new StarViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull StarViewHolder starViewHolder, int i) {
        Log.d(TAG, "onBindView call ! " + i);

        // Use Picasso to load the image
        Picasso.with(context)
                .load(stars.get(i).getImg())
                .resize(100, 100)
                .into(starViewHolder.img);

        starViewHolder.name.setText(stars.get(i).getName().toUpperCase());
        starViewHolder.stars.setRating(stars.get(i).getStar());
        starViewHolder.idss.setText(String.valueOf(stars.get(i).getId()));

    }

    @Override
    public int getItemCount() {
        return stars.size();
    }
    public class StarViewHolder extends RecyclerView.ViewHolder {
        TextView idss;
        ImageView img;
        TextView name;
        RatingBar stars;
        RelativeLayout parent;
        public StarViewHolder(@NonNull View itemView) {
            super(itemView);
            idss = itemView.findViewById(R.id.ids);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            stars = itemView.findViewById(R.id.stars);
        }
    }
}