
public class ASCII {
    private static void ASCII_VALUES_DISPLAY(){
        int i=65;
        char j = 'A';
        char k = 'a';   
        int l=97;
       
         while(i<=90){
            if(j>='A' && j<='Z'){
                if(i>=65 && i<=90){
                System.out.println(j+"--->"+i+" ");
                j++;
                i++;
               
            }}
               
             
         }
             
             while (l<=122) {
               
            if(l>=97 && l<=122){
                if(k>='a' && k<='z'){
                System.out.println(k+"--->"+l+" ");
                k++;
                l++;
                }
            }
        }
    }
    public static void main(String[] args) {
       
        
         
         
           ASCII_VALUES_DISPLAY();
    }}

