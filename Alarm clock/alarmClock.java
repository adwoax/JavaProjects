import java.io.PrintStream;
import java.time.LocalTime;

public class alarmClock {
    public static void main(String[] args) throws InterruptedException {
        LocalTime alarmTime = LocalTime.of(23, 59);

        while(true) {
            LocalTime now = LocalTime.now();
            PrintStream var10000 = System.out;
            int var10001 = now.getHour();
            var10000.println("Current time: " + var10001 + ":" + now.getMinute());
            if (now.getHour() == alarmTime.getHour() && now.getMinute() == alarmTime.getMinute()) {
                System.out.println("ALARM! WAKE UP!");
                return;
            }

            Thread.sleep(60000L);
        }
    }
}