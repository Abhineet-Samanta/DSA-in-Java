
import java.util.Stack;
public class Copy_Stack_into_another_in_same_order {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Stack<Integer> stack1= new Stack<>();
        while(stack.size()>0){
            stack1.push(stack.pop());
        }System.out.println(stack1);
        Stack<Integer> stack2= new Stack<>();
        while(stack1.size()>0){
            stack2.push(stack1.pop());
        }System.out.println(stack2);
        
    }
}
