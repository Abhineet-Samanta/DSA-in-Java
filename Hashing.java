import java.util.HashMap;
public  class Hashing{        
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int array[]={10,2,-2,-20,10};
        int k=-10;
        map.put(0, 1);//empty subarray
        int sum=0;
        int ans=0;
        for(int i=0;i<array.length;i++){
          sum+=array[i];
          if (map.containsKey(sum-k)){
            ans+=map.get(sum-k);
          }if (map.containsKey(sum)) {
              map.put(sum, map.get(sum)+1);
          }else{
            map.put(sum, 1);
          }
        }System.out.println(ans);
        }}