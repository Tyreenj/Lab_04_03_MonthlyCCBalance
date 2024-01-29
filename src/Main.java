//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double cardBalance = 5000;
        double monthOneBalance;
        double monthTwoBalance;

        monthOneBalance = cardBalance * 1.17;
        monthTwoBalance = monthOneBalance * 1.17;

        System.out.println("Your interest after one month is " +monthOneBalance);
        System.out.println("Your interest after two months is " +monthTwoBalance);

    }
}