class Sell {
    public  static int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
                if(prices[i]<min){
                    min=prices[i];
                }
                int diff=prices[i]-min;
                if(max<diff){
                    max=diff;
                }
            
        }
        return max;

    }
    public static void main(String[] args) {
       
        int arr[]={7,1,5,3,6,4};
        
        System.out.println(maxProfit(arr));
    }
}