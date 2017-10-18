package ru.itpark;

import java.time.LocalTime;

public class Program {
    private String name;
    private LocalTime beginTime;
    private LocalTime endTime;




    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setBeginTime(LocalTime beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


    }
