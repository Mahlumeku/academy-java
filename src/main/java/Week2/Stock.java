package Week2;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;
    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares){
     this.tickerSymbol = tickerSymbol.toUpperCase();
     this.companyName = companyName;
     this.price = price;
     this.totalShares = totalShares;
     this.percentChange = 0.0;//Initialize to zero
     this.marketCap = totalShares * price;

    }
    // Create the methods to adjust the price
    public void adjustPrice(int change){
      //Update the price
      this.price += change;
        //Calculate the adjustment based on the change percentage
        this.percentChange = ((double)change / this.price) * 100;
        //Recalculate the marketCap
        this.marketCap = (long)this.totalShares * this.price;
                   
    }
// Method to return formatted stock information
    @Override
	public String toString() {
	   return "Ticker Symbol: " + this.tickerSymbol + "\n" + "Company: " + this.companyName + "\n" +
	   "Current Price: $" + this.price + " (" + this.percentChange + "%)\n" +
	    "Market Cap: $" + this.marketCap;
    
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}
