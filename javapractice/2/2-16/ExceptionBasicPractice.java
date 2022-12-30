// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    例外に関する基本問題

    ExceptionBasicPracticeクラスのmainメソッドは一応
    完成しています。

    4200という値をコマンドライン引数で指定した値で割り、
    その計算結果を出力するプログラムです。

    しかし、次の３つの点で不完全です。

    《不完全な理由１》 

        コマンドライン引数なしで実行するとArrayIndexOutOfBoundsException
        例外がスローされてしまう

    《不完全な理由２》

        コマンドライン引数に整数に変換できない文字列を指定するとNumberFormatException
        例外がスローされてしまう

    《不完全な理由３》

        コマンドライン引数に0を指定すると0割りによるArithmeticException
        例外がスローされてしまう

    これらの点を、次の条件を満たすように改善してください。

    １．これらの例外を例外処理（try-catch文）にて捕捉し、次のようなメッセージを
        出力してください。

        不完全な理由１の場合･･･「コマンドライン引数を指定してください」

        不完全な理由２の場合･･･「コマンドライン引数には整数を指定してください」

        不完全な理由３の場合･･･「コマンドライン引数には0以外の整数を指定してください」

    ２．プログラムの最後には正常終了・異常終了に関係なく「プログラムを終了します」という
        メッセージを表示してください。

    ※注意
    これら３つの例外は「非検査例外」といい、通常は例外処理しません。

    【実行結果】
    >java ExceptionBasicPractice
    コマンドライン引数を指定してください
    プログラムを終了します

    【実行結果】
    >java ExceptionBasicPractice A
    コマンドライン引数には整数を指定してください
    プログラムを終了します

    【実行結果】
    >java ExceptionBasicPractice 0
    コマンドライン引数には0以外の整数を指定してください
    プログラムを終了します

    【実行結果】
    >java ExceptionBasicPractice 12
    割り算の結果は350です
    プログラムを終了します

*/
public class ExceptionBasicPractice{

    public static void main(String[] args){

        // 分子変数
        int numerator = 4200;

        // 分母変数
        int denominator;

        // コマンドライン引数を整数値に変換する
        denominator = Integer.parseInt(args[0]);

        // 割り算結果変数に代入
        int result = numerator / denominator;

        System.out.println("割り算の結果は" + result + "です");

    }

}
