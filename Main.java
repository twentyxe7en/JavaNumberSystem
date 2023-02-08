
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zxlbl
 */
public class Main {
    public static void main(String[] args) {
        NumberSystem numsys = new NumberSystem();
        Scanner in = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.println("===================================");
            System.out.print("Enter a decimal: ");
            n = in.nextInt();
            System.out.println("Binary: " + numsys.toBinary(n));
            System.out.println("Hexadecimal: " + numsys.toHex(numsys.toBinary(n)));
            System.out.println("Octal: " + numsys.toOctal(numsys.toBinary(n)));
        }
    }
}
