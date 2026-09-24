public class Count {
     public static void main(String[] args) {
          int arr[]={-10,12,0,7,0,5,-13,2};
      int zero=0;
      int postitive=0;
      int negative=0;
       for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==0){
            zero++;
          }else if(arr[i]>0){
            postitive++;
          }
          else{
            negative++;
          }
       } 
       System.out.println("zeroes "+zero);
       System.out.println("positive "+postitive);
        System.out.println("negative value" + negative);
  }
    
}
