package com.oooof.jonnyjonny.whouseofprayer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MediaActivity extends AppCompatActivity implements View.OnClickListener {
    ImageSwitcher imageSwitcher;
    Button btnPrevious,btnNext;
    int[]LOGO={R.drawable.ihopwallpic,R.drawable.ihoppic3,R.drawable.ihopmainpic28,R.drawable.ihopdryerasepic,
    R.drawable.ihopgirlpic,R.drawable.ihopappscripturepic,R.drawable.ihopmainpicmaybe,R.drawable.jesuspicforihop};
    int currentIndex=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        btnPrevious=findViewById(R.id.btnPrevious);
        btnNext=findViewById(R.id.btnNext);
        btnPrevious.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        imageSwitcher=findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView image=new ImageView(getApplicationContext());
                image.setScaleType(ImageView.ScaleType.FIT_CENTER);
                image.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return image;
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnNext:
                if (currentIndex<LOGO.length-1){
                    currentIndex=currentIndex+1;
                    imageSwitcher.setBackgroundResource(LOGO[currentIndex]);

                }
                break;

            case R.id.btnPrevious:
                if (currentIndex>0){
                    currentIndex=currentIndex-1;
                    imageSwitcher.setBackgroundResource(LOGO[currentIndex]);
                }
                break;
        }

    }
}
