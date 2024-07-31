import java.util.*;
class armstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,res=0,rem,temp;
System.out.println("Enter a number:");
n=sc.nextInt();
temp=n;
while(n!=0){
rem=n%10;
res+=(rem*rem*rem);
n=n/10;
}
if (temp==res)
System.out.println("It is a Armstrong number");
else
System.out.println("It is not a Armstrong number");
}
}
