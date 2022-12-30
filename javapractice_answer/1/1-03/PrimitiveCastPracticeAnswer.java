// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    基本データ型変数とキャストの問題の解答例

*/
public class PrimitiveCastPracticeAnswer{

    public static void main(String[] args){

        // short型の変数 s1 を宣言し、10 を代入
        short s1 = 10;

        // byte型の変数 b を宣言し、変数 s1 の値を代入
        byte b = (byte)s1;

        // char型の変数 c を宣言し、変数 b の値を代入
        char c = (char)b;

        // short型の変数 s2 を宣言し、変数 s1 と b を足した値を代入
        short s2 = (short)(s1 + b);

    }

}
