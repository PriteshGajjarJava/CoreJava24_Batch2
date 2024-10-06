import java.util.*;
class ListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<String> list2 = new LinkedList<String>();

        list1.add(12);list1.add(10);list1.add(31);list1.add(17);list1.add(1);
        list2.add("Mumbai");  list2.add("Pune");  list2.add("Jalgaon");  list2.add("Nashik");

        System.out.println(list1);
        list2.add(2, "Goa");// insert
        System.out.println(list2.size());
        list1.remove(1);// remove element at index 1
        list1.set(0,22); // update
        System.out.println("After updating: " + list1);

        Collections.sort(list2);
        System.out.println(list2.contains("Pune"));// search
        System.out.println("After sorting: " + list2);

        for (int i=0; i<list1.size(); i++) {
            System.out.println(list1.get(i)); // Read
        }
        // for-each loop
        for (String data : list2) {
            System.out.println(data);
        }
        // Using Iterator
        ListIterator<Integer> it = list1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}