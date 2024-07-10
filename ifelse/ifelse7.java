/*Calculate profit or loss.
 write a program that takes the cost price and selling price (take it hardcoded) and calculates profit or loss

 Input 1:
 sellingPrice = 1200
 costPrice = 1000
 Output : profit of 200

 Input 2 :
 sellingPrice = 300
 costPrice = 500
 Output : loss of 200

 Input 3 :
 sellingPrice = 900
 costPrice = 900
 Output : ???

 */

public class ifelse7 {

    public static void main(String[] args) {

        int selling_price = 300;
        int cost_price = 500;

        if (selling_price > cost_price) {

            System.out.println("Profit of " + (selling_price - cost_price));
        } else if (selling_price < cost_price) {

            System.out.println("loss of " + (cost_price - selling_price));
        } else {

            System.out.println("No Loss No Profit");
        }
    }
}
