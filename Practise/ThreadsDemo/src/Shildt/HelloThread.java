package Shildt;

public class HelloThread extends Thread {

    public HelloThread(String name){
        super(name);
        start();
    }
    @Override
    public void run() {
        System.out.println(getName()+" запущен");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello man" + " " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.err.println("Ошибка!!!");
            }
        }
        System.out.println(getName()+" завершен");
    }
}