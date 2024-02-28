package stringbuilder;

import helper.Helper;
import invalidexception.InputInvalidException;
public class StringBuilderTask {

	public StringBuilder getStringBuilder(){
		
		return new StringBuilder();
	}
	public int getLength(StringBuilder myBuilder) throws InputInvalidException{
		Helper.checkNull(myBuilder);
		return myBuilder.length();
	}
	public StringBuilder addString(StringBuilder myStringBuilder, String name,String symbol)throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		if(getLength(myStringBuilder) != 0) {
			myStringBuilder.append(symbol);
		}
		return myStringBuilder.append(name);
	}
	public StringBuilder insertBetween(StringBuilder myStringBuilder, String name,String symbol) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		Helper.checkNull(name);
		Helper.checkNull(symbol);
		int index = myStringBuilder.indexOf(symbol) + symbol.length();
		myStringBuilder.insert(index, name);
		return myStringBuilder.insert(index+name.length(), symbol);
	}
	public StringBuilder deleteString(StringBuilder myStringBuilder, String name) throws InputInvalidException{
		Helper.checkNull(myStringBuilder);
		Helper.checkNull(name);
		int index = myStringBuilder.indexOf(name);
		int length = name.length();
		return myStringBuilder.delete(index, length);
	}
	public StringBuilder replaceSymbol(StringBuilder myStringBuilder,String oldSymbol,String newSymbol) throws InputInvalidException{
		Helper.checkNull(myStringBuilder);
		Helper.checkNull(oldSymbol);
		int index = myStringBuilder.indexOf(oldSymbol);
		int lengthOfSymbol = oldSymbol.length();
		return myStringBuilder.replace(index, index+lengthOfSymbol, newSymbol);
	}
	public StringBuilder reverseStringBuilder(StringBuilder myStringBuilder) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		return myStringBuilder.reverse();
	}
	public StringBuilder deleteChars(StringBuilder myStringBuilder,int startIndex,int lastIndex) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		return myStringBuilder.delete(startIndex, lastIndex);
	}
	public StringBuilder replaceChars(StringBuilder myStringBuilder,int startIndex,int lastIndex,String newString) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		return myStringBuilder.replace(startIndex, lastIndex, newString);
	}
	public int getIndex(StringBuilder myStringBuilder,String name) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		return myStringBuilder.indexOf(name);
	}
	public int getLastIndex(StringBuilder myStringBuilder,String name) throws InputInvalidException {
		Helper.checkNull(myStringBuilder);
		return myStringBuilder.lastIndexOf(name);
	}
}
