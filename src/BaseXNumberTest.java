//package baseXNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseXNumberTest {

	@Test
	public void testBaseXNumber() {
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "b6f");
		BaseXNumber numberOct = new BaseXNumber("octal", "76534");
		BaseXNumber numberBinary = new BaseXNumber("binary", "010110");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "34567");
		
		assertTrue(
				numberHex.getNumberDecimal() == 2927 &&
				numberOct.getNumberDecimal() == 32092 &&
				numberBinary.getNumberDecimal() == 22 &&
				numberDecimal.getNumberDecimal() == 34567 
				);
	}
	
	@Test
	public void testReverse()
	{
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "5ae3f");
		BaseXNumber numberOct = new BaseXNumber("octal", "6345");
		BaseXNumber numberBinary = new BaseXNumber("binary", "01101");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "4539");
		
		
		assertTrue(
				numberOct.reverse().equals("1033") &&
				numberDecimal.reverse().equals("9354") &&
				numberBinary.reverse().equals("31") &&
				numberHex.reverse().equals("782273") 
				
				);
	}

	@Test
	public void testToBinary()
	{
		BaseXNumber numberBinary = new BaseXNumber("binary", "01111011");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "1293");
		BaseXNumber numberOct = new BaseXNumber("octal", "567");
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "ef9a");
		
		BaseXNumber numberDecimal2= new BaseXNumber("decimal", "61338");
		
		assertTrue(
				
				numberBinary.toBinary().equals("01111011") &&
				numberDecimal.toBinary().equals("10100001101") &&
				numberOct.toBinary().equals("101110111") &&
				numberHex.toBinary().equals("1110111110011010") &&
				
				numberDecimal2.toBinary().equals("1110111110011010")
				
				);
		
	}
	
	@Test
	public void testToOctal()
	{
		BaseXNumber numberBinary = new BaseXNumber("binary", "111001010");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "601");
		BaseXNumber numberOct = new BaseXNumber("octal", "1131");
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "ff3a");
		
		assertTrue(
				
				numberBinary.toOctal().equals("712") &&
				numberDecimal.toOctal().equals("1131") &&
				numberOct.toOctal().equals("1131") &&
				numberHex.toOctal().equals("177472")
				
				);	
		
	}
	
	@Test
	public void testToDecimal()
	{
		BaseXNumber numberBinary = new BaseXNumber("binary", "1110001110");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "222");
		BaseXNumber numberOct = new BaseXNumber("octal", "17620");
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "33af");
		
		
		assertTrue(
				
				numberBinary.toDecimal().equals("910") &&
				numberDecimal.toDecimal().equals("222") &&
				numberOct.toDecimal().equals("8080") &&
				numberHex.toDecimal().equals("13231")
				
				);	
		
	}
	
	@Test
	public void testToHexadecimal()
	{
		BaseXNumber numberBinary = new BaseXNumber("binary", "1110101011");
		BaseXNumber numberDecimal= new BaseXNumber("decimal", "222");
		BaseXNumber numberOct = new BaseXNumber("octal", "173110");
		BaseXNumber numberHex = new BaseXNumber("hexadecimal", "5ff");
		
		assertTrue(
				
				numberBinary.toHexadecimal().equals("3ab") &&
				numberDecimal.toHexadecimal().equals("de") &&
				numberOct.toHexadecimal().equals("f648") &&
				numberHex.toHexadecimal().equals("5ff")
				
				);
		
	}
	

}
