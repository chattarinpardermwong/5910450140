import java.util.ArrayList;

public class Player {
    private double pocket;
    ArrayList<String> incomeList = new ArrayList<String>();
    ArrayList<String> outcomeList = new ArrayList<String>();

    public void addMoney(double money){
        if (money >= 0){
            pocket += money;
            incomeList.add(Double.toString(money));
        }else{
            System.out.println("Cannot add money with minus");
        }
    }
    public void withMoney(double money){
        if (money >= 0 ){
            pocket -= money;
            outcomeList.add(Double.toString(money));
        }else{
            System.out.println("Cannot add money with minus");
        }
    }
    public double getWallet() {return pocket; }

    public ArrayList getIncomeList() {
        return incomeList;
    }

    public ArrayList getoutcomeList() {
        return outcomeList;
    }
}

