package ru.itpark;

import java.time.LocalTime;

public class Program {
    private String name;
    private String beginTime;
    private String endTime;


    public Program(String name, String beginTime, String endTime ){
        this.name=name;
        this.beginTime=beginTime;
        this.endTime=endTime;
    }

    public String getName() {
        return name;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public String getEndTime() {
        return endTime;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setBeginTime(LocalTime beginTime) {
//        this.beginTime = beginTime;
//    }
//
//    public void setEndTime(LocalTime endTime) {
//        this.endTime = endTime;
//    }


    }
