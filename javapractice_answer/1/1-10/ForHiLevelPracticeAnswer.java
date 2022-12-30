// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    for文の上級問題の解答例

*/
public class ForHiLevelPracticeAnswer{

    public static void main(String[] args){

        // 山の段数を表す変数
        int level = 5;

        // １つ目の方法
        for(int i = 0 ; i < level ; i++){

            for(int j = 0 ; j < level + i ; j++){

                if(j < level - i - 1){
                    System.out.print("□");
                }
                else{
                    System.out.print("■");
                }

            }

            System.out.println();

        }

        // ２つ目の方法
        for(int i = 0 ; i < level ; i++){

            for(int j = 0 ; j < level - i - 1 ; j++){

                System.out.print("□");

            }

            for(int j = 0 ; j < (i * 2) + 1 ; j++){

                System.out.print("■");

            }

            System.out.println();

        }

    }

}
