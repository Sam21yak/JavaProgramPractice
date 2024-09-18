package StringPrograms;

public class SumOfInteger {

	public static int calculateSum(String s) {
		 int sum = 0;
	        StringBuilder number = new StringBuilder();

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	            	System.out.println("char : "+c);
	                number.append(c);
	                System.out.println("number : "+number);
	            } else {
	                if (number.length() > 0) {
	                	System.out.println("Enter in Second if : "+number);
	                    sum += Integer.parseInt(number.toString());
	                    System.out.println("Sum in if : "+sum);
	                    number.setLength(0);
	                }
	            }
	        }

	        if (number.length() > 0) {
	            sum += Integer.parseInt(number.toString());
	            System.out.println("Sum : "+sum);
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        String s = "1abc2x30yz67";
	        int sum = calculateSum(s);
	        System.out.println("Sum of numbers: " + sum);
	    }
	}


