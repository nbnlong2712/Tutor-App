package com.nguyenhuyhoang.lettutor.screen.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.api.Header;
import com.nguyenhuyhoang.lettutor.api.tutor.TutorApi;
import com.nguyenhuyhoang.lettutor.screen.tutor.TutorAdapter;
import com.nguyenhuyhoang.lettutor.models.tutor.Tutors;
import com.nguyenhuyhoang.lettutor.screen.course.CourseScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.setting.SettingScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.tutor.TutorScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.upcoming.UpcomingScreenActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeScreenActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView mBottomNavigationView;
    RecyclerView rcvTutorList;
    TutorAdapter mTutorAdapter;
    ProgressBar prbLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mTutorAdapter = new TutorAdapter();

        init();
    }

    @SuppressLint({"ResourceType", "SetTextI18n"})
    void init() {
        mBottomNavigationView = findViewById(R.id.home_navigation_bar);
        mBottomNavigationView.setOnItemSelectedListener(this);
        mBottomNavigationView.setSelectedItemId(R.id.home_screen);

        rcvTutorList = findViewById(R.id.rcv_list_tutor);
        rcvTutorList.setLayoutManager(new LinearLayoutManager(this));

        prbLoading = findViewById(R.id.prb_loading);

        fetchListTutor();
    }

    void fetchListTutor() {
        prbLoading.setVisibility(View.VISIBLE);
        TutorApi.tutorApi.getListTutors(Header.headers()).enqueue(new Callback<Tutors>() {
            @Override
            public void onResponse(Call<Tutors> call, Response<Tutors> response) {
                Tutors tutors = response.body();
                if (tutors != null) {
                    mTutorAdapter.setData(tutors.getRow().getTutorList());
                    rcvTutorList.setAdapter(mTutorAdapter);
                }
                prbLoading.setVisibility(View.GONE);
            }

            @Override
            public void onFailure(Call<Tutors> call, Throwable t) {
                Log.e("ERRR", t.getMessage());
                prbLoading.setVisibility(View.GONE);
            }
        });
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home_screen:
                return true;
            case R.id.course_screen:
                startActivity(new Intent(getApplicationContext(), CourseScreenActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
            case R.id.tutor_screen:
                startActivity(new Intent(getApplicationContext(), TutorScreenActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
            case R.id.upcoming_screen:
                startActivity(new Intent(getApplicationContext(), UpcomingScreenActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
            case R.id.setting_screen:
                startActivity(new Intent(getApplicationContext(), SettingScreenActivity.class));
                overridePendingTransition(0, 0);
                finish();
                return true;
        }
        return false;
    }
}