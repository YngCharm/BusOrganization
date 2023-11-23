import java.util.Random;

public class RandomizerTime {
    int random;
    int hours = 7;
    public void busTime() {
        random = (int)((Math.random() * (30 - 15)) + 15);
    }
    public String countTime(){
        busTime();

            int minutes1 = random;
            int minutes2 = random + minutes1;
            int minutes3 = random + minutes2;
            if (minutes3 > 59) {
                hours += 1;
                minutes3 -= 60;
            }
            return hours + ":" + String.format("%02d", minutes3);
        }
}
