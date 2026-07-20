package java03;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class stackex{
    stackex(){
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(100);
        stack.push(200);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.get(0));
        stack.clear();

        System.out.println(stack);
    }
}


class queueex{
    queueex(){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(10);
        queue.offer(30);
        queue.offer(50);

        queue.poll();

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains(30));

        System.out.println(queue);

    }
}

class mapex{
    mapex(){
        Map<String,Integer> map=new HashMap<>();
        
        map.put("Abhishek",07);
        map.put("Rana",18);
        map.put("Aniket",45);

        System.out.println(map);
        System.out.println(map.get("Abhishek"));
        System.out.println(map.size());

        map.forEach((k,v)->System.out.println(k+":"+v));
    }
}

class setex{
    setex(){
        Set<Integer> set=new HashSet<>();

        set.add(10);
        set.add(30);
        set.add(40);

        set.remove(10);

        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}

class listex{
    listex(){
        List<String> list=new ArrayList<>();
        list.add("Abhishek");
        list.add("Goud");

        list.forEach(e->System.out.println(e));
    }
}

public class collections {
    public static void main(String[] args) {
       // stackex s=new stackex();

       //queueex q=new queueex();
       //mapex map=new mapex();

       //setex set=new setex();
       listex list=new listex();
    }

}
