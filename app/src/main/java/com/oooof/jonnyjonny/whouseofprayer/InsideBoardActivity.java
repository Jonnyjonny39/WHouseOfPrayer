package com.oooof.jonnyjonny.whouseofprayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsideBoardActivity extends AppCompatActivity {
    private Button btnGoToContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_board);
        btnGoToContact=findViewById(R.id.btnGoToContact);
        btnGoToContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent=new Intent(InsideBoardActivity.this,ContactActivity.class);
                startActivity(contactIntent);
            }
        });
    }
}
