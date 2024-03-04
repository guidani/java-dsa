package basic;

import java.util.ArrayList;
import java.util.List;

public class Arrgh {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String c : cars){
            System.out.println(c);
        }

        ArrayList<String> listMutavel = new ArrayList<>();
        for(String c : cars){
            listMutavel.add(c);
        }
        listMutavel.addAll(List.of(cars));

        System.out.println("listMutavel " + listMutavel.toArray().length);
        for(String i : listMutavel){
            System.out.println("LM " + i);
        }
    }
}
