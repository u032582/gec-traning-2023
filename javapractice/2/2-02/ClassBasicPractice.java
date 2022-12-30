// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    クラス作成の基本問題

    ペットを表すPetクラスを作成してください。
    Petクラスを使用するClassBasicPracticeクラスのmainメソッドは
    すでに完成しています。（変更しないでください）

    [Petクラス]
    Petクラスは次の４つのprivateインスタンスフィールドを持ちます。

    １．動物の種類を保持するためのtypeフィールド（String型）
    ２．名前を保持するためのnameフィールド（String型）
    ３．年齢を保持するためのageフィールド（byte型）
    ４．性別を保持するためのgenderフィールド（boolean型 true:メス false:オス）

    また、Petクラスは次の５つのpublicメソッドを持ちます。

    １．動物の種類を設定するためのsetTypeメソッド
    ２．名前を設定するためのsetNameメソッド
    ３．年齢を設定するためのsetAgeメソッド
    ４．性別を設定するためのsetGenderメソッド
    ５．紹介文を取得するためのgetIntroductionメソッド
      (紹介文の内容は下記の実行結果を参考にしてください)

    【実行結果】
    犬のコタローはオスで4歳です。
    猫のミーはメスで2歳です。

*/
public class ClassBasicPractice{

    public static void main(String[] args){

        // 1匹目のペットオブジェクトの生成
        Pet pet1 = new Pet();

        // 1匹目のペットのデータを設定
        pet1.setType("犬");
        pet1.setName("コタロー");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        // 2匹目のペットオブジェクトの生成
        Pet pet2 = new Pet();

        // 2匹目のペットのデータを設定
        pet2.setType("猫");
        pet2.setName("ミー");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        // 2匹のペットの紹介文を取得し、表示する
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());

    }

}

// ここにPetクラスを作成してください

