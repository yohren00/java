package HomeWork;

import java.io.IOException;
import java.util.List;

public class TestDemo {
	

	public static void main(String[] args) {
		//�g�J
		String write = "C:\\Users\\SilverYue\\Desktop\\Test\\ree.xlsx";
		Date date = new DataImp();
		List<String[]> list = date.getData();
	
		try {
			Excel.write(write, list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ū��
		String read = "C:\\Users\\SilverYue\\Desktop\\Test\\ree.xlsx";
		try {
			Excel.read(read);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
