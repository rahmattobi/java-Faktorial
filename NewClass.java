/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github8;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class NewClass {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
int m,x,y,n;
System.out.print("inputkan jumlah baris : ");
int br=Integer.parseInt(input.next());
for (int i=1;i<=br;i++)
{
if (i <=4) {
for (int j=1;j<=br;j++)
{
if (j<=4)
{
m=i+j;
if (5<=m)
System.out.print ("*");
else
System.out.print (" ");
}
else
{
x=j-3;
if(x<=i)
System.out.print ("*");
else
System.out.print (" ");
}
}
}
else
{
for (int j=1;j<=br;j++)
{
if (j<=4)
{
y=i-3;
if (y<=j)
System.out.print ("*");
else
System.out.print (" ");
}
else
{
x=j-3; y=i-3; n=x+y;
if(n<=5)
System.out.print ("*");
else
System.out.print (" ");
}
}
}
System.out.println ();
}
}
  }


