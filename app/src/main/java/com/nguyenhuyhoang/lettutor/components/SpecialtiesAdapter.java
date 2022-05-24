package com.nguyenhuyhoang.lettutor.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.models.tutor.Tutor;

import java.util.List;

public class SpecialtiesAdapter extends RecyclerView.Adapter<SpecialtiesAdapter.SpecialtiesHolder> {
    List<String> specialties;

    public SpecialtiesAdapter() {}

    public void setData(List<String> strings) {
        specialties = strings;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SpecialtiesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_specialties, parent, false);
        return new SpecialtiesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialtiesHolder holder, int position) {
        String specialty = specialties.get(position);
        holder.tvSpecialties.setText(specialty);
    }

    @Override
    public int getItemCount() {
        if (specialties != null)
            return specialties.size();
        return 0;
    }

    public class SpecialtiesHolder extends RecyclerView.ViewHolder {
        TextView tvSpecialties;

        public SpecialtiesHolder(@NonNull View itemView) {
            super(itemView);
            init(itemView);
        }

        void init(View view) {
            tvSpecialties = view.findViewById(R.id.tv_specialties);
        }
    }
}
