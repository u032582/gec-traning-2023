// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    列挙型に関する基本問題

    四季を表現するSeason列挙型を作成してください。

    [Season列挙型]

    １．Season列挙型は４つの列挙子（SPRING, SUMMER, FALL, WINTER）を持ちます。

    ２．Season列挙型はprivateなインスタンスフィールドname(String型)を持ち、
        ４つの列挙子に対して「春」「夏」「秋」「冬」という文字列を保持します。
        (コンストラクタをうまく利用してください)

    ３．toStringメソッドをオーバーライドして、インスタンスフィールドnameの
        情報を返してください。

    また、EnumBasicPracticeクラスのmainメソッドは一部未完成です。
    以下のように実装してください。

      mainメソッド内で四季列挙子を格納した配列変数を宣言しています。
      拡張for文を使ってすべての季節を列挙子をうまく使って表示してください。
      ただし、SUMMERの場合は「夏は暑い！！」、WINTERの場合は「冬は寒い！！」
      という情報を表示するように工夫してください。

   【実行結果】
    春
    夏は暑い！！
    秋
    冬は寒い！！

*/
public class EnumBasicPractice{

    public static void main(String[] args){

        // 四季列挙子を格納した配列変数の宣言
        Season[] seasons = {
                                Season.SPRING, 
                                Season.SUMMER,
                                Season.FALL,
                                Season.WINTER
                            };

        // 四季をループで回す


    }

}

// ここに季節列挙型を作成してください


