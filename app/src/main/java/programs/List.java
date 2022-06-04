package programs;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(1);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(5);
        list.remove(5);
        list.remove(4);
        list.get(99);
        System.out.println(list.size());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println("Arraylist complete");
    }
}
