// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ファイル入出力に関する問題の解答例

*/
import java.io.*;
public class FileCopyPracticeAnswer{

    public static void main(String[] args) {

        BufferedReader br = null;
        PrintWriter pw = null;

        if(args.length != 2){
            System.out.println("２つのファイル名を正しく指定してください");
            return;
        }

        try {

            // コピー元ファイル名のオープン
            br = new BufferedReader(new FileReader(args[0]));

            // コピー先ファイル名のオープン
            pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));

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
        finally {

            try {
                if(br != null){
                    br.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

            // PrintWriterのcloseメソッドはIOException例外を送出しないため
            if (pw != null){
                pw.close();
            }

        }

    }

}
