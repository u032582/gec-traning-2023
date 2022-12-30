// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    クラス作成の初歩の問題

    従業員を表すEmployeeクラスを作成してください。
    Employeeクラスを利用するClassFirstPracticeクラスのmainメソッドは
    すでに完成しています。(変更しないでください)

    [Employeeクラス]
    Employeeクラスはフィールドとして社員番号(int型)と社員名(String型)の
    ２つの情報を保持します。

    Employeeクラスには次の３つのメソッドが必要です。
    １．社員番号と社員名をオブジェクトにセットするためのsetDataメソッド
    ２．社員番号の情報をオブジェクトから取得するためのgetIdメソッド
    ３．社員名の情報をオブジェクトから取得するためのgetNameメソッド

    【実行結果】
    社員番号：1234
    社員名：山田

*/
public class ClassFirstPractice{

    public static void main(String[] args){

        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();

        // Employeeオブジェクトに社員番号と社員名をセット
        employee.setData(1234, "山田");

        // Employeeオブジェクトの社員番号を出力
        System.out.println("社員番号：" + employee.getId());

        // Employeeオブジェクトの社員名を出力
        System.out.println("社員名：" + employee.getName());

    }

}

// ここにEmployeeクラスを作成してください

