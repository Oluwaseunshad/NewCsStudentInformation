package com.example.oluwaseunshad.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.example.oluwaseunshad.myapplication.database.model.DatabaseHelper;

public class SubmitActivity extends AppCompatActivity {

    EditText name;
    EditText emailAdd;
    EditText studentID;
    EditText researchInterest;
    EditText country;
    EditText hobbies;
    EditText progLang;
    EditText gradPlan;
    EditText attractBG;
    EditText factAboutYou;
    Button continueBtn;
    DatabaseHelper db;
    String studentName, studentEmail, id, researchInt, countryOrigin, my_hobbies, language, plan, bgAttraction, fact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info_edit);
        db = new DatabaseHelper(this);

        name = findViewById(R.id.fullName);
        emailAdd = findViewById(R.id.emailaddress);
        studentID = findViewById(R.id.studentID);
        researchInterest = findViewById(R.id.researchInterest);
        country = findViewById(R.id.countryOrigin);
        hobbies = findViewById(R.id.hobbies);
        progLang =findViewById(R.id.progLang);
        gradPlan = findViewById(R.id.gradPlan);
        attractBG = findViewById(R.id.attractBG);
        factAboutYou = findViewById(R.id.interestFact);
        continueBtn = findViewById(R.id.continueBtn);
        AddData();

    }

    public void AddData(){
        continueBtn.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v){
                studentName = name.getText().toString();
                studentEmail = emailAdd.getText().toString();
                id = studentID.getText().toString();
                researchInt = researchInterest.getText().toString();
                countryOrigin = country.getText().toString();
                my_hobbies = hobbies.getText().toString();
                language = progLang.getText().toString();
                plan = gradPlan.getText().toString();
                bgAttraction = attractBG.getText().toString();
                fact = factAboutYou.getText().toString();

                boolean isInserted = db.insertValues(studentName, id, researchInt, countryOrigin, my_hobbies, language, plan, bgAttraction, fact, studentEmail);
                if (isInserted)
                    Toast.makeText(SubmitActivity.this, "Data inserted", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(SubmitActivity.this, "Data not inserted", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(SubmitActivity.this, LastActivity.class);
                //finish();
                startActivity(intent);

            }
        }
        );
    }

}
