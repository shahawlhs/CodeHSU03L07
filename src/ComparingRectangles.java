//comparing rectangles

public class ComparingRectangles
{
    public static void main(String[] args)
    {

        int x = 5;
        int y = 5;
        if(x == y)
        {
            System.out.println(x + " is equal to " + y);
        }

        //String favColor = new String("Red");
        String favColor = "Red";
        String stopLightColor = "Red";
        //String stopLightColor = new String("Red");

        if(favColor.equals(stopLightColor)){ //used .equals to compare objects
            System.out.println("Why do you like that color?");
        }
        else{
            System.out.println("Those are not the same color");
        }

        //How can we fix this??
        //put fix here
        //use .equals to compare the strings

        Rectangle one = new Rectangle(5, 10);
        Rectangle two = new Rectangle(5, 10);

        if(one.equals(two))
        {
            System.out.println(one + " is equal to " + two);
        }
        else {
            System.out.println("\nPointers are NOT the same here.");
        }
    }
}