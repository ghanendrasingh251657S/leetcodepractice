
import java.util.*;

public class Reverse {
      public static void main(String[] args) {
          int arr[]={10,12,8,7,5,13,9};
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

        System.out.print(Arrays.toString(arr));

  }
    
}
