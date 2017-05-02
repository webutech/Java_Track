public class StringOperations {
	public static void main(String[] args) {
		String str="Yash Technologies";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.lastIndexOf("o"));
		System.out.println(str.replace("o", "O"));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));
		
		String numbers="10,20,30,40,50";
		String[] values=numbers.split(",");
		for (String value : values) {
			System.out.println(value);			
		}
		
		String url="http://www.yash.com/employees/showEmployeeList.htm";
		int lidx=url.lastIndexOf("/");
		String tempUrl=url.substring(lidx);
		System.out.println(tempUrl);
		lidx=tempUrl.lastIndexOf(".");
		tempUrl=tempUrl.substring(1, lidx);
		System.out.println(tempUrl);
	}
}
