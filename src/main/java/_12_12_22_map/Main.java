package _12_12_22_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Place place1 = new Place(1);
        Place place2 = new Place(2);
        Place place3 = new Place(3);
        Place place4 = new Place(4);
        Place place5 = new Place(5);
        Place place6 = new Place(6);
        Place place7 = new Place(7);
        Place place8 = new Place(8);
        Place place9 = new Place(9);
        Place place10 = new Place(10);

        Guest guest1 = new Guest("Ivan", "Ivanov", 20);
        Guest guest2 = new Guest("Petr", "Petrov", 24);
        Guest guest3 = new Guest("Lena", "Ivanova", 23);
        Guest guest4 = new Guest("Diana", "Sidorova", 26);
        Guest guest5 = new Guest("Alex", "Ivanov", 23);
        Guest guest6 = new Guest("Nick", "Ivanov", 30);
        Guest guest7 = new Guest("Sergey", "Ivanov", 34);
        Guest guest8 = new Guest("Vika", "Ivanov", 22);
        Guest guest9 = new Guest("Nina", "Ivanov", 24);
        Guest guest10 = new Guest("Aleksei", "Ivanov", 29);

        Map<Place, Guest> hashMap = new HashMap<>();
        hashMap.put(place1,guest1);
        hashMap.put(place2,guest2);
        hashMap.put(place3,guest3);
        hashMap.put(place4,guest4);
        hashMap.put(place5,guest5);
        hashMap.put(place6,guest6);
        hashMap.put(place7,guest7);
        hashMap.put(place8,guest8);
        hashMap.put(place9,guest9);
        hashMap.put(place10,guest10);


        for (Map.Entry<Place, Guest> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey().getNumber() + " : " + entry.getValue().getName());
        }

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey(place5));
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(place3).name);
    }
}