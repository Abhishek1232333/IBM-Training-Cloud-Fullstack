package java03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class list {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(0);
        list.add(10);

       // System.out.println(list);

       //list.forEach(e->System.out.println(e));

       list.forEach(new Consumer<Integer>() {
        @Override
        public void accept(Integer t){
            System.out.println(t);
        }
       });

       Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
        System.out.println(it.next());
}
    }
}
