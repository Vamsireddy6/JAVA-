import java.util.*;
class prime{
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number:");
int n=sc.nextInt(),res=0;
for (int i=2;i<n/2;i++)
{
 if (n%i==0)
 res+=1;
}
if (res==0)
System.out.println("It is a prime number");
else
System.out.println("It is not a prime number");
}
}


