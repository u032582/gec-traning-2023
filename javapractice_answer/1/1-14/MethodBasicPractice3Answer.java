// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    メソッド定義の基本問題３の解答例

*/
public class MethodBasicPractice3Answer{

    public static void main(String[] args){

        int x = 88;
        int y = 79;
        int z = 96;

        // calcメソッドの呼び出し
        System.out.print("整数" + x + "," + y + "," + z + "の中で最小の値は");
        System.out.println(min(x, y, z) + "です");

    }

    // minメソッドの定義 その１
    public static int min(int x, int y, int z){

        // 最小値変数の宣言と初期化（xを最小値と仮定）
        int minValue = x;

        // yの方が小さい場合、最小値変数の値を更新
        if(minValue > y){
            minValue = y;
        }

        // zの方が小さい場合、最小値変数の値を更新
        if(minValue > z){
            minValue = z;
        }

        return minValue;

    }

    // minメソッドの定義 その２
    public static int min2(int x, int y, int z){

        // xの値がyやzの値より小さい場合
        if(x < y && x < z){
            return x;
        }
        // yの値がzの値より小さい場合
        else if(y < z){
            return y;
        }
        // それ以外（zの値が一番小さい）
        else{
            return z;
        }

    }

}
