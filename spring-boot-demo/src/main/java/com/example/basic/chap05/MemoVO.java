package com.example.basic.chap05;

public class MemoVO {
    private long mno; // MNO에 해당
    private String memo;
    private String phone;
    private String pw;
    private String secret; // SECRET에 해당

    @Override
    public String toString() {
        return "MemoVO{" +
                "mno=" + mno +
                ", memo='" + memo + '\'' +
                ", phone='" + phone + '\'' +
                ", pw='" + pw + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }

    public long getMno() {
        return mno;
    }

    public void setMno(long mno) {
        this.mno = mno;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}