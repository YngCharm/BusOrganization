
import java.util.*;

public class Route {

    public Route() {
    }

    BusStop busStop = new BusStop();
    RandomizerTime randomizerTime = new RandomizerTime();


    private final Map<Integer, List<BusStop>> routes = new HashMap<>();
    public void  printBus52(){
        randomizerTime.busTime();
        Bus bus = new Bus(52);
        busStop.bus52();
        for (int i = 0; i < 5; i++) {
            routes.put(i, busStop.busStop);

            System.out.println(bus.getNumberOfBus() +  " " + routes.get(i).get(i).getAddress() + " " + randomizerTime.countTime());
        }
    }
    public void printBus66() {
        randomizerTime.busTime();
        Bus bus = new Bus(66);
        busStop.bus66();
        for (int i = 0; i < 5; i++) {
            routes.put(i, busStop.busStop);

            System.out.println(bus.getNumberOfBus() + " " + routes.get(i).get(i).getAddress() + " " + randomizerTime.countTime());

        }
    }
    public void printBus20() {
        randomizerTime.busTime();
        Bus bus = new Bus(20);
        busStop.bus20();
        for (int i = 0; i < 5; i++) {
            routes.put(i, busStop.busStop);

            System.out.println(bus.getNumberOfBus() + " " + routes.get(i).get(i).getAddress() + " " + randomizerTime.countTime());

        }
    }
    public void routeChoose(){
        System.out.println("Выберите маршрут автобуса \n 20 52 66");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        switch (choose){
            case "20" -> printBus20();
            case "52" -> printBus52();
            case "66" -> printBus66();
            default -> System.out.println("Неверный номер маршрута");

        }

    }

}