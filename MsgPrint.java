class a implements Runnable{
    public void run(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Good Morning");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Good Afternoon");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Good Night");
    }
}
class MsgPrint{
    public static void main(String[] args) {
        a a1=new a();
        Thread t=new Thread(a1);
        for(int i=0;i<1;i--){
            a1.run();
        }
    }
}