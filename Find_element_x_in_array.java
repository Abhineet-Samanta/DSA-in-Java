import java.util.Scanner;

public class Find_element_x_in_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("which element you want to find:-");
        int x= sc.nextInt();
         System.out.print("SIZE OF ARRAY:-");
        int n= sc.nextInt();
        int [] array= new int[n];
        System.out.println("INPUT ELEMENTS OF ARRAY:-");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }int i=0;
        int flag=0;
        do{
            if(array[i]==x){
                  flag++;
               
            }
            i++;
        }while(i<n);
        if(flag>0){
        System.out.println("Element in array has been found out "+" "+flag+" "+"times");
       }
    else if(flag==0){
        System.out.println("NOT FOUND");
    }

    }
}
