// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    独自例外の問題

    自動車を表すCarクラスと、ガス欠を表すGasolineException
    例外クラスを作成してください。

    また、Carクラスを使用するOriginalExceptionPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [ GasolineException例外クラス ]
    １．このクラスは検査例外なので、Exceptionクラスを継承します。

    ２．String型の引数を１つ持つコンストラクタを定義します。
        スーパークラスであるExceptionクラスにも同じシグネチャの
        コンストラクタが存在するので、引数で受け取ったデータを
        スーパークラスのコンストラクタに渡します。

    [ Carクラス ]
    １．Carクラスには３つのインスタンスフィールドがあります。

      ・ナンバーを表すnumberインスタンスフィールド（int型）
      ・車種を表すtypeインスタンスフィールド（String型）
      ・ガソリン量を表すgasインスタンスフィールド（double型）

    ２．引数を３つ受け取るコンストラクタを定義します。
        その受け取った３つの値は、そのまま３つのインスタンスフィールド
        に渡します。(mainメソッドの記述を参考にしてください)

    ３．車の走行を表すrunインスタンスメソッド（引数・戻り値なし）を
        定義します。runメソッドはガス欠を表現するGasolineException例外
        をスローする可能性があるので、throwsキーワードを用いて指定してください。
        メソッドの最初の処理として、ガソリン量をチェックします。
        ガソリン量が0.1リットル未満の場合は、ガス欠例外クラスをインスタンス化し、
        スローします。インスタンス化するとき、エラーメッセージをコンストラクタの
        引数として渡します。（エラーメッセージは下記実行結果を参考）
        ガソリン量が0.1リットル以上の場合は走行メッセージを表示し、ガソリン量を
        0.1リットル分減らします。（走行メッセージは下記実行結果を参考）

    【実行結果】
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオは走行しています。
    ナンバー123のロミオはガソリン不足のため走行できません。

*/
public class OriginalExceptionPractice{

    public static void main(String[] args){

        // 自動車オブジェクトの生成
        Car mycar = new Car(123, "ロミオ", 0.8);

        // ガソリンがなくなるまで走行する
        try{
            while(true){
                // 走行する
                mycar.run();
            }
        }
        catch(GasolineException e){
            System.out.println(e.getMessage());
        }

    }

}

// ここに車クラスを作成してください

// ここにガス欠例外クラスを作成してください
