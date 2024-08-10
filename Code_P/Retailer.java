class Retailer extends Store
 {
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    private boolean removeProduct;
    
    public Retailer(int storeId,String storeName,String storeLocation,String openingHours,double totalSales,double totalDiscount, int vatInclusivePrice,boolean isPaymentOnline,String purchasedYear)
    {
        super(storeId,storeName,storeLocation,openingHours);
        newSetDiscount(totalDiscount);
        newSetTotalSales(totalSales);
        

        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        loyaltyPoint =0;
    }
    
    
    public int getVatInclusivePrice()
    {
        return vatInclusivePrice;
    }
    public boolean getIsPaymentOnline()
    {
        return isPaymentOnline;
    }
    public String getPurchasedYear()
    {
        return purchasedYear;
    }
    public void  setVatInclusivePrice( int vatInclusivePrice)
    {
        this.vatInclusivePrice = vatInclusivePrice;
    }
    public void  setIsPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline = isPaymentOnline;
    }
    public void setLoyaltyPoint( boolean isPaymetnOnline, int vatInclusivePrice)
    {
        if(isPaymentOnline == true)
        {
            loyaltyPoint = vatInclusivePrice/100 ;
        }
    }
    
    
    public void removeProduct()
    {   
        if(loyaltyPoint == 0 && purchasedYear.equals("2020") || purchasedYear.equals("2021") || purchasedYear.equals("2022"))
         {
            removeProduct = true;
            vatInclusivePrice =0;
            isPaymentOnline = false;
            loyaltyPoint = 0;
        }
    }
    public void output()
    {
        if(removeProduct==false)
        {
            System.out.println("Vat Inclusive Price is " + vatInclusivePrice);
            System.out.println("Loyalty point is " + loyaltyPoint);
            System.out.println("Purchased Year " + purchasedYear);
        }
        else{
        super.main();
        System.out.println("Product was removed because it was older than 1 Year");
    }
    }
}