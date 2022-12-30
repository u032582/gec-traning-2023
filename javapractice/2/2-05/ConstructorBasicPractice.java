// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    コンストラクタの基本問題

    四角形を表すSquareクラスを作成してください。
    Squareクラスを使用するConstructorBasicPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Squareクラス]
    １．幅widthと高さheight(どちらもdouble型)の２つのインスタンス
        フィールドを持ちます。

    ２．幅と高さの初期値を引数として受け取るコンストラクタが存在します。
        受け取った初期値をそのまま各フィールドにセットしてください。

    ３．幅と高さに関する情報を出力するinformメソッド(引数なし・戻り値なし)が
        存在します。出力内容は、実行結果を参考にしてください。

    ４．面積を算出するgetAreaメソッド(引数なし・戻り値double型)が存在します。

    ５．幅の値を引数で受け取った増分だけ増加するaddWidthメソッド
        (引数double型・戻り値なし)が存在します。

    【実行結果】
    この四角形の幅は4.5、高さは2.8です。
    この四角形の面積は12.6です。

    この四角形の幅は7.5、高さは2.8です。
    この四角形の面積は21.0です。

*/
public class ConstructorBasicPractice{

    public static void main(String[] args){

        // Squareクラスのオブジェクトを作成
        Square square = new Square(4.5, 2.8);

        // 四角形の情報を出力
        square.inform();

        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");

        // 幅を3.0増加させる
        square.addWidth(3.0);

        System.out.println();

        // 四角形の情報を出力
        square.inform();

        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");

    }

}

// ここにSquareクラスを作成してください

