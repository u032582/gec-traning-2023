// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    HashSetと等値に関する問題

    あるグループに属するメンバーを表現するMemberクラスがあります。
    フィールドとして、int型のidとString型のnameを持ち、基本的な
    コンストラクタを持ち、toStringメソッドをオーバーライドしている
    とても基本的なクラスです。
    ほとんど完成していますが、ある理由で不完全です。

    Memberクラスを使用するHashSetEqualsPracticeクラスのmainメソッド
    はすでに完成しています。（変更しないでください）

    このプログラムを変更せずに、そのままコンパイル・実行すると
    次のように出力されます。

    【正しくない実行結果（順不同）】
    ID:3 NAME:村田
    ID:1 NAME:ニセ山田
    ID:5 NAME:川田
    ID:1 NAME:山田
    ID:2 NAME:高田
    ID:4 NAME:吉田

    メンバーを管理するためのグループを表現するHashSet型のgroup変数を
    作成しています。
    このグループは、メンバーを管理するためにIDの値を使用し、同じIDの値を
    持つメンバーは加入できないようにしようと思っています。

    しかし、先ほどの実行結果では、グループにIDが1のニセ山田が加入できています。

    Setコレクションは、本来等値のオブジェクトを登録できないように設計されています。

    「同じIDの値を持つMemberオブジェクトは等値」となるように、Memberクラスを修正
    してください。

    ヒントは、Objectクラスの持つメソッドを２つオーバーライドすることです。

    【正しい実行結果（順不同）】
    ID:1 NAME:山田
    ID:2 NAME:高田
    ID:3 NAME:村田
    ID:4 NAME:吉田
    ID:5 NAME:川田

*/
import java.util.*;
public class HashSetEqualsPractice{

    public static void main(String[] args){

        // グループを結成
        HashSet<Member> group = new HashSet<Member>();

        // メンバーを追加
        group.add(new Member(1, "山田"));
        group.add(new Member(2, "高田"));
        group.add(new Member(3, "村田"));
        group.add(new Member(4, "吉田"));
        group.add(new Member(5, "川田"));

        // 偽物がメンバーとして追加！
        group.add(new Member(1, "ニセ山田"));

        // メンバー紹介
        for(Member member : group){
            System.out.println(member);
        }

    }

}

// メンバークラスは不完全です
class Member{

    private int id;         // ID
    private String name;    // 名前

    // コンストラクタ
    public Member(final int id, final String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID:" + id + " NAME:" + name;
    }

}
