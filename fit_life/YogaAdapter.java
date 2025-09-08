package com.example.fit_life;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class YogaAdapter extends RecyclerView.Adapter<YogaAdapter.ViewHolder> {
    private List<YogaPose> yogaList;
    private Context context;

    // Constructor
    public YogaAdapter(List<YogaPose> yogaList, Context context) {
        this.yogaList = yogaList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_yoga, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        YogaPose yoga = yogaList.get(position);

        // Set the short description in the list
        holder.yogaName.setText(yoga.getName());
        holder.yogaImage.setImageResource(yoga.getImageResource()); // ✅ Now works correctly!
        holder.yogaShortDescription.setText(yoga.getShortDescription());

        // Click Event to Open Yoga Details Activity
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, YogaDetailActivity.class);
            intent.putExtra("name", yoga.getName());
            intent.putExtra("description", yoga.getFullDescription()); // Send full description
            intent.putExtra("image", yoga.getImageResource());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return yogaList != null ? yogaList.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView yogaName, yogaShortDescription;
        ImageView yogaImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            yogaName = itemView.findViewById(R.id.yoga_name);
            yogaImage = itemView.findViewById(R.id.yoga_image);
            yogaShortDescription = itemView.findViewById(R.id.yoga_short_description); // Make sure this ID exists in your XML
        }
    }
}
