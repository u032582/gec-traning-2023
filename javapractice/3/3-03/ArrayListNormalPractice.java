// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ArrayListに関する標準問題

    デジカメを表現するDigitalCameraクラスと、画像を表現する
    Pictureクラスを作成してください。

    また、デジカメクラスを使用するArrayListNormalPracticeクラスの
    mainメソッドは完成しています。（変更しないでください）

    [Pictureクラス]
    １．被写体を表現するインスタンスフィールドtarget(String型)を定義します。

    ２．被写体(String型)を引数に受け取るコンストラクタを定義します。
        引数で受け取った値を、インスタンスフィールドに格納してください。

    ３．オブジェクトの説明文を文字列として戻すためのtoStringメソッドを
        オーバーライドしてください。戻り値として返す値は「○○の画像」と
        いう文字列です。

    [DigitalCameraクラス]
    １．撮影した画像を管理するArrayList<Picture>型のメモリインスタンス
        フィールドmemoryを定義します。

    ２．引数なしコンストラクタを定義します。その中で、メモリインスタンス
        フィールドのオブジェクトを生成します。

    ３．画像撮影メソッドtakePictureを定義します。引数は被写体（String型）で、
        戻り値はありません。「○○を撮影しました」と出力した後にメモリオブジェクト
        に画像オブジェクトを登録します。

    ４．画像一覧表示メソッドshowPicturesを定義します。引数・戻り値はなしです。
        まず「★☆  画像一覧  ☆★」と出力し、拡張for文を用いて画像の情報を
        順に出力します。

    ５．保存画像数取得メソッドgetPictureCountを定義します。引数はなしで、戻り値
        は保存枚数（int型）です。メモリオブジェクトに格納されている画像オブジェクト
        の個数を戻り値として返します。

    ６．画像全消去メソッドclearMemoryを定義します。引数・戻り値はなしです。
       「すべての画像を消去しました」と出力し、メモリオブジェクトに格納されて
        いるすべての画像オブジェクトをクリアします。

    【実行結果】
    子猫を撮影しました。
    ランチを撮影しました。
    カプチーノを撮影しました。
    赤ちゃんを撮影しました。
    ツーショットを撮影しました。

    現在の撮影枚数：5

    ★☆  画像一覧  ☆★
    子猫の画像
    ランチの画像
    カプチーノの画像
    赤ちゃんの画像
    ツーショットの画像

    すべての画像を消去しました

    現在の撮影枚数：0

*/

public class ArrayListNormalPractice{

    public static void main(String[] args){

        // デジカメオブジェクトの宣言と生成
        DigitalCamera myCamera = new DigitalCamera();

        // デジカメにて撮影
        myCamera.takePicture("子猫");
        myCamera.takePicture("ランチ");
        myCamera.takePicture("カプチーノ");
        myCamera.takePicture("赤ちゃん");
        myCamera.takePicture("ツーショット");

        System.out.println();

        // 撮影画像数の確認
        System.out.println("現在の撮影枚数：" + myCamera.getPictureCount());

        System.out.println();

        // 画像の閲覧
        myCamera.showPictures();

        System.out.println();

        // 画像ファイルのクリア
        myCamera.clearMemory();

        System.out.println();

        // 撮影画像数の再確認
        System.out.println("現在の撮影枚数：" + myCamera.getPictureCount());

    }

}

// ここにデジカメクラスを作成してください

// ここに画像クラスを作成してください

