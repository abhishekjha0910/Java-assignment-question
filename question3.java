/*Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this 
transaction. If you cannot achieve any profit, return 0 */
public class question3 {
    public static int buyandsellstock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0 ;
        for(int i = 0 ; i<prices.length ; i++){
            if(prices[i] > buyprice){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.err.println(buyandsellstock(prices));
    }
}
