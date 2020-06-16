//Question: Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.
//=================================Code==========================

class Solution {
    public String validIPAddress(String IP) {
     
        
        if (IP == null || IP.length() == 0)
			return "Neither";
		if (checkIP4(IP)) // Validating as IPv4 IP Address.
			return "IPv4";
		if (checkIP6(IP)) // Validating as IPv6 IP Address.
			return "IPv6";
		return "Neither";
        
    }
    public boolean checkIP4(String IP) {
		if (IP.charAt(IP.length() - 1) == '.')    //Test case is to check pattern like "1.1.1."
			return false;
		String[] numbers = IP.split("\\.");       // Split with "."
		if (numbers == null || numbers.length != 4)    // After split array length should be 4.
			return false;
		for (String str : numbers) {
			if (str.length() == 0 || str.length() > 3)   // Test case is to check patterns like "1.1..1" or 1.1.1234.1
				return false;
			if (str.length() > 1 && str.charAt(0) == '0')  // Test case is to check pattern like "1.1.01.1"
				return false;
			int val = 0;
			for (int i = 0; i < str.length(); i++) {    // Prepare a number from string
				char c = str.charAt(i);
				if (c < '0' || c > '9')
					return false;
				val = val * 10 + (int) (c - '0');
			}
 
			if (val < 0 || val > 255) // Number should fall between 0 to 255.
				return false;
		}
		return true;
	}
 
	public boolean checkIP6(String IP) {
		if (IP.charAt(IP.length() - 1) == ':')  // Test case is to check pattern like "0000:0000:0000:0000:0000:0000:0000:"
			return false;
		String[] numbers = IP.split(":");
		if (numbers == null || numbers.length != 8)  // After split array length should be 8.
			return false;
		for (String str : numbers) {
			if (str.length() == 0 || str.length() > 4)  // Test case is to check patterns like "0000:0000:0000:0000::0000:0000:0000" or "0000:0000:0000:0000:000000:0000:0000:0000" 
				return false;
			int i = 0;
			while (i < str.length()) {
				char c = str.charAt(i++);
				if ((c < '0' || c > '9') && (c < 'a' || c > 'f') && (c < 'A' || c > 'F')) // Character range is 0-9, a-f and A-F.
					return false;
			}
		}
		return true;
	}
}
