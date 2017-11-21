/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import java.util.Scanner;

/**
 *
 * @author Windows 8
 */
public class Driver {
        public static void main(String [] args){
        Boosters x = new Boosters();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int y = in.nextInt();
        for(int i = 0; i < y; i++){
            System.out.println("Data ke " + (i+1) + " = ");
            x.insert(in.nextInt());
            x.place(x.root);
        }
        x.toString();
    }
}
