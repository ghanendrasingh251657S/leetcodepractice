class Second{
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr=new int[]{8,6,7,9,2};
        int second=0;
        int max=arr[0];
        int prev=0;
        for (int i = 1; i < 5; i++) {
            if(arr[i]>max){
                
                prev=max;
                max=arr[i];
            }
        }
        System.out.println(prev);

    }
}