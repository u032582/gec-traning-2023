// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    staticに関する基本問題

    ロボットを表すRobotクラスを作成してください。
    Robotクラスを使用するStaticBasicPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Robotクラス]
    １．次のような２つのインスタンスフィールドと、１つのクラスフィールド
        を持ちます。

      ・ロボットIDを表すインスタンスフィールド id (int型)

      ・ロボット名を表すインスタンスフィールド name (String型)

      ・ロボット総生産数を表すクラスフィールド total (int型)

    ２．String型の引数をひとつだけ持つコンストラクタを定義します。
        引数で渡ってきた文字列をロボット名に設定し、ロボット総生産数を
        インクリメントします。ロボットIDは1からの連番を割り振りますが、
        ロボット総生産数の値をうまく利用してください。

    ３．ロボット総生産数の値を取得するためのgetTotalクラスメソッド
       （引数なし・戻り値int型）を定義します。

    ４．ロボットの情報を紹介するためのintroduceメソッド(引数なし・戻り値なし)
        を定義します。実装は下記実行結果を参考にしてください。

    【実行結果】
    ロボット総生産数：0
    ロボット総生産数：5
    ロボット総生産数：6

    ID：1 NAME：RX
    ID：2 NAME：PZ
    ID：3 NAME：SS
    ID：4 NAME：FG
    ID：5 NAME：VC
    ID：6 NAME：SUPER-Z

*/
public class StaticBasicPractice{

    public static void main(String[] args){

        // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        // ５体のロボットオブジェクトを作成
        // （６体目は保留）
        Robot[] robots = { 
                            new Robot("RX"),
                            new Robot("PZ"),
                            new Robot("SS"),
                            new Robot("FG"),
                            new Robot("VC"),
                            null
                          };

        // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        // ６体目のロボットオブジェクトを作成
        robots[5] = new Robot("SUPER-Z");

        // ロボット総生産数の取得
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        System.out.println();

        // ６体のロボットの情報を表示
        for(int i = 0 ; i < robots.length ; i++){
            robots[i].introduce();
        }

    }

}

// ここにRobotクラスを作成してください

