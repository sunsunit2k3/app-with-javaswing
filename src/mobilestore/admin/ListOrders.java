/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package mobilestore.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mobilestore.common.ConnectionDB;
import mobilestore.common.MessageDialog;

/**
 *
 * @author longc
 */
public class ListOrders extends javax.swing.JInternalFrame {

    private DefaultTableModel tableModel;
    private void connectAndLoadData() {
    try (Connection connection = ConnectionDB.getConnection()) {
        System.out.print(connection);
        String query = "SELECT orders.id, users.fullname, orders.address, orders.phone, "
                + "orders.quantity, orders.total_price, orders.date, "
                + "orders.status FROM orders JOIN users ON orders.user_id = users.id;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            tableModel.setRowCount(0);
            java.sql.ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
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
    public ListOrders() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        statusSelect = new javax.swing.JComboBox<>();
        searchTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "ID", "User", "Address", "Phone", "Quantity", "Total", "Date", "Status"
            }
        ));
        tableModel = (DefaultTableModel) DataTable.getModel();
        connectAndLoadData();
        DataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DataTable);

        statusSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa Duyệt", "Duyệt Đơn", "Đang Giao Hàng", "Đã Nhận" }));

        searchTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Search:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Trạng thái đơn hàng");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Địa Chỉ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số Điện Thoại:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày Nhận");

        updateBtn.setText("Cập Nhật");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel6.setText("Quản Lý Đơn Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressTF)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusSelect, 0, 131, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phoneTF)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateTF)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(357, 357, 357))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneTF, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
    
    }//GEN-LAST:event_searchTFActionPerformed

    private void searchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTFKeyReleased
        DefaultTableModel tableModel = (DefaultTableModel) DataTable.getModel();
        TableRowSorter <DefaultTableModel> tableRowSorter = new TableRowSorter<>(tableModel);
        DataTable.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(searchTF.getText()));        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFKeyReleased

    private void DataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataTableMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) DataTable.getModel();
        String address = tableModel.getValueAt(DataTable.getSelectedRow(), 1).toString();
        String phone = tableModel.getValueAt(DataTable.getSelectedRow(), 2).toString();
        String date = tableModel.getValueAt(DataTable.getSelectedRow(), 6).toString();
        String status = tableModel.getValueAt(DataTable.getSelectedRow(), 7).toString();
        
        //set text field
        addressTF.setText(address);
        dateTF.setText(date);
        phoneTF.setText(phone);
        statusSelect.setSelectedItem(status);
    }//GEN-LAST:event_DataTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) DataTable.getModel();
        MessageDialog messageDialog = new MessageDialog();
        if (DataTable.getSelectedRowCount() == 1) {
            String address = addressTF.getText();
            String date = dateTF.getText();
            String phone = phoneTF.getText();
            Object status = statusSelect.getSelectedItem();
            try (Connection connection = ConnectionDB.getConnection()) {
                String sql = "UPDATE orders SET address=?, date=?, phone=? , status=? WHERE id=?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, address);
                    statement.setString(2, date);
                    statement.setString(3, phone);
                    statement.setObject(4, status);
                    // Assuming "id" is the primary key in your table, adjust accordingly
                    int selectedRow = DataTable.getSelectedRow();
                    int modelRow = DataTable.convertRowIndexToModel(selectedRow);
                    int id = Integer.parseInt(tblModel.getValueAt(modelRow, 0).toString());
                    statement.setInt(5, id);

                    // Execute the update
                    statement.executeUpdate();

                    // Update the table model
                    tblModel.setValueAt(address, selectedRow, 1);
                    tblModel.setValueAt(phone, selectedRow, 2);
                    tblModel.setValueAt(date, selectedRow, 6);
                    tblModel.setValueAt(status, selectedRow, 7);

                    // Refresh the table
                    DataTable.repaint();
                    messageDialog.inforMessegeDiaLog("Update Successfully...!", "Alert !!");
                }catch (Error e) {
                messageDialog.inforMessegeDiaLog("Error Update...!", "Alert !!");
                }
            } catch (SQLException e) {
                messageDialog.inforMessegeDiaLog("Error Connect Database...!", "Alert !!");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataTable;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField searchTF;
    private javax.swing.JComboBox<String> statusSelect;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
