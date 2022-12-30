// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    継承に関する基本問題

    ピッチャーを表すPitcherクラスを作成してください。

    一般的な野球選手を表現するBaseballPlayerクラスは
    すでに完成しています。（変更しないでください）

    また、Pitcherクラスを使用するInheritanceBasicPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Pitcherクラス]
    １．BaseballPlayerクラスを継承します。

    ２．スーパークラスから受け継いだ３つのインスタンスフィールドの
        ほかに、防御率を表すeraインスタンスフィールド（double型）
        を定義します。

    ３．引数に選手名、背番号、打率、防御率の４つの値を受け取る
        コンストラクタを定義します。そのうち選手名、背番号、打率の
        ３つの値は、スーパークラスのインスタンスフィールドに受け渡します。

    ４．投手の情報を紹介するintroduceインスタンスメソッドを定義します。
        出力内容は、下記実行結果を参考にしてください。

    【実行結果】
    選手名：山田
    背番号：99
    打率　：0.09
    防御率：2.13

*/
public class InheritanceBasicPractice{

    public static void main(String[] args){

        // 投手オブジェクトの生成
        Pitcher p = new Pitcher("山田", 99, 0.09, 2.13);

        // 投手の紹介
        p.introduce();

    }

}

// 野球選手クラス
class BaseballPlayer{

    // 選手名
    protected String name;

    // 背番号
    protected int uniformNumber;

    // 打率
    protected double battingAverage;

}

// ここにPitcherクラスを作成してください


