
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aulia
 */
public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi: ");
        int sisi = input.nextInt();
        int luas= sisi*sisi;
        
        System.out.println("Luas persegi dengan"
                + "sisi: "+sisi+" adalah "+luas);
        
    }
    
}
