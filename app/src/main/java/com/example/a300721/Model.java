package com.example.a300721;

public class Model {

    private String number;
    private String name;
    private String tittle;
    private String time;

    public Model(String number, String name, String tittle, String time) {
        this.number = number;
        this.name = name;
        this.tittle = tittle;
        this.time = time;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
