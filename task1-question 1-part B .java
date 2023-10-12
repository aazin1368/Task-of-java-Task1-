public class MathCalc {
    public static void main(String[] args) {
        // Given diameter of the Earth in miles
        double diameter = 7600.0;

        // Calculate the radius 
        double radius = diameter / 2.0;

        // Calculate the volume 
// Math.pow(x,y) is a function to calculate the value of x     raised to the power of y 

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

   

        // The volume of the Earth is X cubic miles
        double X = volume;

        // Print the value of Y
        System.out.println("X = " + X);
    }
}



