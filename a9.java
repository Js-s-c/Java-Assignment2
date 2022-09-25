//Question 9) Write Program Demonstrating use of privete
//Code:-
class B 
{   
private void s()   
{   
System.out.println("Javatpoint");   
}   
}   
public class D  
{   
public static void main(String args[])   
{   
B a = new B();    
a.s();   
}   
}
/*
Output:- 
D.java:13: error: s() has private access in B
a.s();
 ^
1 error
*/
