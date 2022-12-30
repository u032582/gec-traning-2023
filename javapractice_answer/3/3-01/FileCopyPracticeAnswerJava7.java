// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ファイル入出力に関する問題の解答例
    (Java7導入の「try-with-resources文」バージョン)

*/
import java.io.*;
public class FileCopyPracticeAnswerJava7{

    public static void main(String[] args) {

        if(args.length != 2){
            System.out.println("２つのファイル名を正しく指定してください");
            return;
        }

        // try-with-resources文
        try(BufferedReader br = new BufferedReader(new FileReader(args[0]));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1])))){

            String str;

            // コピー元ファイルから１行分の文字列を取得
            while ((str = br.readLine()) != null) {

                // 取得した文字列をコピー先ファイルに書き込み
                pw.println(str);

            }

        }
        catch (FileNotFoundException e) {
            System.out.println("ファイル名の指定が不正です");
        }
        catch (IOException e) {
            System.out.println("入出力エラーです");
        }

    }

}
