// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    HashMapに関する標準問題

    宝物を表現するTreasureクラスと、金庫を表現する
    StrongBoxクラス、秘密の言葉に関する例外を表現する
    IllegalSecretException例外クラスとDuplicateSecretException
    例外クラスを作成してください。

    その４つのクラスを使用するHashMapNormalPracticeクラスの
    mainメソッドは既に完成しています。（変更しないでください）

    [Treasureクラス]
    １．宝物のタイプを表現するtypeインスタンスフィールド(String型)
        を定義します。

    ２．タイプの値を受け取るコンストラクタを定義します。
        タイプの値をインスタンスフィールドに設定します。

    ３．オブジェクトの文字列表現を返すためのtoStringメソッドを
        オーバーライドします。戻り値として返す値は、typeインスタンス
        フィールドの値そのものです。

    [ IllegalSecretException例外クラスとDuplicateSecretException例外クラス]
    １．検査例外なのでExceptionクラスを継承します。

    ２．クラスの中は空っぽでいいです。

    [StrongBoxクラス]
    １．HashMap<String, Treasure>型の宝物保持HashMapインスタンスフィールド
        treasuresを定義します。キーのString型は、秘密の言葉を表現します。

    ２．引数なしコンストラクタを定義します。宝物保持HashMapインスタンス
        フィールドtreasuresのオブジェクトをここで生成してください。

    ３．秘密の言葉と宝物を金庫に格納するstoreメソッドを定義します。
        第一引数は秘密の言葉（String型）、第二引数は宝物オブジェクト
       （Treasure型）です。戻り値はなしです。検査例外DuplicateSecretException
        をスローする可能性があるので、throwsが必要です。
        まず、引数で渡ってきた秘密の言葉がすでに使用されているかをチェックします。
        すでに使用されている場合は、DuplicateSecretExceptionのインスタンスを生成し、
        スローします。
        秘密の言葉がまだ使用されていない場合は、「○○を金庫に格納しました！」と
        出力し、HashMapインスタンスフィールドtreasuresに秘密の言葉をキーとして
        宝物オブジェクトを格納してください。

    ４．秘密の言葉に対する宝物オブジェクトを取得するgetTreasureメソッドを
        定義します。引数は秘密の言葉（String型）、戻り値は宝物オブジェクト
       （Treasure型）です。検査例外IllegalSecretExceptionをスローする可能性が
        あるので、throwsが必要です。
        HashMapインスタンスフィールドtreasuresから、秘密の言葉を元に宝物
        オブジェクトを取得し、戻り値として返します。
        もし秘密の言葉が不正の場合は、HashMapオブジェクトはnullを返すので、
        その場合はIllegalSecretExceptionのインスタンスを生成し、スローします。

    【実行結果】
    ダイヤの指輪を金庫に格納しました！
    真珠のネックレスを金庫に格納しました！
    金のブレスレットを金庫に格納しました！
    秘密の言葉「xrt03」はすでに使われています

    ダイヤの指輪をゲットしました！
    真珠のネックレスをゲットしました！
    秘密の言葉「xrr03」は不正です

*/

public class HashMapNormalPractice{

    public static void main(String[] args){

        // 金庫インスタンスの作成
        StrongBox guard = new StrongBox();

        // 秘密の言葉変数の宣言
        String secret = null;

        try{

            // １つ目の宝物を格納
            secret = "sgf01";
            guard.store(secret, new Treasure("ダイヤの指輪"));

            // ２つ目の宝物を格納
            secret = "zkq02";
            guard.store(secret, new Treasure("真珠のネックレス"));

            // ３つ目の宝物を格納
            secret = "xrt03";
            guard.store(secret, new Treasure("金のブレスレット"));

            // ４つ目の宝物を格納（秘密の言葉が重複）
            secret = "xrt03";
            guard.store(secret, new Treasure("プラチナのイヤリング"));

        }
        catch(DuplicateSecretException e){
            System.out.println("秘密の言葉「" + secret + "」はすでに使われています");
        }

        System.out.println();

        try{

            // １つ目の宝物を取得
            secret = "sgf01";
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "をゲットしました！");

            // ２つ目の宝物を取得
            secret = "zkq02";
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "をゲットしました！");

            // ３つ目の宝物を取得(秘密の言葉が不正)
            secret = "xrr03";
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "をゲットしました！");

        }
        catch(IllegalSecretException e){
            System.out.println("秘密の言葉「" + secret + "」は不正です");
        }

    }

}

// ここに宝物クラスを作成してください

// ここに秘密の言葉不正例外クラスを作成してください

// ここに秘密の言葉重複例外クラスを作成してください

// ここに金庫クラスを作成してください

