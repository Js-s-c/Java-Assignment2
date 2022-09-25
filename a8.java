//Question 8)Write a program Demonstrating use of public 
//Code:- 
//package s containing public class D1
package s;  
public class D1   
{   
public void show()   
{   
System.out.println("hello");   
}   
}   

\\Second code to call D1, D1 is a public class because it's a public class we can call it in another package  
  
package s2;
import s.*;  
class B   
{   
public static void main(String args[])   
{   
D1 obj = new D1();   
obj.show();   
}   
}  

/*
Outpute:-
hello
*/
