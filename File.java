package latihan_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aryab
 */
public class fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner jumlah_nilai = new Scanner(System.in);
        
        System.out.println("Masukan Jumlah Nilai Fibbonacci Yang Anda Inginkan");
        int ab = jumlah_nilai.nextInt();
        
        
        int[] fibo = new int[ab];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for (int i = 2; i < ab; i++) {
            fibo[i] = fibo[i-2] + fibo[i-1];
        }
        
        System.out.println(Arrays.toString(fibo));
    }
}
