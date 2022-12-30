// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    クラス作成の標準問題

    人を表すPersonクラスを作成してください。
    Personクラスを使用するClassNormalPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Personクラス]
    Personクラスには次の２つのインスタンスフィールドがあります。

    １．氏名を表すname (String型)
    ２．年齢を表すage (int型)

    Personクラスには５つのインスタンスメソッドが必要です。

    １．氏名と年齢をオブジェクトにセットするためのsetDataメソッド
    ２．年齢の情報を取得するためのgetAgeメソッド
    ３．名前の情報を取得するためのgetNameメソッド
    ４．自己紹介をするintroduceメソッド
    ５．引数で渡ってきた他の人と年齢を比較するcompareメソッド


    【実行結果】
    わたしの名前は大島、年齢は30歳です。
    わたしの名前は村上、年齢は30歳です。
    わたしの名前は黒沢、年齢は32歳です。

    わたくし大島は、村上さんと同じ年齢です。
    わたくし大島は、黒沢さんより2歳年下です。
    わたくし黒沢は、村上さんより2歳年上です。

*/
public class ClassNormalPractice{

    public static void main(String[] args){

        // Personクラスのオブジェクトを作成
        Person[] persons = { new Person(), new Person(), new Person()};

        // Personオブジェクトに氏名と年齢をセット
        persons[0].setData("大島", 30);
        persons[1].setData("村上", 30);
        persons[2].setData("黒沢", 32);

        // 自己紹介
        for(int i = 0; i < persons.length; i++){
            persons[i].introduce();
        }

        System.out.println();

        // 年齢差をチェック
        persons[0].compare(persons[1]);
        persons[0].compare(persons[2]);
        persons[2].compare(persons[1]);

    }

}

// ここにPersonクラスを作成してください

