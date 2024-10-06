import java.util.*;
class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(4); set1.add(91); set1.add(14); set1.add(4); set1.add(18); set1.add(10);
        System.out.println(set1);
        System.out.println("Total elements: " + set1.size());
        set1.remove(14);
        System.out.println(set1.contains(14));

        for(Integer i: set1) { System.out.println(i); }
        Iterator it = set1.iterator(); 
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}