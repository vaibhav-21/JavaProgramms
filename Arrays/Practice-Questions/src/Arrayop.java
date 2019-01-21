import java.util.Scanner;
class Arrayop
{
	public static void main(String args[])
	{ int y;
		double sum=0;
    int sum1=0;
    int count,x1,x2;

	Scanner s = new Scanner(System.in);
int a[] = new int[5];
int b[] = new int[5];
System.out.println("Enter all the elements:");
   for(int i = 0; i < 5; i++)
{
  a[i] = s.nextInt();
  b[i] = s.nextInt();
  }
  System.out.println("select one of the following options");
  System.out.println("1.sum 2.largest  3.smallest  4.sum of alternate elements 5.count even no ");
  y=s.nextInt();
  switch(y)
  {
  case 1:
  for(int i = 0; i < 5; i++)
   sum = sum + a[i];
System.out.println("sum is :"+sum);
break;
case 2:
for (int i = 0; i < 5; i++)
      {for(int j = i + 1; j < 5; j++)
       {
       if(a[i] < a[j])
       {
        x1 = a[i];
        a[i] = a[j];
        a[j] = x1;
       }
        }
        }
        System.out.println("Largest two numbers are:"+a[0]+" and "+a[1]);
      break;
      case 3:
      for(int i = 0; i<5; i++ )
        {
         for(int j = i+1; j<5; j++)
         {
            if(a[i]>a[j])
            {
               x2 = a[i];
               a[i] = a[j];
               a[j] = x2;
            }
         }
      }
      System.out.println("Smallest element is: "+a[0]);
       break;
       case 4:
       for(int i = 0; i <5;i++)
{  sum1 = sum1 + a[i+2];
}System.out.println("Sum:"+sum1);
break;
 
  default:
  System.out.println("system error");

}
	}
}