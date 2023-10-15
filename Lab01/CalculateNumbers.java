import javax.swing.JOptionPane;
public class CalculateNumbers{
    public static void main(String[] args) {
        double sum,difference,product,quotient;
        String strnum1,strnum2;
        String strNoti="Result: ";
        strnum1= JOptionPane.showInputDialog(null, "Please Input the first number", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
        double num1=Double.parseDouble(strnum1);
        strnum2= JOptionPane.showInputDialog(null, "Please Input the 2nd number", "Input the 2nd number",JOptionPane.INFORMATION_MESSAGE);
        double num2=Double.parseDouble(strnum2);
        sum=num1+num2;
        difference=num1-num2;
        product=num1*num2;
        quotient=num1/num2;
        strNoti=strNoti+"Tong: "+sum +"\nHieu: "+difference+"\nTich: "+product+"\nThuong: "+quotient;
        JOptionPane.showMessageDialog(null,strNoti+"\n");
        System.exit(0);
    }
}