package com.sbtask.tester;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.sbtask.exception.InputInvalidException;
import com.sbtask.logics.StringBuilderTask;

public class StringBuilderTester {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger("myLogger");
		try (Scanner intScanner = new Scanner(System.in);
		Scanner strBuilderScanner = new Scanner(System.in);){
		
		StringBuilderTask myTask = new StringBuilderTask();
		
		logger.log(Level.INFO,"1. create empty strind builder and print length of it.\n 2. create a "
				+ "string builder and add strings separeted by a symbol \n 3. create a string with"
				+ " string builder and add string in between two string  /n 4. create string builedr "
				+ "with two string and delete the first string \n 5.create a string builder with strings "
				+ "and replace symbol with new symbol \n 6.create a string builder with string and reverse "
				+ "it \n 7. create a string builder with string and delete characters at specific index "
				+ "\n 8. create a string builder with string and replace characters at specific index with "
				+ "a new value \n 9. create a string builder with stringa and find the index of the first "
				+ "occrance of symbol \n 10. create a string builder with string and find the last occrance "
				+ "of the symbol");
		int select = 0;
		String symbol = null;
		do {
			logger.log(Level.INFO,"choose any one");
			select = intScanner.nextInt();
			StringBuilder myStrBuilder = myTask.getStringBuilder();
			
			
			try {
				
				if(select != 1) {
				
					logger.log(Level.INFO,"Enter the number of string ");
					int noOfString = intScanner.nextInt();
					
					logger.log(Level.INFO,"Enter the joining symbol ");
				    symbol = strBuilderScanner.nextLine();
				    
					for (int i=0;i<noOfString;i++) {
						logger.log(Level.INFO,"Enter the string ");
						String value = strBuilderScanner.nextLine();
						
						
						myTask.addString(myStrBuilder, value, symbol);
					}
				}
				switch(select) {
				case 1:
				case 2:
					logger.log(Level.INFO,"Created string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
					break;
				case 3:
					
					logger.log(Level.INFO,"Enter the string to join");
					String value = strBuilderScanner.nextLine();
					
					myTask.insertBetween(myStrBuilder,value, symbol);
					logger.log(Level.INFO,"Created string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
					break;
				case 4:
					myTask.deleteString(myStrBuilder, null);
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
					break;
				case 5:
					logger.log(Level.INFO,"Enter the new joining symbol ");
					String newSymbol = strBuilderScanner.nextLine();
					myTask.replaceSymbol(myStrBuilder, symbol, newSymbol);
					
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
					break;
				case 6:
					myTask.reverseStringBuilder(myStrBuilder);
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
				case 7:
					logger.log(Level.INFO,"Enter the starting index ");
					int startIndex =  intScanner.nextInt();
					
					logger.log(Level.INFO,"Enter the ending index ");
					int endIndex =  intScanner.nextInt();
					
					myTask.deleteChars(myStrBuilder, startIndex, endIndex);
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));
					break;
				case 8:
					
					logger.log(Level.INFO,"Enter the starting index ");
					startIndex =  intScanner.nextInt();
					
					logger.log(Level.INFO,"Enter the ending index ");
					endIndex =  intScanner.nextInt();
					logger.log(Level.INFO,"Enter the value to replace ");
					String newValue = strBuilderScanner.nextLine();
					
					myTask.replaceChars(myStrBuilder, startIndex, endIndex, newValue);		
					
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));		
					break;
				case 9:
					myTask.getIndex(myStrBuilder, symbol);
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));		
					break;
				case 10:
					myTask.getLastIndex(myStrBuilder, symbol);
					logger.log(Level.INFO,"final string builder "+myStrBuilder);
					logger.log(Level.INFO,"Length of the string builder is "+myTask.getLength(myStrBuilder));	
					break;
				}
				
			}catch(InputInvalidException ie) {
				logger.log(Level.SEVERE,ie.getCause().toString());
			}
			
		}while(select != 0);
	}
	}
}
