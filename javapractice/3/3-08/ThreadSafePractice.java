// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    スレッドセーフに関する問題

    ５人の大富豪が１つの募金箱に同時に募金していく様子をシミュレート
    しています。

    大富豪を表現するMultiMillionaireクラスと、募金箱を表現する
    CollectionBoxクラスを作成してください。

    また、これらのクラスを使用するThreadSafePracticeクラスの
    mainメソッドは完成しています。（変更しないでください）

    [MultiMillionaireクラス]
    １．Threadクラスを継承します。

    ２．募金箱インスタンスフィールドを定義します。

    ３．募金箱オブジェクトを引数に受け取るコンストラクタを定義します。
        引数で受け取ったオブジェクトを、インスタンスフィールドに格納してください。

    ４．runメソッドをオーバーライドします。for文を用いて100万回ループさせます。
        for文の中では、募金箱に対して1円を募金します。
        （1円募金×100万回ループなので、100万円寄付することになります）

    [CollectionBoxクラス]
    １．募金総額を表すインスタンスフィールドtotalAmount(int型)を定義します。

    ２．募金箱オブジェクトは、絶対に１つだけしか存在しないようにしてください。

        ・別クラスからインスタンス化できないようにコンストラクタを工夫してください。
        ・クラスメソッドgetInstanceを用いて、募金箱オブジェクトを取得してください。
        ・CollectionBox型のクラスフィールドを定義して、うまく利用してください。

    ３．お金を寄付するためのcontributeメソッドを定義してください。
        引数は寄付する金額（int型）で、戻り値はなしにします。

        このメソッドをスレッドセーフにするように注意してください。

    ４．募金総額を取得するためのgetTotalAmountメソッドを定義してください。
        引数はなしで、戻り値に募金総額フィールドの値を返してください。

        ただし、最後に表示する募金総額には絶対にずれが生じないようにしてください。

    【正しい実行結果】
    募金総額は5000000円です。

    【正しくない実行結果（不定）】
    募金総額は3294875円です。

*/
public class ThreadSafePractice{

    public static void main(String[] args){

        // 募金箱オブジェクトの取得
        CollectionBox cb = CollectionBox.getInstance();

        // 偽物の募金箱を作れないようにする（コンパイルエラー）
        // CollectionBox imitation = new CollectionBox();

        // ５人の大富豪オブジェクトを生成
        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);

        // 募金の開始
        mm1.start(); mm2.start(); mm3.start(); mm4.start(); mm5.start();

        // 全員の募金が終わるまで待つ
        try{
            mm1.join(); mm2.join(); mm3.join(); mm4.join(); mm5.join(); 
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        // 募金総額の発表
        System.out.println("募金総額は" + cb.getTotalAmount() + "円です。");

    }

}

// ここに大富豪クラスを作成してください

// ここに募金箱クラスを作成してください

