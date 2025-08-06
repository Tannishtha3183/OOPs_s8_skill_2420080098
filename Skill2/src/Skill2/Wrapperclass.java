package Skill2;
public class Wrapperclass {
	public static void main(String[] args) {
		String numberStr = "123";
	    int num = Integer.parseInt(numberStr); 
	    System.out.println("Converted int value: " + num);

	    Integer myInteger = num;
	    System.out.println("Autoboxed Integer object: " + myInteger);

	    int unboxed = myInteger.intValue();
	    System.out.println("Unboxed primitive int: " + unboxed);

	    String priceStr = "99.99";
	    double price = Double.parseDouble(priceStr); 
	    System.out.println("Converted double value: " + price);

	    Double priceObj = price; 
	    double priceUnboxed = priceObj; 
	    System.out.println("Autoboxed Double: " + priceObj);
	    System.out.println("Unboxed double: " + priceUnboxed);
	    }
	}



