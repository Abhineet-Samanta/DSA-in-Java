public class Array_Implementation_of_Stack {
    public static  class Array_Implementation{
        private int [] array= new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()==true)
            {System.out.println("Stack is Full");return;}
               array[idx]=x;
               idx++;
        }int peek(){
            if(idx==0)
            {throw new IllegalArgumentException("Stack is empty");}
            return  array[idx-1];
        }int pop(){
            if(idx==0)
            {throw new IllegalArgumentException("Stack is empty");}
            int top=array[idx-1];
            array[idx-1]=0;
            idx--;
            return  top;
        }void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(array[i]+" ");
            }System.out.println();
        }int size(){
            return  idx;
        }boolean isEmpty(){
            if(size()==0){return true;}
            else{ return false;}
        }boolean isFull(){
            if(idx== array.length){return  true;}
            else{return  false;}
        }
    }
    public static void main(String[] args) {
        Array_Implementation st= new Array_Implementation();
        st.push(8);
        st.display();
        st.push(16);
        st.display();
        st.push(8);
        st.display();
        st.push(8);
        st.display();
        st.push(8);
        st.display();
        st.push(8);
        st.display();
        System.out.println("size is ="+" "+st.size());
        st.pop();
        st.display();
    
    }
}
