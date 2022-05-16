package com.nguyenhuyhoang.lettutor.components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.models.Tutor;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TutorAdapter extends RecyclerView.Adapter<TutorAdapter.TutorItem> {
    List<Tutor> tutorList;

    public TutorAdapter(){}

    public void setData(List<Tutor> tutors)
    {
        tutorList = tutors;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TutorItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutor_card, parent, false);
        return new TutorItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TutorItem holder, int position) {
        Tutor tutor = tutorList.get(position);
        holder.tvTutorName.setText(tutor.getName());
        holder.tvTutorBio.setText(tutor.getBio());
        holder.rbTutorRate.setRating((int)Math.round(tutor.getAvgRating()));
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
        RatingBar rbTutorRate;
        RecyclerView rcvSpecialties;
        ImageView imvFavourite;
        TextView tvTutorBio;

        public TutorItem(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            init(itemView);
        }

        void init(View itemView)
        {
            cimvTutorAvatar = itemView.findViewById(R.id.cimv_tutor_avatar);
            tvTutorName = itemView.findViewById(R.id.tv_tutor_name);
            rcvSpecialties = itemView.findViewById(R.id.rcv_specialties);
            rbTutorRate = itemView.findViewById(R.id.rb_tutor_rate);

            imvFavourite = itemView.findViewById(R.id.imv_favourite);
            imvFavourite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bitmap icon = BitmapFactory.decodeResource(view.getResources(),
                            R.drawable.favour_red);
                    if (((BitmapDrawable)imvFavourite.getDrawable()).getBitmap() == icon)
                    {
                        imvFavourite.setImageResource(R.drawable.ic_baseline_favorite_border_24);
                    }
                    else {
                        imvFavourite.setImageResource(R.drawable.favour_red);
                    }
                }
            });
            tvTutorBio = itemView.findViewById(R.id.tv_tutor_bio);
        }

        @Override
        public void onClick(View view) {}
    }
}
