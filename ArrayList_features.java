import java.util.ArrayList;
import java.lang.Integer;
public class ArrayList_features {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        //Add elements to Arraylist
        l1.add(8);
        l1.add(7);
        l1.add(6);
        l1.add(5);
        //longer way to print arraylist 
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" ");
        }System.out.println();
        //convinient way to print arraylist 
        System.out.println(l1);
        //To add a specific element at any index of arraylist 
        l1.add(2,16);
        System.out.println(l1);
        //to reset element at specific index of ArrayList 
        l1.set(4,8);
        System.out.println(l1);
        // to remove element at a specific index of ArrayList 
        l1.remove(1);
        System.out.println(l1);
        //to remove a specific value from ArrayList 
        l1.remove(Integer.valueOf(6));
        System.out.println(l1);
        l1.remove(Integer.valueOf(100));//will not show error if element isn't there
        System.out.println(l1);
        //to check if element is there in ArrayList 
        System.out.println(l1.remove(Integer.valueOf(10000)));
        boolean ans= l1.contains(Integer.valueOf(8));
        System.out.println(ans);
        //If you don't specify any wrapper class in arraylist you can store any datatype in it
        ArrayList l2= new ArrayList();
        l2.add("Abh");
        l2.add(1);
        l2.add(100000000);
        System.out.println(l2);
    }
}
