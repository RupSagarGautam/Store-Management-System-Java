class Department extends Store
{
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;
 
    
    //class Department
    public Department(int storeId, String storeName, String storeLocation, String openingHours,double totalSales,double totalDiscount, String productName, double markedPrice)
    {
       super(storeId, storeName, storeLocation, openingHours); 
       this.productName = productName;
        this.markedPrice = markedPrice;
        this.isInSales = true;
        newSetTotalSales(totalSales);
        newSetDiscount(totalDiscount);
        this.sellingPrice =0;
    }
    
    //getter and setter method
    public String getProductName()
    {
        return productName;
    }
    
    public double getMarkedPrice()
    {
        return markedPrice;
    }
    
    public double getSellingPrice()
    {
        return sellingPrice;
    }
    
    public boolean getIsInSales()
    {
        return isInSales;
    }
    
    //setting marketprice
    public void setMarkedPrice(double markedPrice)
    {
        this.markedPrice = markedPrice;
    }
    
    //calculating discount price
    public void calculateDiscountPrice(boolean isInSales,double markedPrice)
    {
        if(isInSales == true && markedPrice<1000)
        {
            sellingPrice = markedPrice;
        }
            else if(isInSales == true && markedPrice>=1000 && markedPrice < 3000)
        {
            sellingPrice = markedPrice - (markedPrice * (5.00/100.00));
        }
            else if(isInSales == true && markedPrice>=3000 && markedPrice < 5000)
        {
            sellingPrice = markedPrice - (markedPrice * (10.00/100.00));
        }
            else if(isInSales == true && markedPrice >= 5000)
        {
            sellingPrice = markedPrice - (markedPrice * (20.00/100.00));
        }
        newSetDiscount(markedPrice-sellingPrice);
        newSetTotalSales(sellingPrice);
        isInSales=false;
    }
    
    //displaying different output for different condition
    public void display()
    {
        //supermethod to call main method from store class
        super.main(); 
        if(isInSales == true)
        {
            System.out.println("Name of Product is " + productName);
            System.out.println("Market Price of Product is " + markedPrice);
        }
        else
        {
            System.out.println("Name of Product is " + productName);
            System.out.println("Selling Price of Product is " + sellingPrice);
        }
    }

}
