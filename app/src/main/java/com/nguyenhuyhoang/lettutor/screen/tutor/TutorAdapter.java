package com.nguyenhuyhoang.lettutor.screen.tutor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.components.SpecialtiesAdapter;
import com.nguyenhuyhoang.lettutor.models.tutor.Tutor;

import java.util.Arrays;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TutorAdapter extends RecyclerView.Adapter<TutorAdapter.TutorItem> {
    List<Tutor> tutorList;

    public TutorAdapter() {
    }

    public void setData(List<Tutor> tutors) {
        tutorList = tutors;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TutorItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutor_card, parent, false);
        return new TutorItem(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull TutorItem holder, int position) {
        SpecialtiesAdapter specialtiesAdapter = new SpecialtiesAdapter();
        Tutor tutor = tutorList.get(position);

        List<String> strings = Arrays.asList(tutor.getSpecialties().split(","));
        specialtiesAdapter.setData(strings);

        holder.tvTutorName.setText(tutor.getName());
        holder.tvTutorBio.setText(tutor.getBio().substring(0, 200) + "...");

        holder.rcvTutorSpecialties.setAdapter(specialtiesAdapter);
        Glide.with(holder.itemView).load(tutor.getAvatar()).into(holder.cimvTutorAvatar);
    }

    @Override
    public int getItemCount() {
        if (tutorList != null)
            return tutorList.size();
        return 0;
    }

    public class TutorItem extends RecyclerView.ViewHolder implements View.OnClickListener {
        CircleImageView cimvTutorAvatar;
        TextView tvTutorName;
        RecyclerView rcvTutorSpecialties;
        TextView tvTutorBio;

        public TutorItem(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            init(itemView);
        }

        void init(View itemView) {
            cimvTutorAvatar = itemView.findViewById(R.id.cimv_tutor_avatar);
            tvTutorName = itemView.findViewById(R.id.tv_tutor_name);
            rcvTutorSpecialties = itemView.findViewById(R.id.rcv_tutor_specialties);

            tvTutorBio = itemView.findViewById(R.id.tv_tutor_bio);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), DetailTutorActivity.class);
            intent.putExtra("tutor_id", tutorList.get(getAdapterPosition()).getUserId());
            view.getContext().startActivity(intent);
        }
    }
}
