package basicDay1;

public class string_with_array_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 200;
		
		System.out.println(a);
		
		
		String CompanyName = "Mango Agro ltd";
		String OwnerName = "Pintu Bhau";
		
		//System.out.println(CompanyName.concat(OwnerName));
		
		System.out.println(CompanyName.split(" ")[0]);
		
		String Replace_value = CompanyName.replace("ltd", "pvt ltd");
		System.out.println(Replace_value);
		
		String Lower_case = CompanyName.toLowerCase();
		System.out.println("Lower Case using func : " + Lower_case);
		
		String Upper_case = Lower_case.toUpperCase();
		System.out.println("Upper case using func : " + Upper_case);
		
		
		System.out.println(Replace_value.length());
		System.out.println(CompanyName.length());
		
	}

}
