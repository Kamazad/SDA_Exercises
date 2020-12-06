package collection_training;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
    public static void trainingMap(){
        String name1 = "Jola";
        String name2 = "Agnieszka";
        String name3 = "Marcin";
        Map<Integer, String> names = new HashMap<>();
        names.put(1, name1);
        names.put(2, name2);
        names.put(3, name3);
        printMap(names);
        System.out.println(names.size());
        names.put(1, name2);
        printMap(names);
        System.out.println(names.size());
        System.out.println(names);
    }
    public static void printMap(Map<Integer, String> mapNames){
        for(Map.Entry<Integer, String> instance: mapNames.entrySet()){
            System.out.println(instance.getKey() + " = " +instance.getValue());

        }
    }
}
