public class HelloThread implements Runnable {
    Thread thread;
    public HelloThread(String name){
        thread = new Thread(this, name);
        thread.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello man" + " " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.err.println("Ошибка!!!");
            }
        }
        System.out.println(thread.getName()+" завершен");
    }
}
