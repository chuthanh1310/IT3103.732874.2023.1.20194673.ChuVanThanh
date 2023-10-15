import javax.swing.JOptionPane;
public class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String notification = "You've just entered: ";
        
        num1 = JOptionPane.showInputDialog(null, "Input first number: ", "First number", JOptionPane.INFORMATION_MESSAGE);
        notification += num1 + "and";

        num2 = JOptionPane.showInputDialog(null, "Input second number: ", "Second number", JOptionPane.INFORMATION_MESSAGE);
        notification += num2;

        JOptionPane.showMessageDialog(null, notification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
