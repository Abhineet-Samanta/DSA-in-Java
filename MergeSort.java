import java.util.Scanner;
public class MergeSort {
    private static int [] arrayInput(int[] array,int n,int count,Scanner sc){
        if(count==n){
            return  array;
        } array[count]=sc.nextInt();
       return arrayInput(array, n, count+1, sc);}
    private  static  void arrayoutput(int[] array,int n,int count){
        if(count==n){
            return;
        }System.out.print(array[count]+" ");
          arrayoutput(array, n, count+1);}
   
    private static void merge(int[]array,int l,int mid, int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int [] left=new int[n1];
        int [] right= new int[n2];
        int i, j,k;
        for (i = 0; i < n1; i++) {
            left[i]=array[l+i];
        } for (j = 0; j < n2; j++) {
            right[j]=array[mid+1+j];
        }i=0; j=0; k=l;
        while (i<n1 && j<n2) { 
            if(left[i]<right[j]){
                array[k++]=left[i++];
            }else{
                array[k++]=right[j++];
            }
        }while(i<n1){
            array[k++]=left[i++];
        }while(j<n2){
            array[k++]=right[j++];
        }
        
    }
    private static void MergeSort(int[]array,int l,int r){
        if(l>=r){
            return;
        }int mid= (l+r)/2;
        MergeSort(array, l, mid);
        MergeSort(array, mid+1, r);
        merge(array,l,mid,r);}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array:-");
        int n=sc.nextInt();
        int [] array= new int[n];
        System.out.println("Input array elements :-");
        arrayInput(array, n, 0, sc);
        arrayoutput(array, n, 0);
        System.out.println();
        MergeSort(array, 0, n-1);
        arrayoutput(array, n, 0);

        
    }
}
