// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    switch文の基本問題

    int型の変数monthが宣言してあります。変数monthは月を表しています。

    ※注意
    Integer.parseInt(System.console().readLine())の記述は、キーボードから
    文字列の入力を受け付け、それをint型に変換するプログラムです。
    これはそのまま利用してください。ただし、キーボードから「ABC」のような
    入力を行うと、int型に変換できずに例外をスローします。

    変数monthの値が1,3,5,7,8,10,12の場合は「○月は31日まであります」
    と表示し、4,6,9,11の場合は「○月は30日まであります」と表示します。
    2の場合は「2月は28、または29日まであります」と表示します。

    また、変数monthの値が1 〜 12 以外の値の場合は「エラー」と
    表示してください。

    条件分岐には必ずswitch文を使用してください。
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    【実行結果】
    月を入力してください
    1
    1月は31日まであります

    【実行結果】
    月を入力してください
    2
    2月は28、または29日まであります

    【実行結果】
    月を入力してください
    4
    4月は30日まであります

    【実行結果】
    月を入力してください
    13
    エラー

*/
public class SwitchBasicPractice{

    public static void main(String[] args){

        System.out.println("月を入力してください");

        int month = Integer.parseInt(System.console().readLine());

        // switch文の開始


    }

}
