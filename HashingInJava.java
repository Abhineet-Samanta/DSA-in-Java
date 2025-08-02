import java.util.HashSet;
public class HashingInJava {
    public static void main(String[] args) {
        //creating a hashset
        Hashset<Integer>set= new Hashset<Integer>();
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//list.add(element)
        //Search-contains
        if (set.contains(1)) {
            System.out.println("set contains");}
        if (!set.contains(6)) {
            System.out.println("set does not contain");
        }

    }}
