public class MathCalc {
    public static void main(String[] args) {
        // Given diameters of the Sun and Earth in miles
        double sunDiameter = 865000.0;
        double earthDiameter = 7600.0;

        // Calculate the radius
        double sunRadius = sunDiameter / 2.0;
        double earthRadius = earthDiameter / 2.0;

        // Calculate the volumes
// Math.pow(x,y) is a function to calculate the value of x     raised to the power of y 

double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadius,3);  
double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadius,3 );   
      
  // Calculate the ratio Z
        double Z = sunVolume / earthVolume;

        // Display the results
       
        System.out.println("Z is : " + Z);
    }
}




