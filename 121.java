public class 121{
    public int buy&sell(int [] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(minPrice>price){
                minPrice = price;
            }
            else if(price-minPrice>maxProfit){
                maxProfit=price-minPrice;
            }
        }
        return maxProfit;
    }
}