class Smallest
{
  public static void main(String args[])
  {
   int first=7,second=15,third=8;
   if(first<second&&first<third)
   {
     System.out.println("Smallest number is:"+first);
   }
   else if(second<first&&second<third)
   {
    System.out.println("Smallest number is: "+second);
    }
   else
   {
     System.out.println("Smallest number is:"+third);
   }
  }
}