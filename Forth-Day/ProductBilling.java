public class ProductBilling
{
    void bill(int price)
    {
        System.out.println("total bill for 1 product" +( price));
    }
    void bill(int price1,int price2)
    {
      System.out.println("total bill for 2 product"+( price1 + price2) );
    }
       void bill(int price1,int price2 ,int price3)
       {
      System.out.println("total bill for 3 product:" +( price1 + price2 + price3) );
       }
       public static void main(String args[])
       {
           ProductBilling pb = new ProductBilling();
           pb.bill(500);
           pb.bill(500 ,690);
           pb.bill(500, 690 ,720);
       }
}
