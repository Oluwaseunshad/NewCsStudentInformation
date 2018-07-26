package com.example.oluwaseunshad.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.oluwaseunshad.myapplication.database.model.DatabaseHelper;
public class SubmitActivity extends AppCompatActivity {

    Button editButton;
    Button submitButton;
    TextView fullname;
    TextView emailadd;
    TextView studentID;
    TextView countryOrigin;
    TextView researchInterest;
    TextView hobbies;
    TextView progLang;
    TextView interestFact;
    TextView gradPlan;
    TextView attractedBG;
    public String name;
    public String email;
    public String id;
    public String researchInt;
    public String country;
    public String my_hobbies;
    public String language;
    public String plan;
    public String fact;
    public String bgAttraction;
    public Boolean flag = false;

    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info_edit_submit);

        db = new DatabaseHelper(this);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        fullname.setText(name);
        email = intent.getStringExtra("email");
        emailadd.setText(email);
        id = intent.getStringExtra("studentID");
        studentID.setText(id);
        researchInt = intent.getStringExtra("researchInterest");
        researchInterest.setText(researchInt);
        country = intent.getStringExtra("country");
        countryOrigin.setText(country);
        my_hobbies = intent.getStringExtra("hobbies");
        hobbies.setText(my_hobbies);
        language = intent.getStringExtra("progLang");
        progLang.setText(language);
        plan = intent.getStringExtra("gradPlan");
        gradPlan.setText(plan);
        fact = intent.getStringExtra("factAboutYou");
        interestFact.setText(fact);
        bgAttraction = intent.getStringExtra("attractBG");
        attractedBG.setText(bgAttraction);

        editButton = (Button) findViewById(R.id.button);
        submitButton = (Button) findViewById(R.id.submit_button);
        editButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                flag = true;
                Intent intent = new Intent(SubmitActivity.this, InputStudentInfoActivity.class);
                intent.putExtra("name", fullname.getText().toString());
                intent.putExtra("email", emailadd.getText().toString());
                intent.putExtra("studentID", studentID.getText().toString());
                intent.putExtra("researchInterest", researchInterest.getText().toString());
                intent.putExtra("country", countryOrigin.getText().toString());
                intent.putExtra("hobbies", hobbies.getText().toString());
                intent.putExtra("progLang", progLang.getText().toString());
                intent.putExtra("gradPlan", gradPlan.getText().toString());
                intent.putExtra("attractBG", attractedBG.getText().toString());
                intent.putExtra("factAboutYou", interestFact.getText().toString());
                startActivity(intent);
            }
        });


        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                StudentInformation student = new StudentInformation(name, email, id, researchInt, country, my_hobbies, language, plan, bgAttraction, fact);
                db.insertValues(student);
                Intent intent = new Intent(SubmitActivity.this, LastActivity.class);
                finish();
                startActivity(intent);
            }
        });

    }

}