// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    配列とメソッド定義の問題３の解答例

*/
public class ArrayMethodPractice3Answer{

    public static void main(String[] args){

        int[] arr =  {13,90,10,79,101,25,123,38,5,16,64,55,17};
        int[] arr2 = {38,118,26,17,41,53,10,88,92,102,67,22,55};

        // commonメソッドの呼び出し
        System.out.println("共通する数値の個数：" + common(arr, arr2));

    }

    // commonメソッドの定義
    public static int common(int[] arr, int[] arr2){

        // 共通数格納用変数の宣言と初期化
        int count = 0;

        // １つ目の配列の走査
        for(int i = 0; i < arr.length; i++){

            // ２つ目の配列の走査
            for(int j = 0; j < arr2.length; j++){

                // 共通する数値が見つかった場合
                if(arr[i] == arr2[j]){

                    // 共通数変数をインクリメント
                    count++;

                }

            }

        }

        return count;

    }

}
