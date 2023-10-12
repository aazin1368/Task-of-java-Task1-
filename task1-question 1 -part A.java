public class MathCalc {
    public static void main(String[] args) {
        // Given diameter of the Sun in miles
        double diameter = 865000.0;

        // Calculate the radius
        double radius = diameter / 2.0;

        // Calculate the volume 
        // Math.pow(x,y) is a function to calculate the value of x     raised to the power of y 
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

   

        // The volume of the Sun is Y cubic miles
        double Y = volume;

        // Print the value of Y
        System.out.println(" Y = " + Y);
    }
}




