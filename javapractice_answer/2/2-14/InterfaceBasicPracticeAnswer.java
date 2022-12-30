// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    インタフェースの基本問題の解答例

*/
public class InterfaceBasicPracticeAnswer{

    public static void main(String[] args){

        // 鳥配列オブジェクトの生成
        Bird[] birds = {new Swallow(), new Penguin(), new Atthis()};

        // 鳥たちの紹介
        for(Bird bird : birds){

            // 食べるメソッド実行
            bird.eat();

            // もし飛行可能なら飛ぶメソッドを実行
            if(bird instanceof Flyable){
                ((Flyable)bird).fly();
            }

            // もし水泳可能なら泳ぐメソッドを実行
            if(bird instanceof Swimable){
                ((Swimable)bird).swim();
            }

            System.out.println();

        }

    }

}

// 飛行可能インタフェース
interface Flyable{
    // 飛ぶ抽象メソッド
    void fly();
}

// 水泳可能インタフェース
interface Swimable{
    // 泳ぐ抽象メソッド
    void swim();
}

// 食事可能インタフェース
interface Eatable{
    // 食べる抽象メソッド
    void eat();
}

// 鳥抽象クラス
abstract class Bird implements Eatable{}

// つばめクラス
class Swallow extends Bird implements Flyable{

    public void eat(){
        System.out.println("つばめが虫を食べました。");
    }

    public void fly(){
        System.out.println("つばめがスイスイ飛んでます。");
    }

}

// ペンギンクラス
class Penguin extends Bird implements Swimable{

    public void eat(){
        System.out.println("ペンギンが魚を食べました。");
    }

    public void swim(){
        System.out.println("ペンギンがスイスイ泳いでいます。");
    }

}

// カワセミクラス
class Atthis extends Bird implements Flyable, Swimable{

    public void eat(){
        System.out.println("カワセミが子魚を食べました。");
    }

    public void fly(){
        System.out.println("カワセミがスイスイ飛んでます。");
    }

    public void swim(){
        System.out.println("カワセミがスイスイ泳いでいます。");
    }

}
