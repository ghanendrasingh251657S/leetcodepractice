import java.util.Arrays;

class Sort2{
    public static void main(String[] args) 
    {
        int arr[]=new int[7];
        arr=new int[]{1,1,1,0,1,0,1,1};

      int i=0;
      int j=arr.length-1;
      while(i<j){
        if(arr[i]==0){
            i++;
        }
        else if (arr[j]==1) {
            j--;
        }else{
            int temp=arr[i];
                arr[i]=arr[j];

                arr[j]=temp;
                i++;
                j--;
         }

        }
        System.out.print(Arrays.toString(arr));
         for (int k = 0;  k< arr.length; k++)
         {
         System.out.println(arr[k]);
         }
    }
        
}
        
    
    

