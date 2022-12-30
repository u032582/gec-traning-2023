// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ArrayListに関する基本問題

    数字英単語を格納するArrayList<String>型の変数numberがあり、
    zeroからtenまでの数字英単語が格納されています。

    次に、「0から10までの英単語を入力してください」と出力し、
    ユーザに英単語を入力してもらいます。

    ※注意
    System.console().readLine()の記述は、キーボードから文字列の
    入力を受け付け、それをString型の値として返すプログラムです。
    これはそのまま利用してください。

    ArrayList<String>型の変数numberをfor文を用いて走査し、
    入力英単語と文字列の一致を確認します。もし一致した
    場合は「○○は数値の△です」と表示します。もしすべて一致
    しなければ「○○は英単語として存在しません」と表示
    します。（下記実行結果を参考にしてください）

    【実行結果】
    0から10までの英単語を入力してください
    five
    fiveは数値の5です

    【実行結果】
    0から10までの英単語を入力してください
    eit
    eitは英単語として存在しません

*/
import java.util.*;
public class ArrayListBasicPractice {

    public static void main(String[] args){

        // 数字英単語格納用変数の宣言とArrayListオブジェクトの生成
        ArrayList<String> number = new ArrayList<String>();

        // 数字英単語の格納
        number.add("zero");
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");
        number.add("ten");

        // 英単語の入力
        System.out.println("0から10までの英単語を入力してください");
        String input = System.console().readLine();

        // ここからコーディングしてください


    }

}
