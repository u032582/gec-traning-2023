// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if文の基本問題の解答例

*/
public class IfBasicPracticeAnswer{

    public static void main(String[] args){

        System.out.println("整数を入力してください");

        // 整数変数の宣言と初期化
        int value = Integer.parseInt(System.console().readLine());

        // 偶数・奇数の判定
        if(value % 2 == 0){
            System.out.println("偶数です");
        }
        else{
            System.out.println("奇数です");
        }

        // ３の倍数の判定
        if(value % 3 == 0){

            System.out.println("３の倍数です");

        }

        // ４の倍数の判定
        if(value % 4 == 0){

            System.out.println("４の倍数です");

        }

        // ５の倍数の判定
        if(value % 5 == 0){

            System.out.println("５の倍数です");

        }

    }

}
