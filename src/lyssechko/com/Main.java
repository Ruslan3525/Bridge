package lyssechko.com;

public class Main {

    public static void main(String[] args) {
	Program [] programs = {
          new BankSystem(new JavaDeveloper()),
          new StockExchangeSystem(new PhytonDeveloper())
    };

    for(Program program: programs){
        program.developProgram();
    }
    }
}
