// TEXT FIELDS
// Store id
// ii.Store name
// iii.Location
// iv.Opening Hour
// v.Total Sales
// vi. Total Discount
// vii. Product Name
// viii.Marked Price
// ix. Selling Price
// x. VAT inclusive price
// xi.Loyalty Point

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class StoreGUI extends JFrame {
    private JPanel contentPane;
    private JTextField storeIdTextField,  storeIdTextField1 ;
    private JTextField storeNameTextField, storeIdTextField2,storeIdTextField3;
    private JTextField storeNameTextField1 , storeNameTextField4;
    private JTextField locationTextField, locationTextField1;
    private JTextField openingHourTextField, openingHourTextField1;
    private JTextField totalSalesTextField,totalSalesTextField1;
    private JTextField totalDiscountTextField, totalDiscountTextField1;
    private JTextField productNameTextField;
    private JTextField markedPriceTextField;
    private JTextField sellingPriceTextField;
    private JTextField vatInclusivePriceTextField;
    private JTextField loyaltyPointTextField;
    private JCheckBox isPaymentOnlineCheckBox, isInSalesNo, isInSalesYes, isPaymentOnlineCheckBox1;
    private ArrayList<Store> storeArrayList;
    @SuppressWarnings("rawtypes")
    private JComboBox purchasedYearComboBox; 

    public StoreGUI() {

        storeArrayList = new ArrayList<>();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // contentPane.setExtendedState(JFrame.MAXIMIZED_BOTH);




        // DepartmentID Code
        


        JLabel storeIdLabel = new JLabel("Store ID:");
        storeIdLabel.setBounds(50, 10, 80, 25);
        contentPane.add(storeIdLabel);

        storeIdTextField = new JTextField();
        storeIdTextField.setBounds(200, 10, 120, 25);
        contentPane.add(storeIdTextField);

        JLabel storeNameLabel = new JLabel("Store Name:");
        storeNameLabel.setBounds(50, 40, 80, 25);
        contentPane.add(storeNameLabel);

        storeNameTextField = new JTextField();
        storeNameTextField.setBounds(200, 40, 120, 25);
        contentPane.add(storeNameTextField);

        JLabel locationLabel = new JLabel("Location:");
        locationLabel.setBounds(50, 70, 80, 25);
        contentPane.add(locationLabel);

        locationTextField = new JTextField();
        locationTextField.setBounds(200, 70, 120, 25);
        contentPane.add(locationTextField);

        JLabel openingHourLabel = new JLabel("Opening Hour:");
        openingHourLabel.setBounds(50, 100, 80, 25);
        contentPane.add(openingHourLabel);

        openingHourTextField = new JTextField();
        openingHourTextField.setBounds(200, 100, 120, 25);
        contentPane.add(openingHourTextField);

        JLabel totalSalesLabel = new JLabel("Total Sales:");
        totalSalesLabel.setBounds(50, 130, 80, 25);
        contentPane.add(totalSalesLabel);

        totalSalesTextField = new JTextField();
        totalSalesTextField.setBounds(200, 130, 120, 25);
        contentPane.add(totalSalesTextField);


        JLabel totalDiscountLabel = new JLabel("Total Discount:");
        totalDiscountLabel.setBounds(50, 160, 120, 25);
        contentPane.add(totalDiscountLabel);

        totalDiscountTextField = new JTextField();
        totalDiscountTextField.setBounds(200, 160, 120, 25);
        contentPane.add(totalDiscountTextField);

        JLabel productNameLabel = new JLabel("Product Name:");
        productNameLabel.setBounds(50, 190, 120, 25);
        contentPane.add(productNameLabel);

        productNameTextField = new JTextField();
        productNameTextField.setBounds(200, 190, 120, 25);
        contentPane.add(productNameTextField);

        JLabel markedPriceLabel = new JLabel("Marked Price:");
        markedPriceLabel.setBounds(50, 220, 80, 25);
        contentPane.add(markedPriceLabel);

        markedPriceTextField = new JTextField();
        markedPriceTextField.setBounds(200, 220, 120, 25);
        contentPane.add(markedPriceTextField);

        JLabel sellingPriceLabel = new JLabel("Selling Price: ");
        sellingPriceLabel.setBounds(50, 250, 80, 25);
        contentPane.add(sellingPriceLabel);

        sellingPriceTextField = new JTextField();
        sellingPriceTextField.setBounds(200, 250, 120, 25);
        contentPane.add(sellingPriceTextField);

        JButton addDepartmentButton = new JButton("Add Department");
        addDepartmentButton.setBounds(50, 300, 150, 25);
        addDepartmentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField departmentStoreId = storeIdTextField;
                JTextField departmentStoreName = storeNameTextField;
                JTextField departmentLocation = locationTextField;
                JTextField departmentTotalSales = totalSalesTextField;
                JTextField departmentDiscount = totalDiscountTextField;
                JTextField departmentProductName = productNameTextField;
                JTextField departmentMarkedPrice = markedPriceTextField;
                // JTextField departmentSellingPrice = sellingPriceTextField;
                JTextField departmentOpeningHour = openingHourTextField;

                try {
                    // JTextField localtoreIDTextField;
                    int storeId = Integer.parseInt(departmentStoreId.getText());
                    String storeName = departmentStoreName.getText();
                    String storeLocation = departmentLocation.getText();
                    String openingHours = departmentOpeningHour.getText();
                    int totalSales = Integer.parseInt(departmentTotalSales.getText());
                    int totalDiscount = Integer.parseInt(departmentDiscount.getText());
                    String productName = departmentProductName.getText();
                    int markedPrice = Integer.parseInt(departmentMarkedPrice.getText());
                    // int sellingPrice = Integer.parseInt(departmentSellingPrice.getText());  
                    Department department = new Department(storeId, storeName, storeLocation, openingHours, totalSales, totalDiscount, productName, markedPrice);
                    storeArrayList.add(department);
                    
                    if(department != null)
                    {
                        JOptionPane.showMessageDialog(contentPane, "Data Input Success");
                    }
                    
                }
                catch(NumberFormatException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Invalid Input. Please Enter The data First");
                }
            }
        });
        contentPane.add(addDepartmentButton);


        JButton displayButton = new JButton("Display Department");
        displayButton.setBounds(200, 300, 150, 25);
        displayButton.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
        try{
          
              int storeId = Integer.parseInt(storeIdTextField.getText());
              String storeName = storeNameTextField.getText();
              String location = locationTextField.getText();
              String openingHour = openingHourTextField.getText();
              int totalSales = Integer.parseInt(totalSalesTextField.getText());
              int totalDiscount = Integer.parseInt(totalDiscountTextField.getText());
              String productName = productNameTextField.getText();
              int markedPrice = Integer.parseInt(markedPriceTextField.getText());
              int sellingPrice = Integer.parseInt(sellingPriceTextField.getText());
                Department department = new Department(storeId,storeName,location,openingHour,totalSales,totalDiscount, productName,  markedPrice);
              if(department != null) {
              String message = String.format(
                "Store ID: %s\nStore Name: %s\nLocation: %s\nOpening Hour: %s\n" +
                "Total Sales: %s\nTotal Discount: %s\nProduct Name: %s\n" +
                "Marked Price: %s\nSelling Price: %s",
                storeId, storeName, location, openingHour, totalSales, 
                totalDiscount, productName, markedPrice, sellingPrice);

                 // Displaying the message in a dialog box
              JOptionPane.showMessageDialog(contentPane, message, "Store Information", JOptionPane.INFORMATION_MESSAGE);
              }
            
            }
            catch(NumberFormatException Ex) {
                JOptionPane.showMessageDialog(contentPane, "Invalid Input. Please Enter The data First");
            }
            //     try {
            //         int storeId = Integer.parseInt(storeIdTextField.getText());

            //         Department department = null;
            //         Retailer retailer = null;
                    
            //         for (Store store : storeArrayList) {
                
            //             if (store.getStoreId() == storeId) {
            //                 if (store instanceof Department) {
            //                     department = (Department) store;
            //                 } else if (store instanceof Retailer) {
            //                     retailer = (Retailer) store;
            //                 }
            //                 break;
            //             }
                        
            //         }
            //         if (department != null) {

            //             JOptionPane.showMessageDialog(contentPane, "Department Information:\n" + department.toString());
            //         } 
            //         else if (retailer != null) {
            //             JOptionPane.showMessageDialog(contentPane, "Retailer Information:\n" + retailer.toString());
            //         }
            //          else {
            //             JOptionPane.showMessageDialog(contentPane, "Invalid store ID. Please enter a valid store ID.");
            //         }
            //     } 
            //     catch (NumberFormatException ex) {
            //         JOptionPane.showMessageDialog(contentPane, "Invalid input. Please enter numbers in the correct format.");
            //     }
            }
        });
        contentPane.add(displayButton);



        // Code For Retailer


        JLabel storeIdlLabel1 = new JLabel();
        storeIdlLabel1.setText("Store ID: ");
        storeIdlLabel1.setBounds(800, 10, 100, 25);
        contentPane.add(storeIdlLabel1);
        
        storeIdTextField1 = new JTextField();
        storeIdTextField1.setBounds(900,10,120,25);
        contentPane.add(storeIdTextField1);

        JLabel storeNameLabel1 = new JLabel("Store Name:");
        storeNameLabel1.setBounds(800, 50, 80, 25);
        contentPane.add(storeNameLabel1);

        storeNameTextField1 = new JTextField();
        storeNameTextField1.setBounds(900,50,120,25);
        contentPane.add(storeNameTextField1);

        JLabel locationLabel1 = new JLabel("Location:");
        locationLabel1.setBounds(800, 90, 80, 25);
        contentPane.add(locationLabel1);

        locationTextField1 = new JTextField();
        locationTextField1.setBounds(900, 90, 120, 25);
        contentPane.add(locationTextField1);

        JLabel openingHourLabel1 = new JLabel("Opening Hour:");
        openingHourLabel1.setBounds(800, 130, 80, 25);
        contentPane.add(openingHourLabel1);

        openingHourTextField1 = new JTextField();
        openingHourTextField1.setBounds(900, 130, 120, 25);
        contentPane.add(openingHourTextField1);

        JLabel totalSalesLabel1 = new JLabel("Total Sales:");
        totalSalesLabel1.setBounds(800, 180, 80, 25);
        contentPane.add(totalSalesLabel1);

        totalSalesTextField1 = new JTextField();
        totalSalesTextField1.setBounds(900, 180, 120, 25);
        contentPane.add(totalSalesTextField1);

        JLabel totalDiscountLabel1 = new JLabel("Total Discount:");
        totalDiscountLabel1.setBounds(800, 220, 100, 25);
        contentPane.add(totalDiscountLabel1);

        totalDiscountTextField1 = new JTextField();
        totalDiscountTextField1.setBounds(900, 220, 120, 25);
        contentPane.add(totalDiscountTextField1);

        JLabel vatInclusivePriceLabel = new JLabel("VAT Inclusive Price:");
        vatInclusivePriceLabel.setBounds(780, 280, 120, 25);
        contentPane.add(vatInclusivePriceLabel);

        vatInclusivePriceTextField = new JTextField();
        vatInclusivePriceTextField.setBounds(900, 280, 120, 25);
        contentPane.add(vatInclusivePriceTextField);

        isPaymentOnlineCheckBox = new JCheckBox("Is Payment Online?");
        isPaymentOnlineCheckBox.setBounds(800, 320, 200, 25);
        contentPane.add(isPaymentOnlineCheckBox);

        String[] years = {"Year", 
        "2000", 
        "2001", 
        "2002", 
        "2003",
        "2004",
        "2005",
        "2006",
        "2007",
        "2008",
        "2009",
        "2010",
        "2011",
        "2012",
        "2013",
        "2014",
        "2015",
        "2016",
        "2017",
        "2018",
        "2019",
        "2020",
        "2021",
        "2022",
        "2023",
        "2024",

                };


        purchasedYearComboBox = new JComboBox<>(years);
        purchasedYearComboBox.setBounds(820, 380, 120, 25);
        contentPane.add(purchasedYearComboBox);
    
        JButton retailerButton = new JButton("Add Retailer");
        retailerButton.setBounds(750, 450, 120, 25);

        
        retailerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                try {
                    int storeId = Integer.parseInt(storeIdTextField1.getText());
                    String storeName = storeNameTextField1.getText();
                    String location = locationTextField1.getText();
                    String openingHour = openingHourTextField1.getText();
                    int totalSales = Integer.parseInt(totalSalesTextField1.getText());
                    int totalDiscount = Integer.parseInt(totalDiscountTextField1.getText());
                    int vatInclusivePrice = Integer.parseInt(vatInclusivePriceTextField.getText());
                    boolean isPaymentOnline = isPaymentOnlineCheckBox.isSelected();
                    String purchasedYear = purchasedYearComboBox.getSelectedItem().toString();
                    Retailer retailer = new Retailer(storeId, storeName, location, openingHour, totalSales, totalDiscount, vatInclusivePrice, isPaymentOnline, purchasedYear);
                    storeArrayList.add(retailer);
                    JOptionPane.showMessageDialog(contentPane, "Data Input Success");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Invalid input. Please enter numbers in the correct format.");
                }
            }
        });
        contentPane.add(retailerButton);

        JButton displayButton1 = new JButton("Display Retailer");
        displayButton1.setBounds(900, 450, 150, 25);
        displayButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try{
                int storeId = Integer.parseInt(storeIdTextField1.getText());
                String storeName = storeNameTextField1.getText();
                String location = locationTextField1.getText();
                String openingHour = openingHourTextField1.getText();
                int totalSales = Integer.parseInt(totalSalesTextField1.getText());
                int totalDiscount = Integer.parseInt(totalDiscountTextField1.getText());
                int vatInclusivePrice = Integer.parseInt(vatInclusivePriceTextField.getText());
                boolean isPaymentOnline = isPaymentOnlineCheckBox.isSelected();
                String purchasedYear = purchasedYearComboBox.getSelectedItem().toString();
                Retailer retailer = new Retailer(storeId, storeName, location, openingHour, totalSales, totalDiscount, vatInclusivePrice, isPaymentOnline, purchasedYear);
                storeArrayList.add(retailer);
                
                
                if(retailer != null)
                {
                    JOptionPane.showMessageDialog(contentPane, "Displaying Department");
                    String message = String.format( "Store ID : %s \n Store Name: %s \n Location: %s \n Opening Hour : %s \n " +
                    "Total Sales: %s\n Total Discount: %s \n Vat Inclusive Price %s \n" +
                    "Is Payment Online : %s \n Purchased Year : %s",
                    storeId, storeName, location, openingHour, totalSales, totalDiscount, vatInclusivePrice,
                    isPaymentOnline, purchasedYear);

                    JOptionPane.showMessageDialog(contentPane, message,"Retailer Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(contentPane,"Invalid Input, Please Enter the Data First");
            }
            }});
        contentPane.add(displayButton1);





        // Code For Calculate Discount



        JLabel storeIdlLabel2 = new JLabel();
        storeIdlLabel2.setText("Store ID: ");
        storeIdlLabel2.setBounds(420, 10, 100, 25);
        contentPane.add(storeIdlLabel2);

        storeIdTextField2 = new JTextField();
        storeIdTextField2.setBounds(500,10,120,25);
        contentPane.add(storeIdTextField2);

        JLabel isInSales1 = new JLabel("isInSales:");
        isInSales1.setBounds(400, 50, 120, 25);
        contentPane.add(isInSales1);

        isInSalesNo = new JCheckBox("No");
        isInSalesNo.setBounds(550, 50, 50, 25);
        contentPane.add(isInSalesNo);

        isInSalesYes = new JCheckBox("Yes");
        isInSalesYes.setBounds(500, 50, 50, 25);
        contentPane.add(isInSalesYes);

        

        



        
        // Code For Remove Product


        JLabel storeNameLabel3 = new JLabel("Store Name:");
        storeNameLabel3.setBounds(400, 200, 80, 25);
        contentPane.add(storeNameLabel3);

        storeIdTextField3 = new JTextField();
        storeIdTextField3.setBounds(490,200,120,25);
        contentPane.add(storeIdTextField3);
        


        // SetLoyaltyPoint Code


        JLabel storeNameLabel4 = new JLabel("Store Name:");
        storeNameLabel4.setBounds(400, 350, 80, 25);
        contentPane.add(storeNameLabel4);

        storeNameTextField4 = new JTextField();
        storeNameTextField4.setBounds(480, 350, 120, 25);
        contentPane.add(storeNameTextField4);

        isPaymentOnlineCheckBox1 = new JCheckBox("Is Payment Online?");
        isPaymentOnlineCheckBox1.setBounds(420, 380, 200, 25);
        contentPane.add(isPaymentOnlineCheckBox1);


        // JComboBox purchasedYearComboBox = new JComboBox();
        




        

        
        
        JButton calculateDiscountButton = new JButton("Calculate Discount Price");
        calculateDiscountButton.setBounds(430, 100, 200, 25);
        // calculateDiscountButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         try {
        //             int storeId = Integer.parseInt(storeIdTextField.getText());
        //             Department department = null;
        //             for (Store store : storeArrayList) {
        //                 if (store.getStoreId() == storeId) {
        //                     department = (Department) store;
        //                     break;
        //                 }
        //             }
        //             if (department != null) {
        //                 int discountPrice = department.calculateDiscountPrice();
        //                 JOptionPane.showMessageDialog(contentPane, "Discount Price: " + discountPrice);
        //             } else {
        //                 JOptionPane.showMessageDialog(contentPane, "Invalid store ID. Please enter a valid store ID.");
        //             }
        //         } catch (NumberFormatException ex) {
        //             JOptionPane.showMessageDialog(contentPane, "Invalid input. Please enter numbers in the correct format.");
        //         }
        //     }
        // });

        contentPane.add(calculateDiscountButton);

        JButton setLoyaltyButton = new JButton("Set Loyalty Point");
        setLoyaltyButton.setBounds(450, 430, 120, 25);
        // setLoyaltyButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         try {
        //             int storeId = Integer.parseInt(storeIdTextField.getText());
        //             Retailer retailer = null;
        //             for (Store store : storeArrayList) {
        //                 if (store.getStoreId() == storeId) {
        //                     retailer = (Retailer) store;
        //                     break;
        //                 }
        //             }
        //             if (retailer != null && isPaymentOnlineCheckBox.isSelected()) {
        //                 int loyaltyPoint = retailer.setLoyaltyPoint();
        //                 JOptionPane.showMessageDialog(contentPane, "Loyalty Point: " + loyaltyPoint);
        //             } else {
        //                 JOptionPane.showMessageDialog(contentPane, "Invalid store ID or isPaymentOnline is not checked.");
        //             }
        //         } catch (NumberFormatException ex) {
        //             JOptionPane.showMessageDialog(contentPane, "Invalid input. Please enter numbers in the correct format.");
        //         }
        //     }
        // });

        contentPane.add(setLoyaltyButton);

        JButton removeProductButton = new JButton("Remove Product");
        removeProductButton.setBounds(450, 250, 130, 25);
        removeProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int storeId = Integer.parseInt(storeIdTextField.getText());
                    Retailer retailer = null;
                    for (Store store : storeArrayList) {
                        if (store.getStoreId() == storeId) {
                            retailer = (Retailer) store;
                            break;
                        }
                    }
                    if (retailer != null) {
                        retailer.removeProduct();
                        JOptionPane.showMessageDialog(contentPane, "Product removed successfully.");
                    } else {
                        JOptionPane.showMessageDialog(contentPane, "Invalid store ID. Please enter a valid store ID.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Invalid input. Please enter numbers in the correct format.");
                }
            }
        });
        contentPane.add(removeProductButton);

        

        JButton displayAll = new JButton("Display All");
        displayAll.setBounds(80, 420, 150,50 );
        contentPane.add(displayAll);

        JButton clearButton = new JButton("Clear ALL");
        clearButton.setBounds(80, 480, 150, 50);


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                storeIdTextField.setText("");
                storeIdTextField1.setText("");
                storeNameTextField1.setText("");
                locationTextField1.setText("");
                openingHourTextField1.setText("");
                totalSalesTextField1.setText("");
                totalDiscountTextField1.setText("");
                vatInclusivePriceTextField.setText("");
                storeNameTextField4.setText("");
                storeIdTextField1.setText("");
                locationTextField.setText("");
                openingHourTextField.setText("");
                totalSalesTextField.setText("");
                totalDiscountTextField.setText("");
                productNameTextField.setText("");
                markedPriceTextField.setText("");
                sellingPriceTextField.setText("");
                vatInclusivePriceTextField.setText("");
                loyaltyPointTextField.setText("");
                sellingPriceTextField.setText("");
                // isPaymentOnlineCheckBox.setSelected(false);
            }
        });
        contentPane.add(clearButton);

        JPanel color1 = new JPanel();
        color1.setBackground(Color.lightGray);
        color1.setBounds(30,0,350,390);
        color1.setLayout(null);
        contentPane.add(color1);

        

        JPanel color2 = new JPanel();
        color2.setBackground(Color.lightGray);
        color2.setBounds(730,0,350,500);
        color2.setLayout(null);
        contentPane.add(color2);

        JPanel color3 = new JPanel();
        color3.setBackground(Color.lightGray);
        color3.setBounds(390,0,280,140);
        color3.setLayout(null);
        contentPane.add(color3);

        JPanel color4 = new JPanel();
        color4.setBackground(Color.lightGray);
        color4.setBounds(390,190,280,100);
        color4.setLayout(null);
        contentPane.add(color4);

        JPanel color5 = new JPanel();
        color5.setBackground(Color.lightGray);
        color5.setBounds(390,340,280,130);
        color5.setLayout(null);
        contentPane.add(color5);


        setVisible(true);
    

    
}
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> new StoreGUI());
        
    }}