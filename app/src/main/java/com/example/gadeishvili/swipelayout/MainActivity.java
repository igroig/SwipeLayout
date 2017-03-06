package com.example.gadeishvili.swipelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tvDelete1;
    private SwipeLayout lLeft1;
    private TextView tvDelete2;
    private SwipeLayout lLeft2;
    private TextView tvDelete3;
    private SwipeLayout lLeft3;
    private TextView tvDelete4;
    private SwipeLayout lLeft4;
    private TextView tvDelete5;
    private SwipeLayout lLeft5;
    private TextView tvDelete6;
    private SwipeLayout lLeft6;
    private TextView tvDelete7;
    private SwipeLayout lLeft7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        tvDelete1 = (TextView) findViewById(R.id.tvDelete1);
        tvDelete1.setOnClickListener(this);
        lLeft1 = (SwipeLayout) findViewById(R.id.lLeft1);
        tvDelete2 = (TextView) findViewById(R.id.tvDelete2);
        lLeft2 = (SwipeLayout) findViewById(R.id.lLeft2);
        tvDelete3 = (TextView) findViewById(R.id.tvDelete3);
        lLeft3 = (SwipeLayout) findViewById(R.id.lLeft3);
        tvDelete4 = (TextView) findViewById(R.id.tvDelete4);
        lLeft4 = (SwipeLayout) findViewById(R.id.lLeft4);
        tvDelete5 = (TextView) findViewById(R.id.tvDelete5);
        lLeft5 = (SwipeLayout) findViewById(R.id.lLeft5);
        tvDelete6 = (TextView) findViewById(R.id.tvDelete6);
        lLeft6 = (SwipeLayout) findViewById(R.id.lLeft6);
        tvDelete7 = (TextView) findViewById(R.id.tvDelete7);
        lLeft7 = (SwipeLayout) findViewById(R.id.lLeft7);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tvDelete1:
                lLeft1.setVisibility(View.GONE);
                break;
        }
    }
}
