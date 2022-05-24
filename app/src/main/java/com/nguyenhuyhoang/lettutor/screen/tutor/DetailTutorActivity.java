package com.nguyenhuyhoang.lettutor.screen.tutor;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.api.Header;
import com.nguyenhuyhoang.lettutor.api.feedback.FeedbackApi;
import com.nguyenhuyhoang.lettutor.api.tutor.TutorApi;
import com.nguyenhuyhoang.lettutor.components.SpecialtiesAdapter;
import com.nguyenhuyhoang.lettutor.models.feedback.TutorFeedback;
import com.nguyenhuyhoang.lettutor.models.tutor.Tutor;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailTutorActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvTutorName, tvTutorProfession, tvTutorCountry, tvTutorBio, tvTutorInterest;
    RecyclerView rcvTutorLanguages, rcvTutorSpecialties, rcvComments;
    RatingBar rbTutorRate;
    ImageView imvTutorFavour;
    CircleImageView cimvTutorAvatar;
    ExtendedFloatingActionButton fbtnBooking;
    ProgressBar prbLoading;
    VideoView vdvTutorVideo;
    SpecialtiesAdapter languagesAdapter, specialtiesAdapter;
    CommentAdapter commentAdapter;

    String tutorId = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tutor);

        Intent i = getIntent();
        if (i != null) {
            tutorId = i.getStringExtra("tutor_id");
        }

        languagesAdapter = new SpecialtiesAdapter();
        specialtiesAdapter = new SpecialtiesAdapter();
        commentAdapter = new CommentAdapter();

        init();
    }

    void init() {
        tvTutorName = findViewById(R.id.tv_tutor_name);
        tvTutorProfession = findViewById(R.id.tv_tutor_profession);
        tvTutorCountry = findViewById(R.id.tv_tutor_country);
        tvTutorBio = findViewById(R.id.tv_tutor_bio);
        tvTutorInterest = findViewById(R.id.tv_tutor_interest);

        rcvTutorLanguages = findViewById(R.id.rcv_tutor_languages);
        rcvTutorSpecialties = findViewById(R.id.rcv_tutor_specialties);
        rcvComments = findViewById(R.id.rcv_comments);
        rcvComments.setLayoutManager(new LinearLayoutManager(this));

        rbTutorRate = findViewById(R.id.rb_tutor_rate);

        imvTutorFavour = findViewById(R.id.imv_tutor_favour);
        imvTutorFavour.setOnClickListener(this);

        cimvTutorAvatar = findViewById(R.id.cimv_tutor_avatar);

        fbtnBooking = findViewById(R.id.fbtn_booking);
        fbtnBooking.setOnClickListener(this);

        prbLoading = findViewById(R.id.prb_loading);

        vdvTutorVideo = findViewById(R.id.vdv_tutor_video);

        fetchTutorInfo();
        fetchComments();
    }

    @Override
    public void onClick(View view) {
    }

    void fetchTutorInfo() {
        TutorApi.tutorApi.getTutorInfo(Header.headers(), tutorId).enqueue(new Callback<Tutor>() {
            @Override
            public void onResponse(Call<Tutor> call, Response<Tutor> response) {
                if (response.code() == 200) {
                    Tutor tutor = response.body();

                    if (tutor != null) {
                        tvTutorName.setText(tutor.getUser().getName());
                        tvTutorProfession.setText(tutor.getProfession());
                        tvTutorCountry.setText(tutor.getUser().getCountry());
                        tvTutorBio.setText(tutor.getBio());
                        tvTutorInterest.setText(tutor.getInterests());
                        Glide.with(DetailTutorActivity.this).load(tutor.getUser().getAvatar()).into(cimvTutorAvatar);
                        rbTutorRate.setRating((int) Math.round(tutor.getAvgRating()));

                        List<String> languages = Arrays.asList(tutor.getLanguages().split(","));
                        languagesAdapter.setData(languages);
                        rcvTutorLanguages.setAdapter(languagesAdapter);

                        List<String> specialties = Arrays.asList(tutor.getSpecialties().split(","));
                        specialtiesAdapter.setData(specialties);
                        rcvTutorSpecialties.setAdapter(specialtiesAdapter);
                        vdvTutorVideo.setVideoURI(Uri.parse(tutor.getVideo()));
                        vdvTutorVideo.start();
                        vdvTutorVideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                            @Override
                            public void onPrepared(MediaPlayer mediaPlayer) {
                                mediaPlayer.setLooping(true);
                            }
                        });
                    } else {
                        Log.e("ERRR", response.code() + "");
                    }
                }
            }

            @Override
            public void onFailure(Call<Tutor> call, Throwable t) {
                Log.e("ERRRR", t.getMessage());
            }
        });
    }

    void fetchComments() {
        prbLoading.setVisibility(View.VISIBLE);
        FeedbackApi.feedbackApi.getFeedback(Header.headers(), tutorId).enqueue(new Callback<TutorFeedback>() {
            @Override
            public void onResponse(Call<TutorFeedback> call, Response<TutorFeedback> response) {
                if (response.code() == 200) {
                    TutorFeedback tutorFeedback = response.body();
                    commentAdapter.setData(tutorFeedback.getUserFeedback().getFeedbacks());
                    rcvComments.setAdapter(commentAdapter);
                } else {
                    Log.e("ERROR", response.code() + "");
                }
                prbLoading.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<TutorFeedback> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
                prbLoading.setVisibility(View.GONE);
            }
        });
    }
}
