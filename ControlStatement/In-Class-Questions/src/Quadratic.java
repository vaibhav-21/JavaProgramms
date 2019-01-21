import java.util.Scanner;
class Quadratic
{
    public static void main(String args[]) 
      {
        int p, q, r;
        double root1, root2, z;
        Scanner s = new Scanner(System.in);
        System.out.println("Given quadratic equation:px^2 + qx + r");
        System.out.print("Enter p:");
        p = s.nextInt();
        System.out.print("Enter q:");
        q = s.nextInt();
        System.out.print("Enter r:");
        r = s.nextInt();
        System.out.println("Given quadratic equation:" + p +"x^2 + " + q +"x + "+r);
        z =Math.pow(q,2) - 4 * p * r;
        if(z > 0)
        {
            System.out.println("Roots are real and unequal");
            root1 = ( - q + Math.sqrt(z))/(2*p);
            root2 = (-q - Math.sqrt(z))/(2*p);
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(z == 0)
        {
            System.out.println("Roots are real and equal");
            root1 = (-q+Math.sqrt(z))/(2*p);
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}