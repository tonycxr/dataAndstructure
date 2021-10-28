package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Tom1");
        stack.add("Tom2");
        stack.add("Tom3");
        stack.add("Tom4");
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
