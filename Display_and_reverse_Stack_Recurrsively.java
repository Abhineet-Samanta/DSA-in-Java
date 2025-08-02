import java.util.Stack;
public class Display_and_reverse_Stack_Recurrsively {
     public static void displayrecurrsionreverse(Stack<Integer>s){
        if(s.size()==0){return;}
        int top=s.pop();
        System.out.print(top+" ");
        displayrecurrsionreverse(s);
        s.push(top);


    }public static Integer RemoveFromBottom(Stack<Integer>s){
        if (s.isEmpty()) {
        return null; 
    }

    int top = s.pop();
    if (s.isEmpty()) {
        return top;
    } else {
        int bottom = RemoveFromBottom(s);
        s.push(top); 
        return bottom;
    }
}

    
    public static void displayrecurrsion(Stack<Integer>s){
        if(s.size()==0){return;}
        int top=s.pop();
        displayrecurrsion(s);
        System.out.print(top+" ");
        s.push(top);


    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        displayrecurrsionreverse(st);
        System.out.println("");
        displayrecurrsion(st);
        RemoveFromBottom(st);
        System.out.println("");
        displayrecurrsion(st);
       
    }
}
