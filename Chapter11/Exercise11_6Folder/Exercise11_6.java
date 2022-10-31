package Chapter11.Exercise11_6Folder;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_6 {
    public static void main(String[] args) {
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Loan());		
		o.add(new Date());		
		o.add(new String("String class"));	
		o.add(new Circle());	
        
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
}
