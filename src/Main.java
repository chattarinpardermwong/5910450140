import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Player p = new Player();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("-----WELCOME-----");
        System.out.println("-------To--------");
        System.out.println("-----SPENDEE-----");
        System.out.println("-----------------");
        System.out.println("Input to do something");
        System.out.println("-----------------");
        System.out.println("Input 1 : Add Money");
        System.out.println("Input 2 : Withdraw Money");
        System.out.println("Input 3 : Show your Money");
        System.out.println("Input 4 : Add History");
        System.out.println("Input 5 : Withdraw History");
        System.out.println("Input 6 : EXIT");

        while (true){
            System.out.print("Input : ");
            Integer x = sc.nextInt();
            if (x == 1){
                System.out.print("Add : ");
                double money = sc.nextDouble();
                p.addMoney(money);
            }
            if (x == 2){
                System.out.print("Withdraw : ");
                double money = sc.nextDouble();
                p.withMoney(money);
            }
            if (x == 3){
                System.out.println("Your money :" + p.getWallet());
            }
            if (x == 4){
                System.out.println("Your Income : " + p.getIncomeList());
            }
            if (x == 5){
                System.out.println("Your outcome : " + p.getoutcomeList());
            }
            if (x == 6){
                System.out.println("Good Bye");
                break;
            }
        }
    }
}
