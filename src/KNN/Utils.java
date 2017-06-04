package KNN;

import java.awt.List;
import java.util.ArrayList;

import javax.validation.constraints.Min;

import entities.Adoption;
import entities.DogAdopter;
public class Utils {

private static double MAX_AGE = 100;
private static double MIN_AGE = 5;

	public static double normalize(double x){
		
		double normalizeX = (x - MIN_AGE)/(MAX_AGE - MIN_AGE);
		
		return normalizeX;
	}

	public static double normalize(int x) {
		double normalizeX = (x - MIN_AGE)/(MAX_AGE - MIN_AGE);
		
		return normalizeX;
	}

	public static int HammingDistance(int a, int b){
		int differntBytes = Integer.bitCount(a^b);
		//TODO: remove
		int tmp = a^b;
		System.out.println("the distance between "+ Integer.toBinaryString(a)+" and " + Integer.toBinaryString(b) +
				" is "+ Integer.toBinaryString(tmp) + " (" + differntBytes+")");
		return differntBytes;
	}
	
	}
 