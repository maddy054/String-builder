package helper;
import invalidexception.InputInvalidException;

public class Helper{
	
	public static void checkNull(Object obj) throws InputInvalidException{
		if(obj == null){
			throw new InputInvalidException("Argument is null");
			}
		}
  }