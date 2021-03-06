package SampleProjectPractice.test;

public class Test {
	public static void main(String[] args) {
		System.out.println(5.0 / 4 - 4 / 5); //1.25-0=1.25
		
		/*(5.0/4)= 1.25
		 * since 5.0 is a double, operation done on 'double' will give result also as 'double' 
		 * here, considers the remainder too i.e., gives the real division value.
		 * 4/5 = 0 
		 * since both are int, the division operation on int gives only the quotient
		 * here, it is 0
		 */
		
		System.out.println(7<9-5&&3%0==3); //false
		
		/* in operation precedence order,(+,-) is above (<,>) 
		 * so first 9-5=4
		 * 7<4 = false
		 * Since it is &&, if the first expression is false, it doesn't perform or check the 2nd expression,
		 * directly returns false-------------an example of short circuit evaluation 
		 * Therefore, no error is shown even though there is modulus operation is performed on zero.
		 */
		
		System.out.println("B" + 8 + 4); //B84
		
		/* the expression is calculated from left to right ,
		 * so first "B"+8 gives B8 (which is concatenation)
		 * again B8, now a string + a digit will give another concatenation result i.e, B84
		 */
		
		int x=8;
		int y=4;
		System.out.println(8 + 4 + "B" + x / y); //12B2
	}

}
