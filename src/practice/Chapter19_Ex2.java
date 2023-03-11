package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Chapter19_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try(FileReader fr = new FileReader("C:\\eclipse\\pleiades\\workspace\\personal.properties")){
			Properties p = new Properties();
			//プロパティファイルの読み込み
			p.load(fr); 
			
			//以下、プロパティファイルの各種項目を出力する
			System.out.println("名前:" + p.getProperty("name"));
			System.out.println("年齢:" + p.getProperty("age"));
			System.out.println("性別:" + p.getProperty("gender"));
		}catch(FileNotFoundException e) {
			System.out.println("ファイルがありません");
			e.printStackTrace();	
		}catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
			
		}

	}

}
