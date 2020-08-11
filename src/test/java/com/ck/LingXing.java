package com.ck;

import org.junit.Test;

public class LingXing {
    @Test
    public void Lx(){
        int row = 4;
        for (int i = 1;i<row;i++){
            for (int kongge = row-i;kongge>0;kongge--){
                System.out.print(" ");
            }
            for (int xinghao=0;xinghao<2*(i-1)+1;xinghao++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1;i<=row;i++){
            for (int kongge = 1;kongge<i;kongge++){
                System.out.print(" ");
            }
            for (int xinghao=7;xinghao>=2*(i-1)+1;xinghao--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
