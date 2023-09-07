package Patterns.StrategyPatternFP;

public class Stock {
    private String symbol;
    private double price;
    private double units;

    public Stock(String symbol,
            double price,
            double units) {
        this.symbol = symbol;
        this.price = price;
        this.units = units;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the units
     */
    public double getUnits() {
        return units;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @param units the units to set
     */
    public void setUnits(double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock [sym= " + symbol + ",prc=" + price + ",unts=" + units + "]";
    }

}
