// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    継承とコンストラクタの問題

    雑誌を表すMagazineクラスを作成してください。

    本を表すBookクラスはすでに完成しています。
    （変更しないでください）

    また、Magazineクラスを使用するInheritanceBasicPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Magazineクラス]
    １．Bookクラスを継承します。

    ２．スーパークラスから受け継いだ２つのインスタンスフィールド
        （タイトル、価格）のほかに、表紙に掲載されているタレント名を
        保持するためのcoverPersonNameインスタンスフィールド(String型)
        を定義します。

    ３．引数にタイトル、価格、表紙タレント名の３つの値を受け取る
        コンストラクタを定義します。そのうちタイトル、価格の２つの
        値は、スーパークラスのコンストラクタを利用して受け渡します。

    ４．雑誌の内容を紹介するshowインスタンスメソッドを定義します。
        出力内容は、下記実行結果を参考にしてください。

    【実行結果】
    東京Runner絶賛発売中！！
    定価650円
    今回の表紙：上野彩さん

*/
public class InheritanceConstructorPractice{

    public static void main(String[] args){

        // Magazineクラスのオブジェクトを生成
        Magazine magazine = new Magazine("東京Runner", 650, "上野彩");

        // 雑誌の内容紹介メソッドの呼び出し
        magazine.show();

    }

}

// Bookクラス
class Book{

    // タイトル
    private String title;

    // 価格
    private int price;

    // コンストラクタ
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    // タイトル取得メソッド
    public String getTitle(){
        return title;
    }

    // 価格取得メソッド
    public int getPrice(){
        return price;
    }

}

// ここにMagazineクラスを作成してください

