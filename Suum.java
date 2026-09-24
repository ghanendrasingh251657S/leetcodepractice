public class Suum {
  public static void main(String[] args) {
          int arr[]={4,5,6,7,8};
      int sum=0;
      int average=0;
       for(int i=0;i<arr.length;i++)
        {
          sum=sum+arr[i];
           average=sum/arr.length;
       } 
       System.out.println(sum);
       System.out.println(average);
  }
  
}
