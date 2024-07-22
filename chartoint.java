import java.util.*;
class Asci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String st;
int n;
System.out.println("Enter the string:");
st=sc.next();
for(int i=0;i<st.length();i++){
n=st.charAt(i);
System.out.println(st.charAt(i)+" to int "+n);
}
}
}

