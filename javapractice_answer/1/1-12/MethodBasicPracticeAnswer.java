// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    メソッド定義の基本問題の解答例

*/
public class MethodBasicPracticeAnswer{

    public static void main(String[] args){

        // displayメソッドの呼び出し
        display("テスト", 5);

    }

    // displayメソッドの定義
    public static void display(String message, int count){

        for(int i = 0; i < count; i++){

            System.out.println(message);

        }

    }

}
