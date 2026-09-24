
class Three{
    public static void main(String[] args) 
    {
        int arr[]=new int[7];
        arr=new int[]{1,1,1,0,1,2,1,1};

      int i=0;
      int j=arr.length-1;
      int m=0;
      while(i<j){
        if(arr[i]==0){
            i++;
            
        }
        else if (arr[j]==2) {
            j--;
        }
    
        else if(arr[m]==2){
            int temp=arr[m];
                arr[m]=arr[j];

                arr[j]=temp;
                
                
                m++;
                j--;

        }
        
        
        else{
            int temp=arr[m];
                arr[m]=arr[j];

                arr[j]=temp;
                i++;
                j--;
                m++;
         }

        }
        //System.out.print(Arrays.toString(arr));
         for (int k = 0;  k< arr.length; k++)
         {
         System.out.println(arr[k]);
         }
    }
        
}
        
    
    

