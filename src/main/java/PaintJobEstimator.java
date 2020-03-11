import java.util.Scanner;
 import java.text.DecimalFormat;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class PaintJobEstimator {
 public static void main(String[] args)
 	{
 		Scanner input = new Scanner(System.in);
 		int numberOfRooms;
 		double pricePerGallon;
 		
 		System.out.println("Enter the number of rooms?");
 		numberOfRooms = input.nextInt();
 		
 		System.out.println("Enter the price of paint per gallon");
 		pricePerGallon = input.nextDouble();
 		
 		int roomCount = 1;
 		double totalWallSpace = 0;
 		
 		while (roomCount <= numberOfRooms)
 		{
 			System.out.println("Room No." + roomCount);
 			System.out.println("Enter wall Space");
 			double wallSpaceForRoom = input.nextInt();
 			roomCount += 1;
 			totalWallSpace += wallSpaceForRoom;
 		}
 		
 		double paintGallonsRequired = gallonsOfPaint(totalWallSpace);
 		double laborHoursRequired = hoursOfLaborRequired(totalWallSpace);
 		double laborCost = laborCharges(laborHoursRequired);
 		double paintCost = costOfPaint(paintGallonsRequired, pricePerGallon);
 		totalCostOfPaintJob(laborCost, paintCost, totalWallSpace);
 	}
 	
 	public static double gallonsOfPaint(double wallSpace)
 	{
 		double paintGallons = wallSpace/115;
 		return paintGallons;
 	}
 	
 	public static double hoursOfLaborRequired(double wallSpace)
 	{
 		double laborHours = (wallSpace/115) * 8;
 		return laborHours;
 	}
 	
 	public static double costOfPaint(double gallons, double price)
 	{
 		double paintCost = gallons * price;
 		return paintCost;
 	}
 	
 	public static double laborCharges(double hours)
 	{
 		double totalLaborCharges = hours * 18;
 		return totalLaborCharges;
 	}
 	
 	public static void totalCostOfPaintJob(double laborCost, double paintCost, double totalWallSpace)
 	{
 		DecimalFormat twoDecimal = new DecimalFormat("#,##0.00");
 		double totalCost = laborCost + paintCost;
 		System.out.println("Total Wall Space: " + totalWallSpace);
 		System.out.println("Labor cost: $" + twoDecimal.format(laborCost));
 		System.out.println("Paint cost: $" + twoDecimal.format(paintCost));
 		System.out.println("The totalcost of the paint job is: $" + twoDecimal.format(totalCost));
 	}	
 	
 }