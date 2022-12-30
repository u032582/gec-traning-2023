// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    配列の基本問題の解答例

*/
public class ArrayBasicPracticeAnswer{

    public static void main(String[] args){

        // １．int配列型変数の宣言
        int[] arr;

        // ２．配列オブジェクトの生成
        arr = new int[3];

        // ３．各要素の値を代入
        arr[0] = 25;
        arr[1] = 39;
        arr[2] = 43;

        // ４．各要素の値を表示
        for(int i = 0; i < arr.length; i++){
            System.out.println((i + 1) + "番目の値は" + arr[i] + "です");
        }

    }

}
