// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if文と演算に関する問題の解答例

*/
public class IfCalculatePracticeAnswer{

    public static void main(String[] args){

        System.out.println("身長（cm）を入力してください");
        double height = Double.parseDouble(System.console().readLine());

        System.out.println("体重（kg）を入力してください");
        double weight = Double.parseDouble(System.console().readLine());

        // BMI変数の宣言と演算結果の格納
        double bmi = weight / ((height / 100) * (height / 100));

        // BMI値の出力
        System.out.println("あなたのBMI値は" + bmi + "です");

        // BMI値に応じた評価の出力
        if(bmi >= 26.5){
            System.out.println("肥満です");
        }
        else if(bmi < 26.5 && bmi >= 24){
            System.out.println("太り気味です");
        }
        else if(bmi < 24 && bmi >= 20){
            System.out.println("普通です");
        }
        else if(bmi < 20 && bmi >= 0){
            System.out.println("スリムです");
        }
        else{
            System.out.println("エラーです");
        }

    }

}
