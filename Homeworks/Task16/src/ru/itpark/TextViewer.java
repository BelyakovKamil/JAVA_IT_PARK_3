package ru.itpark;


public class TextViewer {
//    private Runnable tasks[]= new Runnable[10];
    private Thread tasks[]= new Thread[10];
    private int taskCount=0;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text){
        this.text=text;
    }

//    public void addTask(Runnable task){
//        tasks[taskCount]=task;
//        taskCount++;
//    }

    public void addTask(Thread task){
        tasks[taskCount]=task;
        taskCount++;
    }

//    public void process(){
//        for( int i=0; i<taskCount;i++){
//            tasks[i].run();
//        }
//    }

    public void process(){
        for( int i=0; i<taskCount;i++){
            tasks[i].start();
        }
    }
}