// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    配列とメソッド定義の問題２

    mainメソッドはすでに完成しています。（変更しないでください）
    mainメソッド内で呼び出している、引数で渡ってくるint配列オブジェクトの
    各要素の中から最大のものを選んで戻り値として返すmaxメソッドを定義してください。
    (ただし、すべての値は正の数とします)

    【実行結果】
    配列の最大値：1010

*/
public class ArrayMethodPractice2{

    public static void main(String[] args){

        int[] arr = {43, 2, 765, 234, 908, 115, 32,
                     476, 938, 65, 93, 47, 102, 735, 
                     529, 1010, 639, 660, 182, 908}; 

        // maxメソッドの呼び出し
        System.out.println("配列の最大値：" + max(arr));

    }

    // ここにmaxメソッドを定義してください


}
