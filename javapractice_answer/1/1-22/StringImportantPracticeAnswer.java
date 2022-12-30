// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    文字列に関する重要な問題の解答例

*/
public class StringImportantPracticeAnswer{

    // 正しいパスワード定数
    private static final String PASSWORD = "XYZ";

    public static void main(String[] args){

        System.out.println("パスワードを入力してください");

        // 入力パスワード変数の宣言と初期化
        String inputPassword = System.console().readLine();

        // パスワードの一致を調べる（等値のチェック）
        if(PASSWORD.equals(inputPassword)){
            System.out.println("パスワードが一致しました");
        }
        else{
            System.out.println("パスワードが一致しません");
        }

    }

}
