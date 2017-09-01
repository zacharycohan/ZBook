/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zbook;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zack
 */
public class MainUI extends javax.swing.JFrame {

    public static Cart cart;

    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
         itemDisplayPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue), "Search Results", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Font font = getBookingsLabel.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        getBookingsLabel.setFont(font.deriveFont(attributes));
        super.pack();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchItemBG = new javax.swing.ButtonGroup();
        searchPatronBG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        itemSearchField = new javax.swing.JTextField();
        itemBarcodeButton = new javax.swing.JRadioButton();
        itemNameButton = new javax.swing.JRadioButton();
        searchItemButton = new javax.swing.JButton();
        patronSearchField = new javax.swing.JTextField();
        patronBarcodeButton = new javax.swing.JRadioButton();
        patronNameButton = new javax.swing.JRadioButton();
        searchPatronButton = new javax.swing.JButton();
        getBookingsLabel = new javax.swing.JLabel();
        returnItemField = new javax.swing.JTextField();
        cartLabel = new javax.swing.JLabel();
        returnItemButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        itemDisplayPane = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        patronIDLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        finesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsList = new javax.swing.JList<>();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        itemNameLabel = new javax.swing.JLabel();
        copyNumberLabel = new javax.swing.JLabel();
        itemStatusLabel = new javax.swing.JLabel();
        ownerLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingsForItemList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        commitBookingButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        currBookingField = new javax.swing.JTextField();
        cancelBookingButton = new javax.swing.JButton();

        itemBarcodeButton.setSelected(true);

        patronBarcodeButton.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZBook Electronic Checkout System");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue));

        itemSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchFieldActionPerformed(evt);
            }
        });

        searchItemBG.add(itemBarcodeButton);
        itemBarcodeButton.setText("barcode");

        searchItemBG.add(itemNameButton);
        itemNameButton.setText("name");

        searchItemButton.setText("Search Item");
        searchItemButton.setMaximumSize(new java.awt.Dimension(101, 23));
        searchItemButton.setMinimumSize(new java.awt.Dimension(101, 23));
        searchItemButton.setPreferredSize(new java.awt.Dimension(101, 23));
        searchItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButtonActionPerformed(evt);
            }
        });

        patronSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patronSearchFieldActionPerformed(evt);
            }
        });

        searchPatronBG.add(patronBarcodeButton);
        patronBarcodeButton.setText("barcode");

        searchPatronBG.add(patronNameButton);
        patronNameButton.setText("name");

        searchPatronButton.setText("Search Patron");
        searchPatronButton.setPreferredSize(new java.awt.Dimension(91, 23));
        searchPatronButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatronButtonActionPerformed(evt);
            }
        });

        getBookingsLabel.setForeground(new java.awt.Color(0, 0, 255));
        getBookingsLabel.setText("Get Bookings For next 7 Days");
        getBookingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getBookingsLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getBookingsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                getBookingsLabelMouseExited(evt);
            }
        });

        returnItemField.setText("Enter Barcode Here...");
        returnItemField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnItemFieldActionPerformed(evt);
            }
        });

        cartLabel.setForeground(java.awt.Color.blue);
        cartLabel.setText("Cart(0)");
        cartLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartLabelMouseExited(evt);
            }
        });

        returnItemButton.setText("Return");
        returnItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemSearchField)
                    .addComponent(searchItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(itemBarcodeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patronSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(itemNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchPatronButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patronBarcodeButton)
                    .addComponent(patronNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(returnItemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnItemField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(getBookingsLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 379, Short.MAX_VALUE)
                        .addComponent(cartLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(getBookingsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cartLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(patronBarcodeButton)
                                .addComponent(returnItemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(returnItemButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(itemBarcodeButton)
                                    .addComponent(itemSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patronSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemNameButton)
                                        .addComponent(searchPatronButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(patronNameButton))
                                    .addComponent(searchItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue));

        itemDisplayPane.setBackground(new java.awt.Color(255, 255, 255));
        itemDisplayPane.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 204, 204), java.awt.Color.cyan, new java.awt.Color(0, 0, 153), java.awt.Color.blue)));
        itemDisplayPane.setForeground(new java.awt.Color(255, 255, 255));
        itemDisplayPane.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue), "Search Display View", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        itemDisplayPane.setPreferredSize(new java.awt.Dimension(375, 100));

        jPanel3.setAutoscrolls(true);
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 130));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));
        itemDisplayPane.setViewportView(jPanel3);

        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("View Patron");
        jInternalFrame1.setVisible(true);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue));

        firstNameLabel.setText("First name: ");

        lastNameLabel.setText("last name: ");

        patronIDLabel.setText("Patron ID: ");

        statusLabel.setText("Status: ");

        finesLabel.setText("Fines: $0");

        itemsList.setBorder(javax.swing.BorderFactory.createTitledBorder("Items this patron currently has in their possession"));
        itemsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(itemsList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(patronIDLabel)
                            .addComponent(statusLabel)
                            .addComponent(finesLabel))
                        .addGap(0, 362, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(firstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(patronIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("View Item");
        jInternalFrame2.setVisible(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.cyan, java.awt.Color.blue));

        itemNameLabel.setText("Item Name:");

        copyNumberLabel.setText("copy number:");

        itemStatusLabel.setText("status:");

        ownerLabel.setText("Patron who currently has item:");

        bookingsForItemList.setBorder(javax.swing.BorderFactory.createTitledBorder("Bookings for this Item"));
        bookingsForItemList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(bookingsForItemList);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemNameLabel)
                            .addComponent(copyNumberLabel)
                            .addComponent(itemStatusLabel)
                            .addComponent(ownerLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(itemNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ownerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 273, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jInternalFrame2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrame2)
                    .addComponent(jInternalFrame1))
                .addGap(6, 6, 6))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.cyan));

        commitBookingButton.setText("Commit Booking");
        commitBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitBookingButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Current Booking for: ");

        currBookingField.setEditable(false);
        currBookingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currBookingFieldActionPerformed(evt);
            }
        });

        cancelBookingButton.setText("Cancel Booking");
        cancelBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currBookingField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(cancelBookingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(commitBookingButton)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(currBookingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commitBookingButton)
                    .addComponent(cancelBookingButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemDisplayPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(itemDisplayPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSearchFieldActionPerformed

    private void patronSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patronSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patronSearchFieldActionPerformed

    private void getBookingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBookingsLabelMouseEntered
        getBookingsLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_getBookingsLabelMouseEntered

    private void getBookingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBookingsLabelMouseExited
        getBookingsLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_getBookingsLabelMouseExited

    private void searchItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButtonActionPerformed
        Connection c = new DBConnector().connect();
        if (itemNameButton.isSelected()) {
            String search = itemSearchField.getText();
            jPanel3.removeAll();
            jPanel3.revalidate();
            jPanel3.repaint();
            String[] s = search.split(" ");

            //create variations of the search strings compatible with sql 
            for (int i = 0; i < s.length; i++) {
                s[i] = "'%" + s[i] + "%'";
                //System.out.println(s[i]);
            }
            try {

                String query = "select * from Item where name LIKE " + s[0];
                for (int i = 1; i < s.length; i++) {
                    query += " OR name LIKE " + s[i];
                }
                String sizeQuery = "select count(*) as size from (" + query + ");";
                query += " ORDER BY name, copy_number;";

                //System.out.println("our search query: "+query);
                Statement stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery(sizeQuery);
                int size = rs.getInt("size");

                if (size == 0) {
                    //System.out.println("size is 0 -- leaving method");
                    JOptionPane.showMessageDialog(null, "No search results found for \"" + search + "\"", "0 search results found", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                //System.out.println("Just Executed size Query, we have X rows: "+size);
                rs = stmt.executeQuery(query);

                for (int i = 0; i < size; i++) {
                    rs.next();
                    //System.out.println("ITEM NUMBER "+"i"+" ############################# "+ i);
                    String name = rs.getString("name");
                    //System.out.println("name: "+name);

                    int copyNumber = rs.getInt("copy_number");
                    //System.out.println("copy_number: "+copyNumber);

                    String desc = rs.getString("description");
                    //System.out.println("description: "+desc);

                    String status = rs.getString("status");
                    //System.out.println("status: "+status);

                    long barcode = rs.getLong("barcode");

                    String fn = rs.getString("fulfill_notice");
                    //System.out.println("barcode: "+barcode);

                    //System.out.println();
                    SearchItemPanel comp = new SearchItemPanel(name, copyNumber, desc, status, barcode, fn);
                    comp.setVisible(true);
                    comp.setSize(310, 127);
                    jPanel3.add(comp);

                }
                jPanel3.setPreferredSize(new Dimension(345, size * 127));
                jPanel3.revalidate();
                jPanel3.repaint();

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }
        } else if (itemBarcodeButton.isSelected()) {
            String search = itemSearchField.getText();
            try{
                Long.parseLong(search);
            }catch(NumberFormatException n){
                
                JOptionPane.showMessageDialog(null, "Number parsing went wrong");
                return;
            }
            
            jPanel3.removeAll();
            jPanel3.revalidate();
            jPanel3.repaint();

            try {

                String query = "select * from Item where barcode ==  " + search+";";

                //System.out.println("our search query: "+query);
                Statement stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery(query);

                if (rs.isClosed()) {
                    JOptionPane.showMessageDialog(null, "No search results found for \"" + search + "\"", "0 search results found", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                //System.out.println("Just Executed size Query, we have X rows: "+size);
                rs.next();
                //System.out.println("ITEM NUMBER "+"i"+" ############################# "+ i);
                String name = rs.getString("name");
                //System.out.println("name: "+name);

                int copyNumber = rs.getInt("copy_number");
                //System.out.println("copy_number: "+copyNumber);

                String desc = rs.getString("description");
                //System.out.println("description: "+desc);

                String status = rs.getString("status");
                //System.out.println("status: "+status);

                long barcode = rs.getLong("barcode");
                //System.out.println("barcode: "+barcode);
                String fn = rs.getString("fulfill_notice");

                //System.out.println();
                SearchItemPanel comp = new SearchItemPanel(name, copyNumber, desc, status, barcode, fn);
                comp.setVisible(true);
                comp.setSize(310, 127);
                jPanel3.add(comp);

                jPanel3.setPreferredSize(new Dimension(345, 127));
                jPanel3.revalidate();
                jPanel3.repaint();

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }

        }
    }//GEN-LAST:event_searchItemButtonActionPerformed

    private void searchPatronButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatronButtonActionPerformed
        Connection c = new DBConnector().connect();
        if (patronNameButton.isSelected()) {
            String search = patronSearchField.getText();
            jPanel3.removeAll();
            jPanel3.revalidate();
            jPanel3.repaint();
            String[] s = search.split(" ");

            //create variations of the search strings compatible with sql 
            for (int i = 0; i < s.length; i++) {
                s[i] = "'%" + s[i] + "%'";
                //System.out.println(s[i]);
            }
            try {

                String query = "select * from Patron where first_name LIKE " + s[0] + "OR last_name LIKE " + s[0];
                for (int i = 1; i < s.length; i++) {
                    query += " OR first_name LIKE " + s[i] + "OR last_name LIKE " + s[i];
                }
                String sizeQuery = "select count(*) as size from (" + query + ");";
                query += " ORDER BY last_name, first_name, patron_ID;";

                //System.out.println("our search query: "+query);
                Statement stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery(sizeQuery);
                int size = rs.getInt("size");

                if (size == 0) {
                    System.out.println("size is 0 -- leaving method");
                    JOptionPane.showMessageDialog(null, "No search results found for \"" + search + "\"", "0 search results found", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                //System.out.println("Just Executed size Query, we have X rows: "+size);
                rs = stmt.executeQuery(query);

                for (int i = 0; i < size; i++) {
                    rs.next();
                    //System.out.println("ITEM NUMBER "+"i"+" ############################# "+ i);
                    String first = rs.getString("first_name");
                    //System.out.println("name: "+name);

                    String last = rs.getString("last_name");
                    //System.out.println("copy_number: "+copyNumber);

                    int id = rs.getInt("patron_ID");
                    //System.out.println("description: "+desc);

                    String status = rs.getString("relation");
                    //System.out.println("status: "+status);

                    int fines = rs.getInt("fines");
                    //System.out.println("barcode: "+barcode);

                    //System.out.println();
                    SearchPatronPanel comp = new SearchPatronPanel(first, last, id, status, fines);
                    comp.setVisible(true);
                    comp.setSize(310, 127);
                    jPanel3.add(comp);

                }
                jPanel3.setPreferredSize(new Dimension(345, size * 127));
                jPanel3.revalidate();
                jPanel3.repaint();

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }
        } else if (patronBarcodeButton.isSelected()) {
            String search = patronSearchField.getText();
            try{
                Integer.parseInt(search);
            }catch(NumberFormatException n){
                return;
            }
            
            jPanel3.removeAll();
            jPanel3.revalidate();
            jPanel3.repaint();

            try {

                String query = "select * from Patron where patron_ID ==  " + search;

                //System.out.println("our search query: "+query);
                Statement stmt = c.createStatement();

                ResultSet rs = stmt.executeQuery(query);

                if (rs.isClosed()) {
                    System.out.println("size is 0 -- leaving method");
                    JOptionPane.showMessageDialog(null, "No search results found for \"" + search + "\"", "0 search results found", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                //System.out.println("Just Executed size Query, we have X rows: "+size);
                rs.next();
                //System.out.println("ITEM NUMBER "+"i"+" ############################# "+ i);
                String first = rs.getString("first_name");
                //System.out.println("name: "+name);

                String last = rs.getString("last_name");
                //System.out.println("copy_number: "+copyNumber);

                int id = rs.getInt("patron_ID");
                //System.out.println("description: "+desc);

                String status = rs.getString("relation");
                //System.out.println("status: "+status);

                int fines = rs.getInt("fines");
                //System.out.println("barcode: "+barcode);

                //System.out.println();
                SearchPatronPanel comp = new SearchPatronPanel(first, last, id, status, fines);
                comp.setVisible(true);
                comp.setSize(310, 127);
                jPanel3.add(comp);

                jPanel3.setPreferredSize(new Dimension(345, 127));
                jPanel3.revalidate();
                jPanel3.repaint();

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }

        }
    }//GEN-LAST:event_searchPatronButtonActionPerformed

    private void returnItemFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnItemFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnItemFieldActionPerformed

    private void commitBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitBookingButtonActionPerformed

        Connection c = null;
        if (cart.size() == 0) {
            JOptionPane.showMessageDialog(null, "There are no items in the cart."
                    + "\nTo add items, please search desired item by name or barcode and click \"add to booking\"");
            return;
        }

       c = new DBConnector().connect();
        for (int i = 0; i < cart.size(); i++) {

            try {
                Statement stmt = c.createStatement();
                String insert = "INSERT INTO Booking values ("
                        + cart.get(i) + ", " + cart.getPatronID() + ", " + -1
                        + ", " + cart.getStartTime() + ", " + cart.getEndTime() + ");";
                stmt.execute(insert);
                c.commit();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            }

        }

        try {
            c.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getClass().getName() + ": " + e.getMessage());
            return;
        } 
        JOptionPane.showMessageDialog(null, "Booking created successfully");
        this.cart = null;
        cartLabel.setText("Cart(0)");
        currBookingField.setText("");

    }//GEN-LAST:event_commitBookingButtonActionPerformed

    private void currBookingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currBookingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currBookingFieldActionPerformed

    private void cancelBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingButtonActionPerformed
        this.cart = null;
        cartLabel.setText("Cart(0)");
        currBookingField.setText("");
    }//GEN-LAST:event_cancelBookingButtonActionPerformed

    private void returnItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnItemButtonActionPerformed
            String bc = returnItemField.getText();
            long barcode = -1;
            if(bc.equalsIgnoreCase("Enter Barcode Here..."))return;
            Connection c = new DBConnector().connect();
            try{
                barcode = Long.parseLong(bc);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Not a valid barcode");
            }
            try{
                Statement stmt = c.createStatement();
                String delete = "DELETE FROM Has where barcode == "+barcode;
                stmt.executeUpdate(delete);
                c.commit();
                c.close();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "barcode not found");
                
                return;
            }
            JOptionPane.showMessageDialog(null, "item successfully returned");         
    }//GEN-LAST:event_returnItemButtonActionPerformed

    private void cartLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMouseClicked
        CartUI.runCartUI(cart);
    }//GEN-LAST:event_cartLabelMouseClicked

    private void cartLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMouseEntered
        cartLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_cartLabelMouseEntered

    private void cartLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartLabelMouseExited
        cartLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_cartLabelMouseExited

    private void getBookingsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getBookingsLabelMouseClicked
        try {
            
            Desktop d = Desktop.getDesktop();
            File html = ZBook.createHTML();
            d.open(html);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage()+" m");
        }
        
        
    }//GEN-LAST:event_getBookingsLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void runMainUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JList<String> bookingsForItemList;
    private javax.swing.JButton cancelBookingButton;
    protected static javax.swing.JLabel cartLabel;
    private javax.swing.JButton commitBookingButton;
    protected static javax.swing.JLabel copyNumberLabel;
    protected static javax.swing.JTextField currBookingField;
    protected static javax.swing.JLabel finesLabel;
    protected static javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel getBookingsLabel;
    private javax.swing.JRadioButton itemBarcodeButton;
    private javax.swing.JScrollPane itemDisplayPane;
    private javax.swing.JRadioButton itemNameButton;
    protected static javax.swing.JLabel itemNameLabel;
    private javax.swing.JTextField itemSearchField;
    protected static javax.swing.JLabel itemStatusLabel;
    protected static javax.swing.JList<String> itemsList;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    protected static javax.swing.JLabel lastNameLabel;
    protected static javax.swing.JLabel ownerLabel;
    private javax.swing.JRadioButton patronBarcodeButton;
    protected static javax.swing.JLabel patronIDLabel;
    private javax.swing.JRadioButton patronNameButton;
    private javax.swing.JTextField patronSearchField;
    private javax.swing.JButton returnItemButton;
    private javax.swing.JTextField returnItemField;
    private javax.swing.ButtonGroup searchItemBG;
    private javax.swing.JButton searchItemButton;
    private javax.swing.ButtonGroup searchPatronBG;
    private javax.swing.JButton searchPatronButton;
    protected static javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
