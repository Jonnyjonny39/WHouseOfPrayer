package com.oooof.jonnyjonny.whouseofprayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MissionActivity extends AppCompatActivity {
    private Button prayerBoardBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
        prayerBoardBtn=findViewById(R.id.btnPrayerBoard);
        prayerBoardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transition fade=new Fade();
                fade.setDuration(2000);
                ViewGroup root=findViewById(android.R.id.content);
                Scene scene2=Scene.getSceneForLayout(root,R.layout.activity_prayer_board,getApplicationContext());
                TransitionManager.go(scene2,fade);

            }
        });
    }
}
