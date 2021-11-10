package lyssechko.com;

public class StockExchangeSystem extends Program{
    protected StockExchangeSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange system development in progress...");
        developer.writeCode();
    }
}
