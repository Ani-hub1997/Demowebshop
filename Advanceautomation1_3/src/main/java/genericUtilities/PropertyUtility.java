package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants
{
	public String getDataFromPropertyFile(String key)
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Properties property =new Properties();
		 try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);
	}

}
