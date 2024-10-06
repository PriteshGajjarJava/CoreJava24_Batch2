// ADD :push(data)
// Remove : pop()

import java.util.*;
class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1); stack.push(2); stack.push(3); stack.push(4); stack.push(5);
        stack.pop();// remove
        int d = stack.peek(); // Read
        System.out.println(d);
        System.out.println(stack.contains(2));
        Iterator it = stack.iterator(); 
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}