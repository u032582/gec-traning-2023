// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    抽象に関する標準問題

    AbstractNormalPracticeクラスのmainメソッドは
    完成しています。（変更しないでください）

    サッカー選手を表現するSoccerPlayer抽象クラスおよび
    センターフォワードを表現するCenterForwardクラスと
    ゴールキーパーを表現するGoalKeeperクラスを作成してください。

    [SoccerPlayer抽象クラス]
    １．選手名を表すnameインスタンスフィールド（String型）と
        背番号を表すuniformNumberインスタンスフィールド（int型）
        を定義します。アクセス指定はprivateに設定します。

    ２．引数に選手名と背番号を受け取るコンストラクタを定義します。
        引数の値をそのままインスタンスフィールドに受け渡します。

    ３．名前を外部から取得できるようにgetNameメソッド（引数なし、戻り値String型）
        を定義します。

    ４．ボールを蹴るkickBallメソッドを定義します。「○○はボールを蹴りました」
        と出力します。

    ５．ボールを受け止めるcatchBallメソッドを定義します。「○○はボールを
        足で受け止めました」と出力します。

    ６．ポジション名取得抽象メソッドgetPositionNameを宣言します。
        引数はなしで、戻り値はString型です。

    ７．toStringメソッドをオーバーライドします。
       「ポジション名 名前 背番号○○」の順に文字列を組み立てます。
       （下記の実行結果を参考にしてください）

    [CenterForwardクラス]
    １．SoccerPlayerクラスを継承します。

    ２．ポジション名を表現するString型の定数POSITION_NAMEを定義します。
        値は「センターフォワード」とします。

    ３．引数に選手名と背番号を受け取るコンストラクタを定義します。
        SoccerPlayerクラスのコンストラクタをうまく使ってインスタンス
        フィールドに値を受け渡します。

    ４．ポジション名取得メソッドgetPositionNameを実装します。戻り値に
        ポジション名定数の値を返します。

    [GoalKeeperクラス]
    １．CenterForwardクラスの手順１〜４と同じです。ポジション名定数の
        値には「ゴールキーパー」を設定してください。

    ２．ボールを受け止めるcatchBallメソッドをオーバーライドします。
       「○○はボールを手で受け止めました」と出力します。

    【実行結果】
    センターフォワード 田村 背番号11
    田村はボールを蹴りました
    田村はボールを足で受け止めました

    ゴールキーパー 川島 背番号12
    川島はボールを蹴りました
    川島はボールを手で受け止めました

*/
public class AbstractNormalPractice{

    public static void main(String[] args){

        // センターフォワードオブジェクトの生成
        SoccerPlayer fwd = new CenterForward("田村", 11);

        // 自己紹介
        System.out.println(fwd);

        // ボールを処理
        fwd.kickBall();
        fwd.catchBall();

        System.out.println();

        // ゴールキーパーオブジェクトの生成
        SoccerPlayer keeper = new GoalKeeper("川島", 12);

        // 自己紹介
        System.out.println(keeper);

        // ボールを処理
        keeper.kickBall();
        keeper.catchBall();

    }

}

// ここにサッカー選手抽象クラスを作成してください

// ここにセンターフォワードクラスを作成してください

// ここにゴールキーパークラスを作成してください

