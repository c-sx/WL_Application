package com.soft.zkrn.weilin_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TaskDeleteSuccess extends AppCompatActivity {
    private Button btn_task_delete_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_delete_success);

        btn_task_delete_success = findViewById(R.id.btn_comment_success);
        btn_task_delete_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TaskDeleteSuccess.this, TaskCenter.class);
                startActivity(intent);
            }
        });
    }
}
