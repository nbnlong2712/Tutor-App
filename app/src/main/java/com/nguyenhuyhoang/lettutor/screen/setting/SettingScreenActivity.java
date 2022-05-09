package com.nguyenhuyhoang.lettutor.screen.setting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.nguyenhuyhoang.lettutor.R;
import com.nguyenhuyhoang.lettutor.screen.course.CourseScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.home.HomeScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.tutor.TutorScreenActivity;
import com.nguyenhuyhoang.lettutor.screen.upcoming.UpcomingScreenActivity;

public class SettingScreenActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);

        init();
    }

    @SuppressLint({"ResourceType", "SetTextI18n"})
    void init()
    {
        mBottomNavigationView = findViewById(R.id.home_navigation_bar);
        mBottomNavigationView.setOnItemSelectedListener(this);
        mBottomNavigationView.setSelectedItemId(R.id.setting_screen);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home_screen:
                startActivity(new Intent(getApplicationContext(), HomeScreenActivity.class));
                overridePendingTransition(0,0);
                finish();
                return true;
            case R.id.course_screen:
                startActivity(new Intent(getApplicationContext(), CourseScreenActivity.class));
                overridePendingTransition(0,0);
                finish();
                return true;
            case R.id.tutor_screen:
                startActivity(new Intent(getApplicationContext(), TutorScreenActivity.class));
                overridePendingTransition(0,0);
                finish();
                return true;
            case R.id.upcoming_screen:
                startActivity(new Intent(getApplicationContext(), UpcomingScreenActivity.class));
                overridePendingTransition(0,0);
                finish();
                return true;
            case R.id.setting_screen:
                return true;
        }
        return false;
    }
}
