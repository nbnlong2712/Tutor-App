package com.nguyenhuyhoang.lettutor.screen.tutor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.models.feedback.Feedback;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentHolder> {
    List<Feedback> mFeedbackList;

    public CommentAdapter() {
    }

    public void setData(List<Feedback> feedbacks) {
        mFeedbackList = feedbacks;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CommentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment, parent, false);
        return new CommentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentHolder holder, int position) {
        Feedback feedback = mFeedbackList.get(position);
        holder.tvCommentName.setText(feedback.getFirstInfo().getName());
        holder.tvCommentDate.setText(feedback.getCreatedAt().toString());
        holder.tvCommentContent.setText(feedback.getContent());
        Glide.with(holder.itemView.getContext()).load(feedback.getFirstInfo().getAvatar()).into(holder.cimvCommentAvatar);
        holder.rbTutorRate.setRating((int) Math.round(feedback.getRating()));
    }

    @Override
    public int getItemCount() {
        if (mFeedbackList != null)
            return mFeedbackList.size();
        return 0;
    }

    public class CommentHolder extends RecyclerView.ViewHolder {
        CircleImageView cimvCommentAvatar;
        RatingBar rbTutorRate;
        TextView tvCommentName, tvCommentContent, tvCommentDate;

        public CommentHolder(@NonNull View itemView) {
            super(itemView);
            init(itemView);
        }

        void init(View view) {
            cimvCommentAvatar = view.findViewById(R.id.cimv_comment_avatar);
            rbTutorRate = view.findViewById(R.id.rb_tutor_rate);
            tvCommentName = view.findViewById(R.id.tv_comment_name);
            tvCommentContent = view.findViewById(R.id.tv_comment_content);
            tvCommentDate = view.findViewById(R.id.tv_comment_date);
        }
    }
}
