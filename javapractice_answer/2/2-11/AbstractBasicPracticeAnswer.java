// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    抽象に関する基本問題の解答例

*/
public class AbstractBasicPracticeAnswer{

    public static void main(String[] args){

        // ３匹の動物たちを表すAnimal配列型変数animals
        // の宣言と配列オブジェクトの生成
        Animal[] animals = new Animal[3];

        // 動物たち配列変数の各要素に、順番に犬・猫・鳥
        // オブジェクトを生成・代入
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Bird();

        // forループを使って動物たち配列変数を走査し、
        // 各動物の歌うsingメソッドの呼び出し
        for(int i = 0 ; i < animals.length ; i++){
            animals[i].sing();
        }

    }

}

// 動物抽象クラス
abstract class Animal{
    public abstract void sing();
}

// 犬クラス
class Dog extends Animal{
    public void sing(){
        System.out.println("わんわん");
    }
}

// 猫クラス
class Cat extends Animal{
    public void sing(){
        System.out.println("にゃーにゃー");
    }
}

// 鳥クラス
class Bird extends Animal{
    public void sing(){
        System.out.println("ぴよぴよ");
    }
}
