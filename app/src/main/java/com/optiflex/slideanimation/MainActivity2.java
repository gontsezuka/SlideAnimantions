package com.optiflex.slideanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_move = findViewById(R.id.btn_change2);

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMove = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intentMove);
            }
        });
    }

    /**
     * WE OVERRIDE FINISH IN ORDER TO APPLY ANIMATIONS TO THE BACK BUTTONS
     * IF WE WANT TO APPLY IT TO A SINGLE ACTIVITY
     */
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}