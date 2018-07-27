package com.example.oluwaseunshad.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import com.example.oluwaseunshad.myapplication.database.model.DatabaseHelper;
import android.database.Cursor;
import android.widget.TableRow;
import android.widget.TableLayout;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import android.view.Gravity;
public class ViewStudentInfoActivity extends AppCompatActivity {

    Button button;
    private DatabaseHelper db;
    TableLayout table_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_information);
        table_layout = findViewById(R.id.tableLayout1);
        db = new DatabaseHelper(this);
        Cursor c = db.readEntry();

        int rows = c.getCount();
        int cols = c.getColumnCount();

        c.moveToFirst();

        // outer for loop
        for (int i = 0; i < rows; i++) {

            TableRow row = new TableRow(this);
            row.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT));

            // inner for loop
            for (int j = 0; j < cols; j++) {

                TextView tv = new TextView(this);
                tv.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                        LayoutParams.WRAP_CONTENT));
                tv.setGravity(Gravity.CENTER);
                tv.setTextSize(18);
                tv.setPadding(0, 5, 0, 5);

                tv.setText(c.getString(j));

                row.addView(tv);

            }

            c.moveToNext();

            table_layout.addView(row);

        }
        db.close();
    }
    }


