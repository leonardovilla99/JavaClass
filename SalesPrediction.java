/*
The East Coast sales division of a company generates 62 percent of total sales. 
Based on that percentage, write a program that will predict how much the East Coast 
division will generate if the company has $4.6 million in sales this year. 
Hint: Use the value 0.62 to represent 62 percent.
*/

public class SalesPrediction {

    public static void main(String[] args){

        // Variables initialize: totalSales eastCoastDivision eastCoastSales
        double totalSales = 4.6e6;
        double eastCoastDivision = 0.62;
        double eastCoastSales;

        // Calculate (totalSales * eastCoastDivision)
        eastCoastSales = totalSales * eastCoastDivision;

        // Print out result
        System.out.println("The East Coast division sales were $" + eastCoastSales);
        
    }

}