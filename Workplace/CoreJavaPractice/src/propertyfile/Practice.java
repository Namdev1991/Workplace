package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(".\\AppData\\textFile.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("SetKey"));
		
	}

}
