// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    変数に関する問題の解答例

*/
public class VariablePracticeAnswer{

    public static void main(String[] args){

        // りんごの価格変数の宣言
        int applePrice;

        // りんごの価格変数に130を代入
        applePrice = 130;

        // りんごの個数変数の宣言（初期値 6）
        int appleCount = 6;

        // りんごの総価格変数の宣言
        // （初期値 りんご価格変数の値×りんご個数変数の値）
        int appleTotalPrice = applePrice * appleCount;

        // りんご価格変数の値を出力
        System.out.println("りんごの価格：" + applePrice + "円");

        // りんご個数変数の値を出力
        System.out.println("りんごの個数：" + appleCount + "個");

        // りんご総価格変数の値を出力
        System.out.println("りんごの総価格：" + appleTotalPrice + "円");

    }

}
