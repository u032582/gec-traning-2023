// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    staticに関する基本問題の解答例

*/
public class StaticBasicPracticeAnswer{

    public static void main(String[] args){

        // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        // ５体のロボットオブジェクトを作成
        // （６体目は保留）
        Robot[] robots = { 
                            new Robot("RX"),
                            new Robot("PZ"),
                            new Robot("SS"),
                            new Robot("FG"),
                            new Robot("VC"),
                            null
                          };

        // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        // ６体目のロボットオブジェクトを作成
        robots[5] = new Robot("SUPER-Z");

        // ロボット総生産数の取得
        System.out.println("ロボット総生産数：" + Robot.getTotal());

        System.out.println();

        // ６体のロボットの情報を表示
        for(int i = 0 ; i < robots.length ; i++){
            robots[i].introduce();
        }

    }

}

// ロボットクラス
class Robot {

    // ロボットID
    private int id;

    // ロボット名
    private String name;

    // ロボット総生産数
    private static int total;

    // コンストラクタ
    public Robot(String name){

        this.name = name;

        // 総生産数をインクリメントし、IDに設定する
        total++;
        this.id = total;

    }

    // ロボット総生産数の取得
    public static int getTotal(){

        return total;

    }

    // ロボット紹介
    public void introduce(){

        System.out.println("ID：" + id + " NAME：" + name);

    }

}
