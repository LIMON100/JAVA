public class CuttingRod {

    public int maxValue(int price[]){
        int max[] = new int[price.length+1];
        for(int i=1; i <= price.length; i++){
            for(int j=i; j <= price.length; j++){
                max[j] = Math.max(max[j], max[j-i] + price[i-1]);
            }
        }
        return max[price.length];
    }
    
    public int recursiveMaxValue(int price[],int len){
        if(len <= 0){
            return 0;
        }
        int maxValue = 0;
        for(int i=0; i < len;i++){
            int val = price[i] + recursiveMaxValue(price, len-i-1);
            if(maxValue < val){
                maxValue = val;
            }
        }
        return maxValue;
    }
    public static void main(String args[]){
        CuttingRod cr =new CuttingRod();
        ///int[] price = {3,5,8,9,10,20,22,25};
        int[] price = {2,5,7,8};
        ///long t1 = System.currentTimeMillis();
        int r = cr.recursiveMaxValue(price,4);
        ///long t2 = System.currentTimeMillis();
        System.out.println(r);
        ///System.out.println(t2 - t1);
    }
}