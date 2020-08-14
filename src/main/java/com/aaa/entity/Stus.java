package com.aaa.entity;

public class Stus {
    private Integer id;
    private String cname;
    private String sname;

    @Override
    public String toString() {
        return "Stus{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Stus(Integer id, String cname, String sname) {
        this.id = id;
        this.cname = cname;
        this.sname = sname;
    }

    public Stus() {
    }
}
