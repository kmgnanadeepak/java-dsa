import java.util.*;
class students_info{
    public static void main(String[] args) {
       HashMap <Integer,Integer> map=new HashMap<>();
       map.put(101,990);
       map.put(102,987);
       map.put(103,898);
       System.out.println(map);

       map.remove(102);
       System.out.println(map);
    }
}