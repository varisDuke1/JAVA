/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alpro;

/**
 *
 * @author MSI
 */
public class HH {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Nilai i=" + i);
        }

        System.out.println("Hitung mundur");

        for (int i = 10; i > 0; i--) {
            System.out.println("Nilai i=" + i);
        }

        System.out.println("Nested Loop");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Nilai i=" + i + ";nilai j=" + j);
            }
        }
    }
}
