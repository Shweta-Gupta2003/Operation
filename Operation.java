import java.util.*;
class OPER
{
int add,sub,multi,div,no1,no2;

void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter no1:");
no1=sc.nextInt();
System.out.println("Please enter no2:");
no2=sc.nextInt();
}

void addition()
{
add=no1+no2;
System.out.println("Addition of 2 nos are "+add);
}

void subtraction()
{
sub=no1-no2;
System.out.println("Subtraction of 2 nos are "+sub);
}

void multiplication()
{
multi=no1*no2;
System.out.println("Multiplication of 2 nos are "+multi);
}

void division()
{
div=no1/no2;
System.out.println("Division of 2 nos are "+div);
}

}


class Operation
{
public static void main(String args[])
{
int op;
Scanner sc=new Scanner(System.in);
OPER o=new OPER();
o.getdata();
while(true)
{
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Exit");
System.out.println("Enter your choice:");
op=sc.nextInt();

switch(op)
{
case 1:o.addition();
break;
case 2:o.subtraction();
break;
case 3:o.multiplication();
break;
case 4:o.division();
break;
case 5:System.exit(0);
break;
}
}
}
}
