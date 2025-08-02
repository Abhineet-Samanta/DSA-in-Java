
import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
    private static void BucketSort(double [] array){
       ArrayList <Double>[] bucket=new ArrayList[array.length];
       for (int i = 0; i <  array.length; i++) {
           bucket[i]= new ArrayList<Double>();
       }for (int i = 0; i < array.length; i++) {
        int bucketidx=(int) array[i]*array.length;
        bucket[bucketidx].add(array[i]);
           
       }//sort each bucket induvidually
       for(int i=0; i<bucket.length;i++){
        Collections.sort(bucket[i]);
       }//merge all buckets to get final sorted array
       int index=0;
       for(int i=0;i<bucket.length;i++){
        ArrayList<Double> currBucket=bucket[i];
           for(int j=0;j<currBucket.size();j++){
            array[index++]=currBucket.get(j);
           }
       }
    }
    public static void main(String[] args) {
        double [] array={0.42,0.32,0.25,0.62,0.23,0.47,0.51,0.92,0.68,0.75};
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }BucketSort(array);
        System.out.println();
         for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
    }
    
}
