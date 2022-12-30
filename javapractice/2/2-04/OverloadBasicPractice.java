// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    オーバーロードの基本問題

    フルコースを調理するシェフを表すChefクラスを作成してください。
    Chefクラスを使用するOverloadBasicPracticeクラスのmainメソッド
    はすでに完成しています。（変更しないでください）
    また、各種食材を表す卵Eggクラス、米Riceクラス、牛乳Milkクラス、
    チーズCheeseクラスもすでに完成しています。（変更しないでください）

    Chefクラスには、インスタンスフィールドはありません。
    調理を表現するcookメソッドのみが存在します。
    （cookメソッドの戻り値は料理名を表すString型です）

    引数で渡される食材オブジェクトに応じて下記実行結果をもとに
    料理を完成させてください。

    【実行結果】
    １品目はスクランブルエッグです
    ２品目はオムライスです
    ３品目はリゾットです
    ４品目はプディングです

*/
public class OverloadBasicPractice{

    public static void main(String[] args){

        // シェフオブジェクトの生成
        Chef chef = new Chef();

        // 食材オブジェクトの生成
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();

        // シェフがフルコースを調理します
        System.out.println("１品目は" + chef.cook(egg, cheese) + "です");
        System.out.println("２品目は" + chef.cook(rice, egg) + "です");
        System.out.println("３品目は" + chef.cook(rice, cheese) + "です");
        System.out.println("４品目は" + chef.cook(milk, egg) + "です");

    }

}

// 各種食材クラス
class Egg{}
class Rice{}
class Milk{}
class Cheese{}

// ここにChefクラスを作成してください

