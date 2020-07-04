package Exemplos.ArrayExemplo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 3, 45, 45, 23, 8};
        nums[2] = 25;
        System.out.println(Arrays.toString(nums));

        String[] nomes = {"Luiz", "Filipy", "Ana", "Paula"};
        System.out.println(Arrays.toString(nomes));

        String[] pais = new String[10];
        pais[5] = "Brasil";
        System.out.println(Arrays.toString(pais));

        int[][] nums2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}};
        System.out.println(Arrays.deepToString(nums2));

//        int[][] num3 = nums2.clone(); shallow copy
    }
}
