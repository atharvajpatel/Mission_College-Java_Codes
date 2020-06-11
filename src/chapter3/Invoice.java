package chapter3;
import java.util.Scanner;

public class Invoice {
    private String part;
    private String partD;
    private int quantity;
    private double price;

    public Invoice(String part, String partD, int quantity, double price){
        this.part = part;
        this.partD = partD;
        this.quantity = quantity;
        this.price = price;
    }
    public void setPart(String part){
        this.part = part;
    }
    public String getPart(){
        return this.part;
    }
    public void setPartD(String partD){
        this.part = partD;
    }
    public String getPartD(){
        return this.partD;
    }
    public void setQuantity(int quantity){
        if (price<=0){
            this.quantity = 0;
        }
        else{
            this.quantity = quantity;
        }
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setPrice(double price){
        if (price<=0){
            this.price = 0;
        }
        else{
            this.price = price;
        }

    }
    public double getPrice(){
        return this.price;
    }
    public double InvoiceAmount(double price, int quantity){
        double invoice = price * quantity;
        return invoice;
    }
    public static void main(String[] args){
        System.out.println("Original Invoice information");
        Scanner pART = new Scanner(System.in);
        System.out.print("Part number: ");
        String part = pART.nextLine();
        Scanner partd = new Scanner(System.in);
        System.out.print("Description: ");
        String partD = partd.nextLine();
        Scanner quant = new Scanner(System.in);
        System.out.print("Quantity: ");
        int quantity = quant.nextInt();
        Scanner prICE = new Scanner(System.in);
        System.out.print("Price: ");
        double price = prICE.nextDouble();
        Invoice invoice_test = new Invoice(part, partD, quantity, price);
        if(price <= 0) {
            price = 0;
            System.out.println(price);
        }
        if(quantity <= 0) {
            quantity = 0;
            System.out.println(quantity);
        }
        System.out.println("Invoice: " + invoice_test.InvoiceAmount(price,quantity));
    }
}
