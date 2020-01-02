import java.util.*;
import java.net.InetAddress;
import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.net.UnknownHostException;

import java.util.Arrays;


class  CoreProgram
{
	public static String toHex(int decimal)
	{    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
	}	    
	
public static void main(String args[])throws IOException
{
	
Scanner sc=new Scanner(System.in);
/*int num1,num2;
System.out.println("enter first number");
num1=sc.nextInt();
System.out.println("enter second number");
num2=sc.nextInt();*/

//1...Java Program to Add two Numbers
/*int add=num1+num2;
System.out.println("addition of two number"+add);*/

//start
/*
//2..Java Program to Check Even or Odd Number
int num1;
System.out.println("enter number");
num1=sc.nextInt();
if(num1%2==0)
{
	System.out.println("number is even");
}
else
{
	System.out.println("number is odd");
}
*/
//end



//3..Java Program to add two binary numbers
/*

int binaryNum1,binaryNum2;
int carry=0,sum=0;
int storeVal,storeVal2;

System.out.println("enter first binary number");
binaryNum1=sc.nextInt();

System.out.println("enter second binary number");
binaryNum2=sc.nextInt();

int arr[] =new int[5];

for(int j=arr.length-1;j>=0;j--)
{
		storeVal=binaryNum1%10;
		storeVal2=binaryNum2%10;
			
			binaryNum1/=10;
			binaryNum2/=10;
			
		sum=storeVal+storeVal2+carry;
		
		if(sum==0)
		{
			arr[j]=0;
			carry=0;
		}else if(sum==1)
		{
			arr[j]=1;
			carry=0;
		}else if(sum==2)
		{
			arr[j]=0;
			carry=1;
		}else if(sum==3)
		{
			arr[j]=1;
			carry=1;
		}
}

for(int j=0;j<arr.length;j++)
{
	System.out.print(arr[j]+"");
}

*/


//4..Java Program to add two complex numbers

//5..Java Program to multiply two numbers

/*int result=num1*num2;
System.out.println("multiply of two number is ="+result);*/


//6..Java Program to check Leap Year
/*if((num1%4==0) ||(num2%4==0)){
	System.out.println("number is leap year");
}
else{
System.out.println("number is not leap year");
}*/


//start
//7..Java Program to check whether input character is vowel or consonant
/*
char ch='a';
switch(ch)
{
	case 'a':
	case 'e':
	case 'i':
	case '0':
	case 'u':
	case A:
	System.out.println(ch+"is vowel");
	break;
	default:
	System.out.println(ch+"is consonant");
}
*/
//end   

//8..Java program for decimal to octal conversion
/*
//start

CoreProgram2 obj=new CoreProgram2();
System.out.println(obj.toOctal(81));
//end
*/



//9..Java Program to calculate area and circumference of circle
//start
/*
double pi=22/7;
System.out.println("enter the radius");
int radius=sc.nextInt();

double areaofcircle=pi*radius*radius;

double circumference=2*pi*radius;

System.out.println("area of circle is="+areaofcircle);
System.out.println("circumference of circle is="+circumference);
//end
*/



//start
/*
//10..Java Program to Perform Arithmetic operation using Method Overloading
	CoreProgram2 obj=new CoreProgram2();
	obj.arithmaticOperation(22,20);
	obj.arithmaticOperation(4,2,6);
*/	
//end


//start
/*
//11...Java program to calculate area of Square
CoreProgram2 obj=new CoreProgram2();
obj.area();

*/
//end

//12..Java Program to Find square root of a Number without sqrt	(done)


//13...How To Convert Char To String and a String to char in Java

//start
/*
//14..Java Program to Display Fibonacci Series using loops
System.out.println("enter latsnum");
int lastnum=sc.nextInt();

int num1=0,num2=1;
System.out.print(num1+" "+num2);
for(int i=2;i<=lastnum;i++)
{
	int num3=num1+num2;
	System.out.print(num3+" ");
	num1=num2;
	num2=num3;
	
}
*/
//end

//15..Java Program to check Vowel or Consonant using if 
//start
/*

System.out.println("enter string here");
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
}
if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' || ch=='A' ||  ch=='E' || ch=='I' ||  ch=='o'|| ch=='U')
{
	System.out.println("vowel from string is="+ch);
}
else
{
	System.out.println("consonat from string is="+ch);
}
//end
*/


//16..Java Program to Find GCD of Two Numbers

/*
//17..Java program to check prime number
int num1,num2,r=0;
System.out.println("enter first number");
num1=sc.nextInt();

System.out.println("enter second number");
num2=sc.nextInt();

while(num2!=0)
{
	r=num1%num2;
	num1=num2;
	num2=r;
}
System.out.println(" GCD Of two number is="+num1);
*/


/*
//start
//18..Java Program to Calculate average of numbers using Array
int arr[]=new int[]{1,23,44,55};
int len=arr.length;
int sum=0,avg=0;
for(int i=0;i<len;i++)
{
	sum=sum+arr[i];
	avg=sum/len;
}
System.out.println("sum of array"+sum);
System.out.println("average  of array"+avg);
*/
//end

/*
//19..Java Program to Add the elements of an Array

System.out.println("enter no. of elements you want in array");
int num=sc.nextInt();
int arr[]=new int[num];
System.out.println("enter all elements in array");
int len=arr.length;
int sum=0;
for(int i=0;i<len;i++)
{
	arr[i]=sc.nextInt();
	//sum=sum+arr[i];
	
}
System.out.println("add element in  array"+arr[i]);  */


/*
//20..Java Program to reverse an array
int arr1[]=new int[]{12,22,44,55};
for(int i=arr1.length-1;i>=0;i--)
{
	System.out.println("revesre array"+arr1[i]);
}
*/


//21...Java Program to sort an array in ascending order

/*
//start
//22..Java Program to convert char Array to String
char[] ch={'h','e','l','l','o'};
String str=new String(ch);
System.out.println(str);

String str2=String.valueOf(ch);
System.out.println(str2);
//end
*/

/*
//start
//23...Java Program to Reverse a number using for, while loop and recursion
int num=123;
System.out.println("original number is="+num);
int rev=0;

while(num!=0)
{
	int rem=num%10;
	rev=rev*10+rem;
	num/=10;
}
System.out.println("reverse of number using while loop="+rev);

int rev2=0;
int num1=987;
for(;num1!=0;num1/=10)
{
	int rem=num1%10;
	rev2=rev2*10+rem;
	//num/=10;
}
System.out.println("reverse of number using for loop="+rev2);

CoreProgram2 obj=new CoreProgram2();
obj.reverse(2356);

*/
//end


//24...Java Program to check Palindrome string using Recursion
/*
System.out.println("reverse of string is="+palindrom("welcome"));
*/


//25..Java Program to Reverse a String using Recursion(done)



//26..Java Program to find Factorial of a number using Recursion
/*
CoreProgram2 obj=new CoreProgram2();		
String str11 = "Guru99";
 //create Method and pass and input parameter string 
		String revstr=obj.rev(str11);
		System.out.println(revstr);
*/



//27..Java Program to read number from Standard Input(done)



//28..Java Program to Get IP Address
/*
//start
 InetAddress ip;
 try
 {
	 ip=InetAddress.getLocalHost();
 System.out.println("ip address of system"+ip);
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
 
 //end
 */

//29..Java Program to get Input From User

//start
/*
System.out.println("first number is");
int firstNum=sc.nextInt();


System.out.println("second number is ");
int secondNum=sc.nextInt();
System.out.println("first number is="+firstNum);
System.out.println("second number is="+secondNum);
//end
*/



//31..Java Program to Calculate Area of Square(done)
/*
//start
System.out.println("enter side");
int side=sc.nextInt();
int circlearea=side*side;
System.out.println("area of square"+circlearea);

//30..Java Program to Calculate Area of Rectangle
System.out.println("enter width of rectangle");
int width=sc.nextInt();
System.out.println("Enter the length");
int length=sc.nextInt();

int area=width*length;
System.out.println("area of rectangle"+area);
//end


//32..Java Program to Calculate the area of Triangle

System.out.println("enter base");
int base=sc.nextInt();

System.out.println("enter height");
int height=sc.nextInt();

int triangleArea=(base*height)/2;
System.out.println("triangle area is="+triangleArea);
//end
*/



//33..Java Program to convert decimal to hexadecimal
/*
System.out.println("decimal to hexadecimal"+toHex(10));
*/


//34..Java binary to octal conversion


//35..Java String to boolean
//start
/*
String s1="true";
String s2="niki";

Boolean b1=Boolean.valueOf(s1);
Boolean b2=Boolean.valueOf(s2);
System.out.println("string to boolean conversion="+b1);
System.out.println("string to boolean conversion="+b2);
//end
*/


//36..Java program to convert boolean to String


//37..Java int to char conversion
/*
//start
int num=67;
char ch=(char)num;
System.out.println(ch);
//end*/


//38..Java char to int conversion
//start
/*
System.out.println("enter the character");
char ch=sc.next().charAt(0);
int num=(int )ch;
System.out.println(num);
//end*/



//39..Java char to string conversion
/*
//start
System.out.println("enter the character");
char ch=sc.next().charAt(0);
String s1=Character.toString(ch);
System.out.println("char to string conversion"+s1);
//end
*/

//40..Java long to int conversion
//start
/*
System.out.println("enter the long value");
float l=sc.nextFloat();
int num=(int)l;
System.out.println("long to int conversion"+num);
//end
*/


//41..Java int to long conversion
//start
/*
System.out.println("enter the integer value");
int val=sc.nextInt();
long l=(long)val;
System.out.println("int to long conversion="+l);
//end
*/


//42.Java Program to Convert Decimal to Binary
//start
/*
System.out.println("enter the num");
int num=sc.nextInt();
String i1=Integer.toBinaryString(num);
System.out.println("integer to binary"+i1);


//43..Java Program to convert binary to Decimal
String binarynum="1010";
int num1=Integer.parseInt(binarynum,2);
System.out.println("binary to decimal"+num1);

//end
*/


//44..Java Program to find ASCII value of a character
//start
/*
System.out.println("enetr the character");
char ch=sc.next().charAt(0);
System.out.println("original character is="+ch);
int ascii=(int)ch;
System.out.println("ascii character is="+ascii);
//end
*/

//45...Java program for String to int conversion



//46..Java program to convert int to String
//start
/*
int num=23;

String str=Integer.toString(num);
String str2=String.valueOf(num);
System.out.println("int to string conversion"+num);



//47..Java program for string to double conversion
String s="33.4";
double d=Double.parseDouble(s);
System.out.println("convert string to double"+d);

//48..Java program to convert double to String
double d1=445.33;
String s2=Double.toString(d1);
System.out.println("double to string "+s2);


//49..Java program to convert String to long
long l=234443232;
String s3=Long.toString(l);
System.out.println("string to long ="+s3);

//50..Java program to convert long to String

//start
long l=523712;
String s1=Long.toString(l);
String s4=""+l;
System.out.println("long to string is ="+s1);
System.out.println("long to string is ="+s4);
//end
*/



//51..Java Program to break Integer into Digits
//start
/*

System.out.println("enter the input value");
int input=sc.nextInt();
int temp=input;
while(temp!=0)
{
	int rem=temp%10;
	System.out.println("int to digit"+rem);
	temp=temp/10;
}
//end 
*/

//52..Java Program to check if Number is Positive or Negative
//start
/*
System.out.println("enter the number ");
int num=sc.nextInt();

if(num<0)
{
	System.out.println("enter number is negative");
}
else{
	System.out.println("enter number is positive");
}
//end
*/

//53..Java Program to Calculate Compound Interest
//start
/*
double  principle,rate,time=1,amount,ci;
System.out.println("enter principle ");
	
	principle=sc.nextDouble();
	
	System.out.println("enter rate");
 
	rate=sc.nextDouble();
	
	System.out.println("enter time");
	
	time=sc.nextDouble();
	
	rate=(1+rate)/100;
	for(int i=1;i<time;i++)
	{
		time*=rate;
		
	}
	amount=principle*time;
	System.out.println(amount);
	ci=amount-principle;
	System.out.println("compound intrest="+ci);
	//end
	*/
	
//54..How to convert a char array to a string in Java?
/*
char[] ch={'k','a','p','s','t','o','n','e'};
String str=new String(ch);
System.out.println("character to string="+str);
*/

//55..Java program for bubble sort in Ascending & descending order
//start
/*int numbers[]=new int[]{12,3,4,1,56,3,21,2123};
System.out.println("before sorting, numbers are ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        }
		
CoreProgram2 obj=new CoreProgram2();

obj.bubbleSortInAscendingOrder(numbers);
System.out.println("after  sorting, numbers are ");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]+" ");
        }
//end
*/

//56..Java program to calculate area of Square

//57..Java Program to find largest of three Numbers
/*
int num1,num2,num3;

System.out.println("enter first num");
num1=sc.nextInt();

System.out.println("enter second number");
num2=sc.nextInt();

System.out.println("enter third number");
num3=sc.nextInt();

if(num1>num2 && num1>num3)
{
	System.out.println("number first is greater");
}
else if(num2>num1 && num2>num3){
	System.out.println("number second is greater");
}
else if(num3>num1 && num3>num2)
{
	System.out.println("number third is greater");
}
else{
	System.out.println("num are equals");
}
*/

//58..Java Program to Check Armstrong Number
  /*
  
  int c=0,a,temp;  
    int n=153;
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
  
  
   */
//59..Java program to find the occurrence of a character in a string
 /*String st = "sdgfhgj";
      HashMap <Character, Integer> hMap = new HashMap<>();
      for (int i = st.length() - 1; i>= 0; i--) {
         if (hMap.containsKey(st.charAt(i))) {
            int count = hMap.get(st.charAt(i));
            hMap.put(st.charAt(i), ++count);
         } else {
            hMap.put(st.charAt(i),1);
         }
      }
      System.out.println(hMap);
 */
 
//60..Java program to convert decimal to hexadecimal
/*
CoreProgram2 obj1=new CoreProgram2();
 obj1.toHex(10);
 
 */
//61..Java Program to Sort Strings in an Alphabetical Order
 /*
 
   int count;
        String temp;
        Scanner scan = new Scanner(System.in);
         
        //User will be asked to enter the count of strings 
        System.out.print("Enter number of strings : ");
        count = scan.nextInt();
         
         
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
         
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
         
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) 
            { 
                if (str[i].compareTo(str[j]) > 0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
         
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order: " + Arrays.toString(str));
         no completed */
		 

//62..Java Program to Check if given Number is Perfect Square
/*

 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter an integer : ");
        int number = Integer.parseInt(reader.readLine());
         
        int sqrt = (int) Math.sqrt(number);
        if(sqrt*sqrt == number) {
            System.out.println(number+" is a perfect square number!");
        }else {
            System.out.println(number+" is NOT a perfect square number!");
        }
		
		*/
//63..Java Program to find largest of three numbers using Ternary Operator

   /*     int a, b, c, d;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter all three numbers:");

        a = s.nextInt();

        b = s.nextInt();

        c = s.nextInt();

        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

        System.out.println("Largest Number:"+d);
*/


//64..Java Program to Reverse a String using Recursion(done)

//65..Java Program to get input from user(done)


//66..Java Program for Selection Sorting
 /*
 int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;

      for (int i = 0 ;i< size-1; i++){
         int min = i;

         for (int j = i+1; j<size; j++){
            if (array[j] < array[min]){
            min = j;
            }
         }
         int temp = array[min];
         array[min] = array[i];
         array[i] = temp;
      }

      for (int i = 0 ;i< size; i++){
         System.out.print(" "+array[i]);
      }
	  
	  */
//67..Java Program to Swap two numbers using Bitwise XOR Operator

/*int number1,number2;
System.out.print("Enter 1st number:");
number1 = sc.nextInt();

System.out.print("Enter 2nd number:");
number2 = sc.nextInt();
number1 = number1 ^ number2;

number2 = number1 ^ number2;

number1 = number1 ^ number2;

sc.close();

System.out.println("1st number after swapping:"+number1);

System.out.println("2nd number after swapping:"+number2);
*/


//68..Java Program to read integer value from the Standard Input(done)



//69..Java Program to Calculate Simple Interest

/*
 float p, r,  t,  si; // principal amount, rate, time and simple interest respectively  
              p = 13000;  r = 12; t = 2;  
               si  = (p*r*t)/100;   
              System.out.println("Simple Interest is: " +si);
			  */

//69..Java Program to display first 100 prime numbers

/*
for(int i=1;i<=100;i++)
{
	System.out.println(i);
}
*/

//70..Java Program to display prime numbers between 1 and 100 or 1 and n
int count=0;
System.out.println("enter the number");
int nth=sc.nextInt();
int num=1;

while (count < nth){
      num=num+1;
      for (i = 2; i <= num; i++)
	  { 
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){//if it is a prime number
        count = count+1;
      }
    }
    System.out.println("Value of nth prime: " + num);

//71..Java program to break integer into digits
 /*System.out.print("Input six non-negative digits: ");
        int input = sc.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
      System.out.println(n1 + " " + n2 + " " + n3 + " " +n4 + " " + n5 + " " + n6);
*/

//72..Java Program to check Prime Number

      /*  int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    
	*/
	
	
}
}























