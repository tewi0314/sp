package aa;

import java.sql.BatchUpdateException;
import java.sql.SQLException;
import java.sql.SQLNonTransientException;

public class Q4 {
	public static void main(String[] args) {
		
		
		
		
		try {
		BatchUpdateException ex = new BatchUpdateException();
		SQLNonTransientException ex1 = new SQLNonTransientException();
		throw new SQLNonTransientException();
		
		}catch (SQLNonTransientException e){
			System.err.println(e.getMessage());
		}
		 
	}
		
	
}
