import java.util.HashMap;

public class NumberSystem {

    public NumberSystem() {
    // Initialize hexadecimal map
        hexa.put(0, '0');
        hexa.put(1, '1');
        hexa.put(10, '2');
        hexa.put(11, '3');
        hexa.put(100, '4');
        hexa.put(101, '5');
        hexa.put(110, '6');
        hexa.put(111, '7');
        hexa.put(1000, '8');
        hexa.put(1001, '9');
        hexa.put(1010, 'a');
        hexa.put(1011, 'b');
        hexa.put(1100, 'c');
        hexa.put(1101, 'd');
        hexa.put(1110, 'e');
        hexa.put(1111, 'f');
         // Initialize octal map
        octa.put(0, 0);
        octa.put(1, 1);
        octa.put(10, 2);
        octa.put(11, 3);
        octa.put(100, 4);
        octa.put(101, 5);
        octa.put(110, 6);
        octa.put(111, 7);
    }

    private HashMap<Integer, Character> hexa = new HashMap<Integer, Character>();
    private HashMap<Integer, Integer> octa = new HashMap<Integer, Integer>();

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
            hex = hexa.get(n % 10000) + hex;
            n /= 10000;
        }
        return hex;
    }

    public int toOctal(int n) {
        int octal = 0;
        int e = 0;
        while (n != 0) {
            octal += octa.get(n % 1000) * Math.pow(10, e);
            n /= 1000;
            e++;
        }
        return octal;
    }
}
