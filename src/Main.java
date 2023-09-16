// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonalAccount adik = new PersonalAccount(220104008, "Argen");
        PersonalAccount azar = new PersonalAccount(220104002, "Adilet");
        adik.deposit(400);
        adik.withdraw(-200);
        adik.printTransactionHistory();
    }
}