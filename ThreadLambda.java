public class ThreadLambda {
    public static void main(String[] args) {
        Runnable r =()->System.out.println("i am new from java-8 version");
        Thread t=new Thread(r);
        t.start();
    }
    
}
