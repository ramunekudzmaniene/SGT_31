package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Map is storing 2 elements
        Map<String, Integer> map = new HashMap<>();

        //Add values to print
        map.put("BOB", 900);
        map.put("GOG", 928);

        //PRINT OUT
        System.out.println(map);

        //Get value from key
        System.out.println("GOG's salary:" + map.get("GOG"));

        //All key values
        System.out.println(map.keySet());

        //All values in map
        System.out.println(map.values());

        //Size
        System.out.println(map.size());

        //Check if map contains key
        System.out.println(map.containsKey("Tony"));
        System.out.println(map.containsKey("BOB"));

        //Check if Map contains value
        System.out.println(map.containsValue(1000));
        System.out.println(map.containsValue(900));

        //Remove key value from map if exist
        System.out.println(map.remove("BOB"));
        System.out.println(map);

        //Example
        Map<String, String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Lithuania", "Vilnius");
        capitalCity.put("Fake Estonia", "Tallinn");

        System.out.println((capitalCity.get("Lithuania")));

        for (Map.Entry<String, String> entry: capitalCity.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //print out
        for (Map.Entry<String, String> entry: capitalCity.entrySet()){
            if(entry.getValue().equals("Tallinn")){
                System.out.println(entry.getKey());
            }
        }
    }
}
