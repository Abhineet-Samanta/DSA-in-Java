import java.util.Stack;
public class Insert_at_bottom_of_stack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        System.out.println(st);
        Stack<Integer> s= new Stack<>();
        while (st.size()>0) { 
            s.push(st.pop());
        }
        st.push(0);
        while(s.size()>0){
            st.push(s.pop());
        }System.out.println(st);
    }
}
