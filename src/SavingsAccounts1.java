import javax.swing.*;

public class SavingsAccounts1 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(0.0, "Dean", 1234567);

        SavingsAccount savingsAccount2 = new SavingsAccount(420.69, "Shane", 8972645);

        SavingsAccount savingsAccount3 = new SavingsAccount(999.99, "Jack", 9876543);

        JOptionPane.showMessageDialog(null, savingsAccount1.toString());

        JOptionPane.showMessageDialog(null, savingsAccount2.toString());

        JOptionPane.showMessageDialog(null, savingsAccount3.toString());
    }
}
