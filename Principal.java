public class Principal {
    public static void main(String args[]) {
        Runnable biu = new Trabalhador("chinelo", 200);
        Runnable rai = new Trabalhador("sandalia", 200);
        Thread t1 = new Thread(biu);
        Thread t2 = new Thread(rai);
        t1.start();
        t2.start();
    }
}
