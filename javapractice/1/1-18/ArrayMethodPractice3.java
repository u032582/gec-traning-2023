// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    配列とメソッド定義の問題３

    mainメソッドはすでに完成しています。（変更しないでください）
    mainメソッド内で呼び出している、２つのint配列オブジェクトを引数に取り、
    共通する数値の個数を調べて戻り値として返すcommonメソッドを定義してください。
    （今回のサンプルでは10、17、38、55の４つの数値が２つの配列に共通しています）


    【実行結果】
    共通する数値の個数：4

*/
public class ArrayMethodPractice3{

    public static void main(String[] args){

        int[] arr =  {13,90,10,79,101,25,123,38,5,16,64,55,17};
        int[] arr2 = {38,118,26,17,41,53,10,88,92,102,67,22,55};

        // commonメソッドの呼び出し
        System.out.println("共通する数値の個数：" + common(arr, arr2));

    }

    // ここにcommonメソッドを定義してください


}
