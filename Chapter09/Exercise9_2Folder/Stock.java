package Chapter09.Exercise9_2Folder;

public class Stock {
    String symbol;               
	String name;                   
	double previousClosingPrice;	
	double currentPrice;	

	public Stock(double previousClosingPrice, double currentPrice) {
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / 
					previousClosingPrice) * 100;
	}
}
