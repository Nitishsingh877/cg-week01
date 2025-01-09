import java.util.*;

public class VolumeOfEarth {
	
 	public static void main(String[] args) {

//creating variables VOLUME OF EARTH 
		int radius = 6378;
		

//code for volume and in cubic km
		double volumeinKM = (4/3)*3.14*radius*radius*radius;
		double volumeinM = (4/3)*3.14*radius*radius*radius*1.6*1.6*1.6; 
		
//output
 
		
     		
     		System.out.println("The volume of earth in cubic kilometers is " +(String.format("%.2f",volumeinKM)) +" and cubic miles is " +(String.format("%.2f",volumeinM))
);
     }
}