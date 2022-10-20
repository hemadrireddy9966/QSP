package practicefolder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class datareading {
@Test
	public static String DataRaedu(String ur) throws IOException {
     FileInputStream fis=new FileInputStream("./data/commondata.property");
     Properties p=new Properties();
     p.load(fis);
     String data = p.getProperty(ur);
     return data;
	}
public static String DataRaedn(String un) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String data = p.getProperty(un);
    return data;
	}
public static String DataRaedp(String pw) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(fis);
    String data = p.getProperty(pw);
    return data;
	}
}
