// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    二次元配列の問題の解答例

*/
public class DoubleArrayBasicPracticeAnswer{

    public static void main(String[] args){

        // int２次元配列型変数arrの宣言と初期化
        int[][] arr = { {11, 22, 33}, {44}, {55, 66}, {77, 88, 99} };

        // 配列のすべての要素を順に表示
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j]);

            }

        }

        System.out.println();

        // 配列のすべての要素を逆から表示
        for(int i = (arr.length - 1); i >= 0; i--){

            for(int j = (arr[i].length - 1); j >= 0; j--){

                System.out.print(arr[i][j]);

            }

        }

    }

}
