package com.example.oluwaseunshad.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import com.example.oluwaseunshad.myapplication.SubmitActivity;

public class InputStudentInfoActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText studentID;
    EditText researchInterest;
    EditText country;
    EditText hobbies;
    EditText progLang;
    EditText gradPlan;
    EditText attractBG;
    EditText factAboutYou;
    Button continueBtn;
    SubmitActivity activity = new SubmitActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info_edit);


        name = (EditText)findViewById(R.id.fullName);
        email = (EditText)findViewById(R.id.emailaddress);
        studentID = (EditText)findViewById(R.id.studentID);
        researchInterest = (EditText)findViewById(R.id.researchInterest);
        country = (EditText)findViewById(R.id.countryOrigin);
        hobbies = (EditText)findViewById(R.id.hobbies);
        progLang = (EditText)findViewById(R.id.progLang);
        gradPlan = (EditText)findViewById(R.id.gradPlan);
        attractBG = (EditText)findViewById(R.id.attractBG);
        factAboutYou = (EditText)findViewById(R.id.interestFact);

        continueBtn = (Button)findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //call method here if true

                if (activity.flag){
                    setText(v);
                    activity.flag = false;
                }


                Intent intent = new Intent(InputStudentInfoActivity.this,SubmitActivity.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("studentID", studentID.getText().toString());
                intent.putExtra("researchInterest", researchInterest.getText().toString());
                intent.putExtra("country", country.getText().toString());
                intent.putExtra("hobbies", hobbies.getText().toString());
                intent.putExtra("progLang", progLang.getText().toString());
                intent.putExtra("gradPlan", gradPlan.getText().toString());
                intent.putExtra("attractBG", attractBG.getText().toString());
                intent.putExtra("factAboutYou", factAboutYou.getText().toString());

                startActivity(intent);
            }
        });


    }

    public void setText(View view)
    {
        Intent intent = getIntent();
        String student_name = intent.getStringExtra("name");
        name.setText(student_name);
        String emailAddress = intent.getStringExtra("email");
        email.setText(emailAddress);
        String id = intent.getStringExtra("studentID");
        studentID.setText(id);
        String researchInt = intent.getStringExtra("researchInterest");
        researchInterest.setText(researchInt);
        String countryOrigin = intent.getStringExtra("country");
        country.setText(countryOrigin);
        String my_hobbies = intent.getStringExtra("hobbies");
        hobbies.setText(my_hobbies);
        String language = intent.getStringExtra("progLang");
        progLang.setText(language);
        String plan = intent.getStringExtra("gradPlan");
        gradPlan.setText(plan);
        String fact = intent.getStringExtra("factAboutYou");
        factAboutYou.setText(fact);
        String bgAttraction = intent.getStringExtra("attractBG");
        attractBG.setText(bgAttraction);
        startActivity(intent);
    }

}
