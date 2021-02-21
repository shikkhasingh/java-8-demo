package com.functionalProgramming;

public class LambdaExample {

	public static void main(String[] input) {

		System.out.println("before java 8 implementation class  = " + suareRootWithImpl(9));

		System.out.println("before java 8 anonymous implementation = " + suareRootWithAnoymsImp(9));

		System.out.println("java 8 lamdba expression = " + squareRootJava8LambdaExpression(9));

		System.out.println("java 8 lamdba expression with type= " + squareRootJava8LambdaExpressionWithType(9));

		System.out.println("java 8 Block lamdba expression = " + squareRootJava8BlockLambdaExpression(9));

		System.out.println("java 8 lamdba expression as an argument = " + squareRootJava8LambdaAsArgument(9));

	}

	private static double suareRootWithImpl(int num) {

		SquareRootImpl squareRootImpl = new SquareRootImpl();
		return squareRootImpl.findSquareRoot(num);
	}

	private static double suareRootWithAnoymsImp(int num) {

		SquareRoot squareRoot = new SquareRoot() {

			@Override
			public double findSquareRoot(int n) {
				return Math.sqrt(n);
			}
		};

		return squareRoot.findSquareRoot(num);
	}

	private static double squareRootJava8LambdaExpression(int num) {

		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		return squareRoot.findSquareRoot(num);
	}
	
	private static double squareRootJava8LambdaExpressionWithType(int num) {

		SquareRoot squareRoot = (int n) -> (Math.sqrt(n));
		return squareRoot.findSquareRoot(num);
	}

	
	private static double squareRootJava8BlockLambdaExpression(int num) {

		SquareRoot squareRoot = (n) -> {
			double result = Math.sqrt(n);
			return result;
		};
		
		return squareRoot.findSquareRoot(num);
	}
	
	private static double squareRootJava8LambdaAsArgument(int num) {

		SquareRoot squareRoot = (n) -> (Math.sqrt(n));
		return displayData(squareRoot, num);
		
	}

	private static double displayData(SquareRoot squareRoot, int num) {

		return squareRoot.findSquareRoot(num);
		
	}

}


class SquareRootImpl implements SquareRoot {

	@Override
	public double findSquareRoot(int num) {
		return Math.sqrt(num);
	}

}
