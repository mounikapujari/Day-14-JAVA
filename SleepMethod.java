public class SleepMethod{
    public static void main(String[] args) {
        {
            System.out.println("Thread Started....");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("Thread resumed");

        }
    }
}