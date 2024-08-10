public class Store
{
    //attributes of class store
    private int storeId;
    private String storeName;
    private String storeLocation;
    private String openingHour;
    private double totalSales;
    private double totalDiscount;
    
    //create constructor with parameter
    public Store(int storeId, String storeName, String storeLocation, String openingHour)
    {
        this.totalSales=0.00;
        //this.totalsale is used to call variable from class Store to constructor(Store)
        this.totalDiscount=0.00;
            
            
        //asigins value for parameter
        this.storeId   = storeId;
        this.storeName = storeName;
        this.storeLocation  = storeLocation;
        this.openingHour = openingHour;
        
    }
    
    //creating corresponding accessor method(Get Method) to return value of each attribute.
    public int getStoreId()
    {
        return storeId;
    }
    
    public String getStoreName()
    {
        return storeName;
    }
    
    public String getStoreLocation()
    {
        return storeLocation;
    }
    
    public String getOpeningHour()
    {
        return openingHour;
    }
    
    public double getTotalSales()
    {
        return totalSales;
    }
    
    public double getTotalDiscount()
    {
        return totalDiscount;
    }
    
    //setter method here
    public void newSetTotalSales(double totalSales)
    {
        this.totalSales=totalSales;
    }
    
    public void newSetDiscount(double totalDiscount)
    {
        this.totalDiscount=totalDiscount;
    }

    //main method(displaying different output for different Conditions)
    public void main()
    {
    
        System.out.println("The Store ID is " + storeId + ".");
        System.out.println(" The Name of the Store is " + storeName +".");
        System.out.println (" The Store is situated in " + storeLocation +".");
        System.out.println (" The Store Opens and closes " + openingHour+ " respectively.");
        
        //printing output
        //finding output in if else condition to distinguish the value of sales and discount
        if(totalSales == 0.0 && totalDiscount == 0.0)
        {
            System.out.println("The total discount and sales are Zero");
        }
        
        else
        {
            System.out.println("The Total Discount is" + totalDiscount);
            System.out.println("The Total Sales of products are "+  totalSales);
        }
    }
}