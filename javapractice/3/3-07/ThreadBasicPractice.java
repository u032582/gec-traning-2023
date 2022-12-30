// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    スレッドに関する基本問題

    スレッドによる走行を表現するRacingCarクラスを作成してください。

    RacingCarクラスを使用するThreadBasicPracticeクラスのmainメソッド
    は完成しています。（変更しないでください）

    [RacingCarクラス]
    １．Threadクラスを継承します。

    ２．ゴール地点までの距離を表すint型の定数GOALを定義します。
        定数GOALの値は100を代入して初期化してください。

    ３．RacingCarクラスは次の３つのインスタンスフィールドを持ちます。

        車の名前を表すname(String型)
        その車の最高走行距離を表すmaxDistance(int型)
        その車のエンストする割合を表すengineStop(int型)

    ４．次の引数を持つコンストラクタを１つ作成してください。
        第１引数 車の名前を表すString型の引数
        第２引数 最高走行距離を表すint型の引数
        第３引数 エンストする割合を表すint型の引数

    ５．runメソッドをオーバーライドします。２つのローカル変数を宣言します。

        総走行距離を表すint型 totalMileage
        一回の走行距離を表すint型 mileage

    ６．ランダムの雰囲気を出すために、java.utilパッケージのRandomクラスを
        使用します。

        [Randomクラスの使い方]
        Random r = new Random();
        System.out.println(r.nextInt(6) + 1);
        これで1〜6を表示するさいころの出来上がりです。

    ７．runメソッドでは、ゴールするまで走行します。
        まず、エンストするかどうかをRandomクラスを使って表現します。
        engineStopの値が10なら、10回に1回の割合でエンストします。
        エンストした場合は「○○がエンストしました！」と表示し、
        3秒間停止します。
        エンストしなかった場合は走行します。
        走行距離は、1から最高走行距離maxDistanceの間のランダムな値です。
        そして「○○が△△km走行しました！」と表示します。
        総走行距離がGOAL定数を超えていればループを抜けて
        「○○がゴールしました！！！！！」と表示して終了します。
        まだ総走行距離がGOAL定数に達していなければ1秒停止して走行を
        続けます。

    【実行結果の一例】
    Careful号が3km走行しました！
    Normal号がエンストしました！
    Normal号が3km走行しました！
    …
    Careful号が2km走行しました！
    Gambler号が15km走行しました！
    Gambler号がゴールしました！！！！！
    Careful号が4km走行しました！
    Normal号が8km走行しました！
    Careful号が1km走行しました！
    Careful号が4km走行しました！
    Careful号がゴールしました！！！！！
    Normal号が8km走行しました！
    Normal号がゴールしました！！！！！
    レースが終了しました

*/
public class ThreadBasicPractice{

    public static void main(String[] args){

        // 平均的な性能のnormal号
        RacingCar normal = new RacingCar("Normal号", 10, 10);

        // スピードはあるがエンストが多いgambler号
        RacingCar gambler = new RacingCar("Gambler号", 20, 3);

        // 安全面を重視したcareful号
        RacingCar careful = new RacingCar("Careful号", 5, 1000);

        // 各車一斉にスタート！！
        normal.start();
        gambler.start();
        careful.start();

        // 全車がゴールするのを待つ
        try{

            normal.join();
            gambler.join();
            careful.join();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("レースが終了しました");

    }

}

// ここにRacingCarクラスを作成してください

