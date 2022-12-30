// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    総合上級問題

    ホテルを表現するHotelクラスを作成してください。
    そのホテルに勤務するStaffクラスと、そのホテルを
    利用するCustomerクラスも作成してください。

    また、人を表現するPerson抽象クラスと、労働可能を
    表現するWorkableインタフェース、所持金不足を表現する
    ShortFallException例外クラスは完成しています。
    （変更しないでください）

    これらのクラスを使用するTotalHiLevelPracticeクラスの
    mainメソッドも完成しています。（変更しないでください）

    [Hotelクラス]
    １．次の４つのインスタンスフィールドを持ちます。

        ホテル名    name(String型)
        利益        profits(long型)
        従業員たち  staffs(ArrayList<Staff>型)
        お客様たち  customers(ArrayList<Customer>型)

    ２．部屋のランクを表現するネストRoomRank列挙型を定義します。
        （詳細は後に説明します）

    ３．コンストラクタを持ちます。引数はホテル名なので、フィールドに渡します。
        「○○がオープンしました」と出力します。そのあと、従業員たちと
        お客様たちを表現するArrayListオブジェクトをインスタンス化します。

    ４．ホテルに入るenterメソッドをオーバーロードして２つ定義します。

        引数が従業員の場合は、出勤です。「○○が△△に出勤しました」と
        出力し、従業員たちArrayListオブジェクトに追加します。

        引数がお客様と部屋ランクの場合は、宿泊希望です。
        部屋ランク列挙型は価格を取得するgetPriceメソッド（戻り値int型）
        を持っているので、その値をお客様が持っているpayメソッドの引数に
        渡し、お金を支払ってもらいます。payメソッドの戻り値をホテルの
        利益フィールドに加算します。「○○様が□□の▽▽にお泊りになります」
        と表示し、最後にお客様たちArrayListオブジェクトに追加します。
        尚、payメソッドは所持金が足りない場合にShortFallException例外をスロー
        します。例外オブジェクトの持つメッセージを出力してください。

    ５．ホテル運営manageメソッドを定義します。現在ホテルにいるすべての従業員の
        働くworkメソッドを実行します。ただしループには拡張for文を使用してください。

    ６．お客様の情報を出力するshowCustomerInfoメソッドを定義します。
        「お客様情報」と出力した後に、現在ホテルにいるすべてのお客様の
        情報（toStringメソッドの戻り値）を出力します。ただしループには
        拡張for文を使用してください。

    ７．ホテル情報を出力するshowHotelInfoメソッドを定義します。
        ホテル名や現在の従業員数、現在のお客様数、現在の利益などを出力
        します。下記、実行結果を参考にしてください。

    [ネストRoomRank列挙型]
    １．ホテルクラスのメンバとして定義します。

    ２．３つの列挙子を持ちます。また、２つのインスタンスフィールドとして
        部屋のランク名roomRankName(String型)と価格price(int型)を持ちます。
        コンストラクタをうまく使ってフィールドに値を設定します。

        列挙子「SUITE」 部屋のランク名「"スイートルーム"」 価格「100000」
        列挙子「NORMAL」 部屋のランク名「"通常ルーム"」 価格「20000」
        列挙子「ECONOMY」 部屋のランク名「"格安ルーム"」 価格「5000」

    ３．価格を取得するgetPriceメソッドを定義します。（引数なし・戻り値int型）

    ４．toStringメソッドをオーバーライドします。roomRankNameフィールドの
        値を返します。

    [Staffクラス]
    １．Personクラスを継承し、Workableインタフェースを実装します。

    ２．職種を表すjobTypeフィールド（String型）を定義します。

    ３．コンストラクタは第一引数に氏名、第二引数に職種を受け取ります。
        フィールドに値をセットしてください。

    ４．働くworkメソッドを実装します。「○○が□□を行いました」と
        出力します。

    [Customerクラス]
    １．Personクラスを継承します。

    ２．所持金を表すmoneyインスタンスフィールド（int型）を定義します。

    ３．コンストラクタは第一引数に氏名、第二引数に所持金を受け取ります。
        フィールドに値をセットしてください。

    ４．支払payメソッドを定義します。引数は使用金額（int型）なので、
        その分所持金から金額を差し引き、戻り値として返します。
        所持金が足りない場合は、「○○は所持金不足です」
        というメッセージをShortFallException例外クラスのコンストラクタに
        渡して、そのままスローします。

    ５．お客様情報を返すtoStringメソッドをオーバーライドします。
        「○○様　所持金：☆☆円」という文字列を返します。

    【実行結果】
    ホテルドルフィンがオープンしました
    坂本がホテルドルフィンに出勤しました
    長野がホテルドルフィンに出勤しました
    井ノ原がホテルドルフィンに出勤しました

    岡田様がホテルドルフィンのスイートルームにお泊りになります
    三宅様がホテルドルフィンの通常ルームにお泊りになります
    森田は所持金不足です

    坂本が清掃を行いました
    長野が調理を行いました
    井ノ原が接客を行いました

    お客様情報
    岡田様　所持金：400000円
    三宅様　所持金：20000円

    ホテルドルフィンの現在の状況
    現在働いている従業員数：3名
    現在お泊まりのお客様数：2名
    現在の利益：120000円

*/
import java.util.*;
public class TotalHiLevelPractice{

    public static void main(String[] args){

        // ホテルがオープン
        Hotel hotel = new Hotel("ホテルドルフィン");

        // ホテルに３人の従業員が出勤
        hotel.enter(new Staff("坂本", "清掃"));
        hotel.enter(new Staff("長野", "調理"));
        hotel.enter(new Staff("井ノ原", "接客"));
        
        System.out.println();

        // ３人のお客様がチェックイン（１人が所持金不足で泊まれず）
        hotel.enter(new Customer("岡田", 500000), Hotel.RoomRank.SUITE);
        hotel.enter(new Customer("三宅", 40000), Hotel.RoomRank.NORMAL);
        hotel.enter(new Customer("森田", 4000), Hotel.RoomRank.ECONOMY);

        System.out.println();

        // ホテルを運営
        hotel.manage();

        System.out.println();

        // お客様情報の確認
        hotel.showCustomerInfo();

        System.out.println();

        // ホテル情報の確認
        hotel.showHotelInfo();

    }

}

// ここにホテルクラスを作成してください

// 人抽象クラス
abstract class Person{

    // 氏名
    protected String name;

    // 名前取得メソッド 
    public String getName(){
        return name;
    }

}

// 労働可能インタフェース
interface Workable{

    // 働く抽象メソッド
    void work();

}

// ここに従業員クラスを作成してください

// ここに顧客クラスを作成してください

// 所持金不足例外クラス
class ShortFallException extends Exception{

    public ShortFallException(String message){
        super(message);
    }

}
