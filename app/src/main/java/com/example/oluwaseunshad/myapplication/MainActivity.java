package com.example.oluwaseunshad.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button studentAccess;
    Button facultyAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentAccess = (Button)findViewById(R.id.button);
        studentAccess.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),SubmitActivity.class);
                startActivity(i);
            }
        });

        facultyAccess = (Button)findViewById(R.id.button2);
        facultyAccess.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),ViewStudentInfoActivity.class);
                startActivity(i);
            }
        });
    }

}
