// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    順序に関する基本問題

    小学生を表現するSchoolChildクラスは、不完全です。
    また、小学生クラスを使用するCompareBasicPracticeクラスの
    mainメソッドも不完全です。

    CompareBasicPracticeクラスは以下の部分でコンパイルエラーになります。

        Collections.sort(classroom);

    Collectionsユーティリティクラスのsortメソッドは、引数で渡されたList型の
    要素をソートします。しかし、不完全なためソートできません。

    次の指示に従って、２種類のソートを可能にしてください。

    [SchoolChildクラス]
    「順序の基準」を設定するために、SchoolChildクラスにComparable<SchoolChild>
    インタフェースを実装してください。このインタフェースは、compareToという抽象
    メソッドがあるので、適切に実装してください。

    ただし、整列のルールは「出席番号の小さい順」にします。


    [CompareBasicPracticeクラス]
    Collectionsユーティリティクラスのsortメソッドには、第二引数に「特別な順序の基準」
    を設定するためのComparator<SchoolChild>インタフェースを実装したオブジェクトを指定
    することができます。このインタフェースをそのままインスタンス化することはできませんが、
    無名（匿名）クラスを利用することで可能となります。

    このインタフェースが持つcompare抽象メソッドを、無名クラスで実装してください。

    ただし、整列のルールは「身長の高い順」にします。


    【実行結果】
    整列前
    出席番号：4 名前：武藤 身長：145.0
    出席番号：2 名前：佐藤 身長：130.0
    出席番号：5 名前：加藤 身長：162.5
    出席番号：1 名前：伊藤 身長：155.3
    出席番号：3 名前：江藤 身長：151.1

    出席番号順
    出席番号：1 名前：伊藤 身長：155.3
    出席番号：2 名前：佐藤 身長：130.0
    出席番号：3 名前：江藤 身長：151.1
    出席番号：4 名前：武藤 身長：145.0
    出席番号：5 名前：加藤 身長：162.5

    身長の高い順
    出席番号：5 名前：加藤 身長：162.5
    出席番号：1 名前：伊藤 身長：155.3
    出席番号：3 名前：江藤 身長：151.1
    出席番号：4 名前：武藤 身長：145.0
    出席番号：2 名前：佐藤 身長：130.0

*/
import java.util.*;

// CompareBasicPracticeは未完成です
public class CompareBasicPractice{

    public static void main(String[] args){

        // 小学生たちがいる教室を表現するArrayList型変数
        ArrayList<SchoolChild> classroom = new ArrayList<SchoolChild>();

        // ５人の生徒が教室にいます
        classroom.add(new SchoolChild(4, "武藤", 145.0));
        classroom.add(new SchoolChild(2, "佐藤", 130.0));
        classroom.add(new SchoolChild(5, "加藤", 162.5));
        classroom.add(new SchoolChild(1, "伊藤", 155.3));
        classroom.add(new SchoolChild(3, "江藤", 151.1));

        // 生徒たちの情報を表示（整列前）
        System.out.println("整列前");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

        System.out.println();

        // 先生からの指示「出席番号順に整列しなさい」
        Collections.sort(classroom);

        // 生徒たちの情報を表示（出席番号順）
        System.out.println("出席番号順");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

        System.out.println();

        // 先生からの指示「身長の高い順に整列しなさい」
        Collections.sort(classroom);

        // 生徒たちの情報を表示（身長の高い順）
        System.out.println("身長の高い順");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

    }

}

// 小学生クラスは未完成です
class SchoolChild{

    private int no;         // 出席番号
    private String name;    // 名前
    private double height;  // 身長

    // コンストラクタ
    public SchoolChild(final int no, final String name, final double height){
        this.no = no;
        this.name = name;
        this.height = height;
    }

    // 出席番号の取得
    public int getNo(){
        return no;
    }

    // 名前の取得
    public String getName(){
        return name;
    }

    // 身長の取得
    public double getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return "出席番号：" + no + 
                " 名前：" + name + 
                " 身長：" + height;
    }

}
