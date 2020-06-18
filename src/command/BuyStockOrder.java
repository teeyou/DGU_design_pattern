package command;

public class BuyStockOrder implements Order {
    private StockTrade stock;

    public BuyStockOrder(StockTrade stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
