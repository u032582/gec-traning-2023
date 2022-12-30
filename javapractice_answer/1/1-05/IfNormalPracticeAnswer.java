// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if文の標準問題の解答例

*/
public class IfNormalPracticeAnswer{

    public static void main(String[] args){

        System.out.println("年齢を入力してください");

        // 年齢変数の宣言と初期化
        int age = Integer.parseInt(System.console().readLine());

        // 20歳以上の場合
        if(age >= 20){
            System.out.println("成人です");
        }
        // 20歳未満0歳以上の場合
        else if(age < 20 && age >= 0){

            System.out.println("未成年です");

            // 6歳未満14歳より大きい場合
            if(age < 6 || age > 14){
                System.out.println("今は義務教育を受けていません");
            }
            // それ以外の場合
            else{
                System.out.println("今は義務教育を受けています");
            }

        }
        // それ以外（負の値）の場合
        else{
            System.out.println("エラー");
        }

    }

}
