// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ネストクラスに関する基本問題

    学校を表現するSchoolクラスと、その学校に在学する生徒を表現
    するStudentクラスを作成してください。ただし、Studentクラスは
    Schoolクラスの中だけで使えるprivateな非staticネストクラスに
    してください。

    Schoolクラスを使用するNestClassBasicPracticeクラスのmainメソッド
    は完成しています。（変更しないでください）

    [Schoolクラス]
    １．定員人数を表現するint型の定数CAPACITYを宣言します。
        初期値に「5」を設定してください。

    ２．次の２つのインスタンスフィールドを持ちます。

        ・学校名を表すname(String型)インスタンスフィールド
        ・在校生を表す配列students(Student[]型)インスタンスフィールド

    ３．コンストラクタでは引数として学校名(String型)を受け取ります。
        そのままインスタンスフィールドに値を格納してください。
        また、このタイミングで定員人数分の在校生配列オブジェクトを生成します。

    ４．入学メソッドenterSchoolを定義します。引数は生徒名で、在校生配列の先頭から空き
        (つまりnull)を検索し、空きがあればStudentクラスのインスタンスを生成して
        配列要素として格納します。出席番号は1から順に割り当てます。
        その際に「○○さんが△△に入学しました」と出力してください。
        もし定員人数を超えてしまう場合は「定員オーバーで○○さんは△△に入学できません」
        と表示して入学を見送ります。

    ５．在校生紹介メソッドintroduceを定義します。在校生配列の先頭から、在校生がいれば
        （つまりnullでなければ）toStringメソッドを呼び出して自己紹介させます。

    ６．privateな非staticネストクラスStudentを定義します。

    [Studentネストクラス]
    １．次の２つのインスタンスフィールドを持ちます。

        ・出席番号を表すid(int型)インスタンスフィールド
        ・生徒名を表すname(String型)インスタンスフィールド

    ２．コンストラクタでは引数として出席番号(int型)と生徒名(String型)
        を受け取ります。そのままインスタンスフィールドに値を格納して
        ください。

    ３．toStringメソッドをオーバーライドして、自己紹介文を戻り値として
        返します。実装は下記実行結果を参考にしてください。

    【実行結果】
    宮迫さんがJava学園に入学しました
    蛍原さんがJava学園に入学しました
    遠藤さんがJava学園に入学しました
    田中さんがJava学園に入学しました
    渡辺さんがJava学園に入学しました
    定員オーバーで山下さんはJava学園に入学できません

    Java学園に在学している出席番号1の宮迫です。
    Java学園に在学している出席番号2の蛍原です。
    Java学園に在学している出席番号3の遠藤です。
    Java学園に在学している出席番号4の田中です。
    Java学園に在学している出席番号5の渡辺です。

*/
public class NestClassBasicPractice{

    public static void main(String[] args){

        // 学校の設立
        School school = new School("Java学園");

        // 生徒が続々と入学
        school.enterSchool("宮迫");
        school.enterSchool("蛍原");
        school.enterSchool("遠藤");
        school.enterSchool("田中");
        school.enterSchool("渡辺");

        // 定員オーバー
        school.enterSchool("山下");

        System.out.println();

        // 在校生の紹介
        school.introduce();

    }

}

// ここに学校クラスを作成してください
// さらに、生徒ネストクラスを作成してください

