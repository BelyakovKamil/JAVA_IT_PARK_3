public class Main {

    public static void main(String[] args) throws Exception {
        HelloThread helloThread =new HelloThread("HelloThread");
//        Thread threadHelloThread =new Thread(helloThread);
//        threadHelloThread.start();

        for (int i=0; i<5;i++){
            System.out.println("Hello World!" +" " + i);
            Thread.sleep(2200);
        }
        System.out.println("Основной поток завершен");
//        HelloNotThread helloNotThread=new HelloNotThread();
//        helloNotThread.start();
    }
}
