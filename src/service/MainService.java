package service;

import java.util.Arrays;
import java.util.Random;

public class MainService {

	private static double gravity = -9.81;
	
	public static void main(String[] args) {
		
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		System.out.println( positionCalc(gravity, initialVelocity, initialPosition, fallingTime));
		
		try {
			System.out.println(factorialForLoop(3));
			
			double[] array = generateArray(5, 1, 6);
			System.out.println(Arrays.toString(array));
			
			System.out.println(getMean(array));
			System.out.println(getMin(array));
			System.out.println(getMax(array));
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}
	
	private static double positionCalc(double gravity, double initialVelocity, double initialPosition, double fallingTime) {
		return 0.5 * Math.pow(gravity*fallingTime, 2) + initialVelocity*fallingTime + initialPosition;
	}
	
	private static int factorialForLoop(int n) throws Exception {
		if (n>0) {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		}
		else {
			throw new Exception("Cannot calculate factorial for numbers below 0.");
		}
	}
	
	private static double[] generateArray(int N, double lower, double upper) throws Exception {
		if (N <= 0) {
			throw new Exception("Array length cannot be less than or equal to 0.");
		}
		
		Random random = new Random();
		double[] array = new double[N];
		for (int i = 0; i < N; i++) {
			array[i] = random.nextDouble(lower, upper);
		}
		return array;
	}
	
	private static double getMean(double[] array) throws Exception{
		if (array == null) {
			throw new Exception("Reference to array cannot be null.");
		}
		
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	private static double getMin(double[] array) throws Exception { 
		if (array == null) {
			throw new Exception("Reference to array cannot be null.");
		}
		
		double smallestValue = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestValue) {
				smallestValue = array[i];
			}
		}
		return smallestValue;
	}
	
	static double getMax(double[] array) throws Exception{
		if (array == null) {
			throw new Exception("Reference to array cannot be null.");
		}
		
		double largestValue = Double.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestValue) {
				largestValue = array[i];
			}
		}
		return largestValue;
	}
	
}