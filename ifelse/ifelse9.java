/*Write a program in java to accept three numbers and accept three numbers and check whether they are Pythagorean 
 triplet or not

 example ( what is a Pythagorean triplet):
 a=3,b=4,c=5
 if
 a*a+b*b=c*c
 then 
 its a pythagorean triplet
 else
 not a pythagorean triplet

 Input 1:
 a=3,b=4,c=5
 Output : it is a pythagorean triplet

 Input 2:
 a=1,b=6,c=9
 Output : it is not a pythagorean triplet

 Input 3:
 a=2,b=2,c=2
 Output : ???
 */

public class ifelse9 {

    public static void main(String[] args) {

        int a = 3, b = 4, c = 5;

        if (a * a == b * b + c * c || b * b == a * b + c * c || c * c == a * a + b * b) {

            System.out.println("Triangle is Pythagorean Triplet");
        } else {

            System.out.println("Triangle is Not a Pythagorean Triplet");
        }

    }
}
