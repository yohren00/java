package HomeWork;

import java.util.ArrayList;
import java.util.List;

public interface Date {
	default List<String[]> getData(){
//		List<String[]>dataList = new ArrayList<String[]>();
		String[] row1 = new String[] {"1","S��","�ԤO:1000"};
		String[] row2 = new String[] {"2","A��","�ԤO:500"};
		String[] row3 = new String[] {"3","B��","�ԤO:100"};
		List<String[]>dataList = new ArrayList<String[]>();
		dataList.add(row1);
		dataList.add(row2);
		dataList.add(row3);
		return dataList;
		
	}

}
