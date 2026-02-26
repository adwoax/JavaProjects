public class countdownTimer {
    public static void main(String[] args) throws InterruptedException {
        for(int seconds = 10; seconds >= 0; --seconds) {
            System.out.println("Time left: " + seconds);
            Thread.sleep(1000L);
        }

        System.out.println("Time's up!");
    }
}