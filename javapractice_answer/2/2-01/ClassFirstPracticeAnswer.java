// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    クラス作成の初歩の問題の解答例

*/
public class ClassFirstPracticeAnswer{

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

// Employeeクラス
class Employee{

    // 社員番号
    private int id;

    // 社員名
    private String name;

    // 社員番号と社員名をオブジェクトにセットする
    public void setData(int id, String name){
        this.id = id;
        this.name = name;
    }

    // 社員番号の情報を取得する
    public int getId(){
        return id;
    }

    // 社員名の情報を取得する
    public String getName(){
        return name;
    }

}
