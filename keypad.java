public class keypad {
    static void combination(String dig,String[]kp,String result){
       if(dig.length()==0){
        System.out.println(result+" ");
        return;
       }int currnum=dig.charAt(0)-'0';
       String currchoices=kp[currnum];
       for(int i=0;i<currchoices.length();i++){
          combination(dig.substring(1),kp,result+currchoices.charAt(i));
       }
    }
    public static void main(String[] args){
        String s="23";
        String []keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(s,keypad,"");
    }
}
