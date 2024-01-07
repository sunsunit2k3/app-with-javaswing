
package mobilestore.admin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JTable;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.DefaultTableModel;
import mobilestore.common.ConnectionDB;
import mobilestore.common.ExportToCSV;
import mobilestore.common.ImportCSV;
import mobilestore.common.MessageDialog;



public class ListProducts extends javax.swing.JInternalFrame {
    private DefaultTableModel tableModel;
    private void connectAndLoadData() {
    try (Connection connection = ConnectionDB.getConnection()) {
        String query = "SELECT * FROM products";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(rowData);
            }
        }
    } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public ListProducts() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        exportBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectFileBtn = new javax.swing.JButton();
        searchTF = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        titleTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        imageTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        descriptionTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        SelectImage = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Id", "Title", "Image", "Description", "Price", "Quantity"
            }
        ));
        tableModel = (DefaultTableModel) jTable1.getModel();
        connectAndLoadData();
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search");

        exportBtn.setText("Export CSV");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        importBtn.setText("Import CSV");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        selectFileBtn.setText("Select File");
        selectFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileBtnActionPerformed(evt);
            }
        });

        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });
        searchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTFKeyReleased(evt);
            }
        });

        deleteBtn.setText("Xoá");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Sửa");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Thêm");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Title");

        jLabel4.setText("Quantity");

        jLabel5.setText("Image");

        jLabel6.setText("Description");

        jLabel7.setText("Price");

        SelectImage.setText("Select File");
        SelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exportBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectFileBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                    .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(descriptionTF)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(priceTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imageTF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SelectImage)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(importBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(selectFileBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descriptionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectImage))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(updateBtn)
                            .addComponent(addBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        JTable table = jTable1;
        File file = new File("./src/csv/data.csv");
        String message = ExportToCSV.exportToCSV(table, file);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.inforMessegeDiaLog(message, "Alert!!");
    }//GEN-LAST:event_exportBtnActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        String path = jLabel2.getText();
        if(path!=""){
            String message = ImportCSV.importCsvData(path);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.inforMessegeDiaLog(message, title);
        }else{
            String message = "Empty path ";
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.inforMessegeDiaLog(message, title);
        }
    }//GEN-LAST:event_importBtnActionPerformed

    private void selectFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("file", "csv");
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setMultiSelectionEnabled(false);
        
        int x = fileChooser.showDialog(this, "Chon File");
        if(x==JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            jLabel2.setText(f.getAbsolutePath());
        }
    }//GEN-LAST:event_selectFileBtnActionPerformed

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed

    }//GEN-LAST:event_searchTFActionPerformed

    private void searchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyReleased
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        TableRowSorter <DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(searchTF.getText()));
    }//GEN-LAST:event_searchTFKeyReleased

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel obj = (DefaultTableModel) jTable1.getModel();
        MessageDialog messageDialog = new MessageDialog();
        if(jTable1.getSelectedRowCount()==1){
            int selectedRow = jTable1.getSelectedRow();
            int idColumnIndex = 0; 
            Object idToDelete = jTable1.getValueAt(selectedRow, idColumnIndex);
            obj.removeRow(selectedRow);
            Connection connection = null;
            try {
                connection = ConnectionDB.getConnection();
                String sql = "DELETE FROM products WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setObject(1, idToDelete);
                statement.executeUpdate();
                statement.close();
                connection.close();
                messageDialog.inforMessegeDiaLog("Delete success", "Alert !!");
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle database-related exceptions
            }
        }else{
            if(jTable1.getRowCount()==0){
                messageDialog.inforMessegeDiaLog("Table is Empty", "Alert !!");
            }else{
                messageDialog.inforMessegeDiaLog("Please select single row for delete", "Alert !!");            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed
    private String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1).toLowerCase();
        }
        return "png";
    }
    private String extractFileName(String filePath) {
        File file = new File(filePath);
        return file.getName();
    }
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        MessageDialog messageDialog = new MessageDialog();
        if (jTable1.getSelectedRowCount() == 1) {
            String title = titleTF.getText();
            String image = imageTF.getText();
            String description = descriptionTF.getText();
            String price = priceTF.getText();
            String quantity = quantityTF.getText();
            try (Connection connection = ConnectionDB.getConnection()) {
                BufferedImage bufferedImage = ImageIO.read(new File(image));
                String folderPath = System.getProperty("user.dir")+ "/src/images";
                String format = getFileExtension(image);
                File outputfile = new File(folderPath, extractFileName(image));
                ImageIO.write(bufferedImage, format, outputfile);
                String sql = "UPDATE products SET title=?, image=?, description=?, price=?, quantity=? WHERE id=?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, title);
                    statement.setString(2, image);
                    statement.setString(3, description);
                    statement.setString(4, price);
                    statement.setString(5, quantity);

                    // Assuming "id" is the primary key in your table, adjust accordingly
                    int selectedRow = jTable1.getSelectedRow();
                    int id = Integer.parseInt(tblModel.getValueAt(selectedRow, 0).toString());
                    statement.setInt(6, id);

                    // Execute the update
                    statement.executeUpdate();

                    // Update the table model
                    tblModel.setValueAt(title, selectedRow, 1);
                    tblModel.setValueAt(image, selectedRow, 2);
                    tblModel.setValueAt(description, selectedRow, 3);
                    tblModel.setValueAt(price, selectedRow, 4);
                    tblModel.setValueAt(quantity, selectedRow, 5);

                    // Refresh the table
                    jTable1.repaint();
                    messageDialog.inforMessegeDiaLog("Update Successfully...!", "Alert !!");
                }catch (Error e) {
                messageDialog.inforMessegeDiaLog("Error Update...!", "Alert !!");
                }
            } catch (SQLException e) {
                messageDialog.inforMessegeDiaLog("Error Connect Database...!", "Alert !!");
            } catch (IOException ex) {
                Logger.getLogger(ListProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void SelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images", "webp", "jpg", "png");
        fileChooser.setFileFilter(fileFilter);
        fileChooser.setMultiSelectionEnabled(false);
        
        int x = fileChooser.showDialog(this, "Chon File");
        if(x==JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            imageTF.setText(f.getAbsolutePath());
        }
    }//GEN-LAST:event_SelectImageActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        String tblTitle = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblImage = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblDescription = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblPrice = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String tblQuantity = tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
        
        //set text field
        titleTF.setText(tblTitle);
        imageTF.setText(tblImage);
        descriptionTF.setText(tblDescription);
        priceTF.setText(tblPrice);
        quantityTF.setText(tblQuantity);
    }//GEN-LAST:event_jTable1MouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String image = imageTF.getText();
        String price = priceTF.getText();
        String quantity = quantityTF.getText();
        String title = titleTF.getText();
        String description = descriptionTF.getText();
        Connection connection = null;
        String message ;
        MessageDialog messageDialog = new MessageDialog();
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        if(image.equals("")||price.equals("")||title.equals("")||description.equals("")||quantity.equals("")){
            message = "Please enter all data";
            messageDialog.inforMessegeDiaLog(message, "Alert !!");
        }else{
            try {
                connection = ConnectionDB.getConnection();
                String insertQuery = "INSERT INTO products(image, price, quantity, title, description) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setString(1, image);
                preparedStatement.setString(2, price);
                preparedStatement.setString(3, quantity);
                preparedStatement.setString(4, title);
                preparedStatement.setString(5, description);
                int id;
                String getMaxIdQuery = "SELECT MAX(id) FROM products";  
                PreparedStatement getMaxIdStatement  = connection.prepareStatement(getMaxIdQuery);
                ResultSet maxIdResultSet = getMaxIdStatement.executeQuery(getMaxIdQuery);
                if (maxIdResultSet.next()) {
                    id = maxIdResultSet.getInt(1) + 1;
                } else {
                    id = 1;
                }
                String data [] = {Integer.toString(id), title, image, description, price, quantity};
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected == 1) {
                    message = "Add product successfully";
                    tblModel.addRow(data);
                    imageTF.setText("");
                    priceTF.setText("");
                    quantityTF.setText("");
                    titleTF.setText("");
                    descriptionTF.setText("");   
                } else {
                    message = "There was an error adding a product";
                }
                messageDialog.inforMessegeDiaLog(message, "Alert !!");
            } catch (SQLException e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectImage;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descriptionTF;
    private javax.swing.JButton exportBtn;
    private javax.swing.JTextField imageTF;
    private javax.swing.JButton importBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JTextField searchTF;
    private javax.swing.JButton selectFileBtn;
    private javax.swing.JTextField titleTF;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
