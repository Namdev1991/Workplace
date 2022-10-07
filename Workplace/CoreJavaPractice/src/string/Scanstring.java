package string;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Scanstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner ref=new Scanner(System.in);
		//System.out.println("enter the String ");
		String str="hii how are you";
		String str4="hii how are you";
		System.out.println(str==str4);
		System.out.println(str.equals(str4));
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,7 ));
		String[] str3=str.split("how", 2);
		for(String str2:str3) {
		System.out.println(str2);	
		}
		String x1=str3[0];
		System.out.println(x1);
		System.out.println(str.concat(x1));
		StringBuffer sb=new StringBuffer("cdfsg");
		StringBuffer a1=new StringBuffer("bhgdh");
		System.out.println(sb.append(a1));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("h", 1));
		System.out.println(str.lastIndexOf("y"));
		System.out.println(str.lastIndexOf("w", 16));
		System.out.println(str.equals(str4));//On the basis of Value
		System.out.println(str==str4);//On the basis of Address
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String a3="     hii how are you";
		System.out.println(a3);
		System.out.println(a3.length());
		System.out.println(a3.trim());
		String a2=a3.trim();
		System.out.println(a2.length());
		System.out.println(a2.replace("a", "b"));
		System.out.println(a2.replace("how", "bow"));
		System.out.println(a2.contains("how"));
		System.out.println(a2.endsWith("you"));
		
	}

}
