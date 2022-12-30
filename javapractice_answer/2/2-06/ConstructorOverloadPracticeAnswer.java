// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    コンストラクタとオーバーロードの問題の解答例

*/
public class ConstructorOverloadPracticeAnswer{

    public static void main(String[] args){

        // １台目の車インスタンス生成
        Car car1 = new Car("トント", 1234, 10.0);

        // ２台目の車インスタンス生成
        Car car2 = new Car("ファット", 6789);

        // ２台の車を走行させる
        car1.run(7.0);
        car2.run(7.0);

        // ２台の車の情報を出力
        car1.showInfo();
        car2.showInfo();

    }

}

// 車クラス
class Car{

    // 車種
    private String type;

    // ナンバー
    private int number;

    // ガソリン
    private double gasoline;

    // コンストラクタ
    public Car(String type, int number, double gasoline){

        this.type = type;
        this.number = number;
        this.gasoline = gasoline;

    }

    // コンストラクタ
    public Car(String type, int number){

        this(type, number, 5.0);

    }

    // 情報表示メソッド
    public void showInfo(){
        System.out.println("車種：" + type + "　ナンバー：" + number + "　ガソリン：" + gasoline + "リットル");
    }

    // 走行メソッド
    public void run(double need){

        // ガソリンが足りている場合
        if(gasoline >= need){

            System.out.println("ナンバー" + number + "の" + type + "はガソリン" + need + "リットル分走行しました");

            // 走行分だけガソリンを減らす
            gasoline -= need;

        }
        // ガソリンが不足している場合
        else{

            System.out.println("ナンバー" + number + "の" + type + "はガソリン不足のため走行できません");

        }

    }

}
