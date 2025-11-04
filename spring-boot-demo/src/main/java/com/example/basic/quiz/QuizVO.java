package com.example.basic.quiz;

public class QuizVO {

    private String id;
    private String pw;
    private String email;
    private String agree;

    public QuizVO() {}
    public QuizVO(String id, String pw, String email, String agree) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.agree = agree;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
