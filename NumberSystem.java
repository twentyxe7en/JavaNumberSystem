
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zxlbl
 */
public class NumberSystem {

    public NumberSystem() {
    }
    
    private int[] bin = {0,1,10,11,100,101,110,111,1000,1001,1010,1011,1100,1101,1110,1111};
    private String x16 = "0123456789abcdef";
    private int[] oct = {0,1,10,11,100,101,110,111};
    
    public int toBinary(int n) {
        int binary = 0;
        int i = 0;
        while (n != 0) {
            int rem = n % 2;
            double c = Math.pow(10, i);
            binary += rem * c;
            n /= 2;
            i++;
        }
        return binary;
    }
    
    public String toHex(int n) {
        String hex = "";
        while (n != 0) {
            for (int i = 0; i < bin.length; i++) {
                if (n % 10000 == bin[i]) {
                    hex = x16.charAt(i) + hex;
                    n /= 10000;
                    break;
                }
            }
        }
        return hex;
    }
    
    public int toOctal(int n) {
        int octal = 0;
        int e = 0;
        while (n != 0) {
            for (int i = 0; i < oct.length; i++) {
                if (n % 1000 == oct[i]) {
                    octal += i * Math.pow(10, e);
                    n /= 1000;
                    e++;
                    break;
                }
            }
        }
        return octal;
    }
}
