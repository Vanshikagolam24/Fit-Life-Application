////package com.example.fit_life;
////
////import android.content.Context;
////import android.content.Intent;
////import android.view.LayoutInflater;
////import android.view.View;
////import android.view.ViewGroup;
////import android.widget.ImageView;
////import android.widget.TextView;
////import androidx.annotation.NonNull;
////import androidx.recyclerview.widget.RecyclerView;
////import java.util.List;
////
////public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ViewHolder> {
////    private Context context;
////    private List<ExerciseModel> exerciseList;
////
////    public ExerciseAdapter(Context context, List<ExerciseModel> exerciseList) {
////        this.context = context;
////        this.exerciseList = exerciseList;
////    }
////
////    @NonNull
////    @Override
////    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
////        View view = LayoutInflater.from(context).inflate(R.layout.item_exercise, parent, false);
////        return new ViewHolder(view);
////    }
////
////    @Override
////    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
////        ExerciseModel exercise = exerciseList.get(position);
////        holder.exerciseName.setText(exercise.getName());
////        holder.exerciseDesc.setText(exercise.getDescription());
////        holder.exerciseImage.setImageResource(exercise.getImage());
////
////        holder.itemView.setOnClickListener(v -> {
////            Intent intent = new Intent(context, ExerciseDetailActivity.class);
////            intent.putExtra("name", exercise.getName());
////            intent.putExtra("desc", exercise.getDescription());
////            intent.putExtra("image", exercise.getImage());
////            context.startActivity(intent);
////        });
////    }
////
////    @Override
////    public int getItemCount() {
////        return exerciseList.size();
////    }
////
////    public static class ViewHolder extends RecyclerView.ViewHolder {
////        TextView exerciseName, exerciseDesc;
////        ImageView exerciseImage;
////
////        public ViewHolder(@NonNull View itemView) {
////            super(itemView);
////            exerciseName = itemView.findViewById(R.id.exerciseName);
////            exerciseDesc = itemView.findViewById(R.id.exerciseDesc);
////            exerciseImage = itemView.findViewById(R.id.exerciseImage);
////        }
////    }
////}
//package com.example.fit_life;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.List;
//
//public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
//    private Context context;
//    private List<ExerciseModel> exerciseList;
//
//    public ExerciseAdapter(Context context, List<ExerciseModel> exerciseList) {
//        this.context = context;
//        this.exerciseList = exerciseList;
//    }
//
//    @NonNull
//    @Override
//    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.exercise_list_item, parent, false);
//        return new ExerciseViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
//        ExerciseModel exercise = exerciseList.get(position);
//        holder.textViewName.setText(exercise.getName());
//        holder.textViewDesc.setText(exercise.getDescription());
//        holder.imageView.setImageResource(exercise.getImageResId());
//
//        // Click to open Exercise Detail Activity
//        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, ExerciseDetailActivity.class);
//            intent.putExtra("name", exercise.getName());
//            intent.putExtra("description", exercise.getDescription());
//            intent.putExtra("image", exercise.getImageResId());
//            context.startActivity(intent);
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return exerciseList.size();
//    }
//
//    static class ExerciseViewHolder extends RecyclerView.ViewHolder {
//        TextView textViewName, textViewDesc;
//        ImageView imageView;
//
//        public ExerciseViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textViewName = itemView.findViewById(R.id.textViewName);
//            textViewDesc = itemView.findViewById(R.id.textViewDesc);
//            imageView = itemView.findViewById(R.id.imageView);
//        }
//    }
//}
package com.example.fit_life;

//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.List;
//
//public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
//    private Context context;
//    private List<ExerciseModel> exerciseList;
//
//    public ExerciseAdapter(Context context, List<ExerciseModel> exerciseList) {
//        this.context = context;
//        this.exerciseList = exerciseList;
//    }
//
//    @NonNull
//    @Override
//    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.exercise_list_item, parent, false);
//        return new ExerciseViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
//        ExerciseModel exercise = exerciseList.get(position);
//        holder.textViewName.setText(exercise.getName());
//        holder.textViewDesc.setText(exercise.getDescription());
//        holder.imageView.setImageResource(exercise.getImageResId());
//
//        // ✅ When clicked, open ExerciseDetailActivity
//        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, ExerciseDetailActivity.class);
//            intent.putExtra("name", exercise.getName());
//            intent.putExtra("description", exercise.getDescription());
//            intent.putExtra("image", exercise.getImageResId());
//            context.startActivity(intent);
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return exerciseList.size();
//    }
//
//    static class ExerciseViewHolder extends RecyclerView.ViewHolder {
//        TextView textViewName, textViewDesc;
//        ImageView imageView;
//
//        public ExerciseViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textViewName = itemView.findViewById(R.id.textViewName);
//            textViewDesc = itemView.findViewById(R.id.textViewDesc);
//            imageView = itemView.findViewById(R.id.imageView);
//        }
//    }
//}

//package com.example.fit_life;

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

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {
    private List<ExerciseModel> exerciseList;
    private Context context;

    public ExerciseAdapter(List<ExerciseModel> exerciseList, Context context) {
        this.exerciseList = exerciseList;
        this.context = context;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_exercise, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        ExerciseModel exercise = exerciseList.get(position);
        holder.name.setText(exercise.getName());
        holder.shortDescription.setText(exercise.getShortDescription());
        holder.image.setImageResource(exercise.getImageResource());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ExerciseDetailActivity.class);
            intent.putExtra("exerciseName", exercise.getName());
            intent.putExtra("exerciseDescription", exercise.getFullDescription());
            intent.putExtra("exerciseImage", exercise.getImageResource());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView name, shortDescription;
        ImageView image;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.exerciseName);
            shortDescription = itemView.findViewById(R.id.exerciseShortDescription);
            image = itemView.findViewById(R.id.exerciseImage);
        }
    }
}
