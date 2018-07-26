package com.example.oluwaseunshad.myapplication;

public class StudentInformation {

    public static final String TABLE_NAME = "Student Information";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "student_name";
    public static final String COLUMN_EMAIL = "email_address";
    public static final String COLUMN_STUDENT_ID = "student_id";
    public static final String COLUMN_RESEARCH = "research_interest";
    public static final String COLUMN_ORIGIN = "country_origin";
    public static final String COLUMN_HOBBIES = "hobbies";
    public static final String COLUMN_LANGUAGE = "prog_lang";
    public static final String COLUMN_GRAD_PLAN = "grad_plan";
    public static final String COLUMN_ATTRACT_BG = "bg_attraction";
    public static final String COLUMN_FACTS = "fact";
    private int id;
    private String name;
    private String email;
    private String student_id;
    private String interest;
    private String origin;
    private String hobby;
    private String lang_prog;
    private String grad_plan;
    private String attract_bg;
    private String facts;

    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_EMAIL + "TEXT,"
                    + COLUMN_STUDENT_ID + " TEXT,"
                    + COLUMN_RESEARCH + " TEXT,"
                    + COLUMN_ORIGIN + " TEXT,"
                    + COLUMN_HOBBIES + " TEXT,"
                    + COLUMN_LANGUAGE + " TEXT,"
                    + COLUMN_GRAD_PLAN + " TEXT,"
                    + COLUMN_ATTRACT_BG + " TEXT,"
                    + COLUMN_FACTS + " TEXT,"
                    + ")";

    public StudentInformation() {
    }

    public StudentInformation(String name, String email, String student_id, String interest, String origin, String hobby,
                              String lang_prog, String grad_plan, String attract_bg, String facts) {
        this.name = name;
        this.email = email;
        this.student_id = student_id;
        this.interest = interest;
        this.origin = origin;
        this.hobby = hobby;
        this.lang_prog = lang_prog;
        this.grad_plan = grad_plan;
        this.attract_bg = attract_bg;
        this.facts = facts;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {return email;}
    public String getStudentID() {
        return student_id;
    }
    public String getInterest() {
        return interest;
    }
    public String getOrigin() {
        return origin;
    }
    public String getHobby() {
        return hobby;
    }
    public String getLanguage() {
        return lang_prog;
    }
    public String getPlan() {
        return grad_plan;
    }
    public String getAttractBg() {
        return attract_bg;
    }
    public String getFacts() {
        return facts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {this.email = email; }

    public void setStudentId(String student_id) {
        this.student_id = student_id;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setLanguage(String lang_prog) {
        this.lang_prog = lang_prog;
    }

    public void setPlan(String grad_plan) {
        this.grad_plan = grad_plan;
    }

    public void setBgAttract(String attract_bg) {
        this.attract_bg = attract_bg;
    }

    public void setFacts(String facts) {
        this.facts = facts;
    }
}
