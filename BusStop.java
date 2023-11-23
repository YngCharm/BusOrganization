import java.util.ArrayList;
import java.util.List;

public class BusStop {
    public String address;

    public BusStop() {
    }

    public BusStop(String address) {
        this.address = address;
    }

    List<BusStop> busStop = new ArrayList<>();

    public void bus52(){

        BusStop busStop1 = new BusStop("Купчинская (ул. Ярослава Гашека)");
        BusStop busStop2 = new BusStop("Дунайский проспект (ул. Купчинская)");
        BusStop busStop3 = new BusStop("Дунайский проспект");
        BusStop busStop4 = new BusStop("Ленсовета д.90 (Станция метро Звёздная)");
        BusStop busStop5 = new BusStop("Метро Звёздная");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);
    }
    public void bus66(){

        BusStop busStop1 = new BusStop("Улица Автовская");
        BusStop busStop2 = new BusStop("Улица Маринеско");
        BusStop busStop3 = new BusStop("Проспект Стачек");
        BusStop busStop4 = new BusStop("Улица Зенитчиков");
        BusStop busStop5 = new BusStop("Комсомольская площадь");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);
    }
    public void bus20(){

        BusStop busStop1 = new BusStop("Авангардная (проспект Ветеранов)");
        BusStop busStop2 = new BusStop("проспект Маршала Жукова");
        BusStop busStop3 = new BusStop("Генерала Симоняка (проспект Ветеранов)");
        BusStop busStop4 = new BusStop("Универсам Таллинский");
        BusStop busStop5 = new BusStop("Солдата Корзуна (проспект Ветеранов)");
        busStop.add(busStop1);
        busStop.add(busStop2);
        busStop.add(busStop3);
        busStop.add(busStop4);
        busStop.add(busStop5);
    }


    public String getAddress() {

        return address;
    }

}