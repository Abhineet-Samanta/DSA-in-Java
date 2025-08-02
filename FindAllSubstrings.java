
import java.util.ArrayList;

public class FindAllSubstrings {
    private static ArrayList<String> Substring_Recurrsion(String str){
     ArrayList<String>ans=new ArrayList<>();
     if(str.length()==0){
        ans.add(" ");
        return ans;
     }char curr=str.charAt(0);
     ArrayList<String>smallans= Substring_Recurrsion(str.substring(1));
     for (String ss : smallans) {
         ans.add(ss);
         ans.add(curr+ss);
     }return  ans;

    }private static void displaySubstrings(String str){
       for (int i = 0; i < str.length(); i++) {
        for (int j = i+1; j < str.length(); j++) {
            System.out.println(str.substring(i,j));
        }
       
       }
    }
    public static void main(String[] args) {
        String str="abcd";
       System.out.println(Substring_Recurrsion(str));
       displaySubstrings(str);
    }
}
