// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    配列とメソッド定義の問題の解答例

*/
public class ArrayMethodPracticeAnswer{

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // sumメソッドの呼び出し
        System.out.println("配列の合計値：" + sum(arr));

    }

    // sumメソッドの定義
    public static int sum(int[] arr){

        // 合計値格納用変数の宣言と初期化
        int total = 0;

        // 配列の走査
        for(int i = 0; i < arr.length; i++){

            // 配列の各要素を加算していく
            total += arr[i];

        }

        return total;

    }

}
