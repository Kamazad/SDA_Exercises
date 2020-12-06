package collection_training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTraining {
    public static void trainList(){
        String name1 = "Kunegunda";
        String name2 = "Kamil";
        String name3 = "Kuba";
        List<String> names = new LinkedList<>();
//        ArrayList<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);
        System.out.println(names.size());
        names.add(name1);
        System.out.println(names.size());

    }
}
