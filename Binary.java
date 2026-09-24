import java.util.*;

public class Binary{

    public static void main(String[] args) {
        int arr[]={4,4,6,3,6,3,5};
        Arrays.sort(arr);
        int target=7;
        int l=0;
        int h=arr.length-1;
        
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                System.out.print("elemlent found");
                break;
            }
    
            else if(arr[mid]<target){
                l=mid+1;
            }else if(arr[mid]>target){
                h=mid-1;
            }else{
                System.out.println("Elemtent not  found ");
            }
        }
        
    }


} 
