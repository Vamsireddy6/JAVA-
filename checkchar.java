class checkchar{
public static void main(String args[]){
String str="vamsi";
int c=0,v=0,n;
n=str.length();
for(int i=0;i<n;i++)
{
 if (str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u')
  v+=1;
else
c+=1;
}
System.out.println("No of vowles = "+v);
System.out.println("No of consonents = "+c);
}
}
