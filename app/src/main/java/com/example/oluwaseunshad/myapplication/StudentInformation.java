package com.example.oluwaseunshad.myapplication;

public class StudentInformation {

    public static final String TABLE_NAME = "CS_Student_Information";

    public static final String COLUMN_NAME = "student_name";
    public static final String COLUMN_STUDENT_ID = "student_id";
    public static final String COLUMN_RESEARCH = "research_interest";
    public static final String COLUMN_ORIGIN = "country_origin";
    public static final String COLUMN_HOBBIES = "hobbies";
    public static final String COLUMN_LANGUAGE = "prog_lang";
    public static final String COLUMN_GRAD_PLAN = "grad_plan";
    public static final String COLUMN_ATTRACT_BG = "bg_attraction";
    public static final String COLUMN_FACTS = "fact";
    public static final String COLUMN_STUDENT_EMAIL = "studentEmail";


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_STUDENT_ID + " TEXT PRIMARY KEY,"
                    + COLUMN_RESEARCH + " TEXT,"
                    + COLUMN_ORIGIN + " TEXT,"
                    + COLUMN_HOBBIES + " TEXT,"
                    + COLUMN_LANGUAGE + " TEXT,"
                    + COLUMN_GRAD_PLAN + " TEXT,"
                    + COLUMN_ATTRACT_BG + " TEXT,"
                    + COLUMN_FACTS + " TEXT,"
                    + COLUMN_STUDENT_EMAIL + " TEXT"
            + ")";

}
