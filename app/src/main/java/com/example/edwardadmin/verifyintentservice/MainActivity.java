package com.example.edwardadmin.verifyintentservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.edwardadmin.verifyintentservice.service.VerifyIntentService;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button mStartTaskButton1;
    private Button mStartTaskButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        mStartTaskButton1 = (Button) this.findViewById(R.id.msg_task1);
        mStartTaskButton2 = (Button) this.findViewById(R.id.msg_task2);

        mStartTaskButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntentService1();
            }
        });

        mStartTaskButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startIntentService2();
            }
        });
    }

    private void startIntentService1() {
        Intent intentFirst = new Intent(this, VerifyIntentService.class);
        Bundle bundle = new Bundle();
        bundle.putString(VerifyIntentService.TASK_NAME, VerifyIntentService.MSG_TASK_FIRST);
        intentFirst.putExtras(bundle);
        startService(intentFirst);
    }

    private void startIntentService2() {
        Intent intentSecond = new Intent(this, VerifyIntentService.class);
        Bundle bundle = new Bundle();
        bundle.putString(VerifyIntentService.TASK_NAME, VerifyIntentService.MSG_TASK_SECOND);
        intentSecond.putExtras(bundle);
        startService(intentSecond);
    }
}
