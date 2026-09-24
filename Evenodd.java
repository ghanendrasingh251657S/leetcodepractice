public class Evenodd {


      public static void main(String[] args) {
          int arr[]={10,12,8,7,5,13};
      int even=0;
      int odd=0;
       for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0){
            even++;
          }else{
            odd++;
          }
       } 
       System.out.println(even);
       System.out.println(odd);
  }
    
}
