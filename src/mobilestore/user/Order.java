/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mobilestore.user;

//import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import mobilestore.common.ConnectionDB;
import mobilestore.common.MessageDialog;
/**
 *
 * @author longc
 */
public class Order extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    public void connectAndLoadData() {
        try (Connection connection = ConnectionDB.getConnection()) {
            String query = "SELECT orders.id, orders.address, orders.phone, products.title as product_name , orders.status ,orders.date FROM orders "
                    + "JOIN users ON orders.user_id = users.id JOIN products ON orders.product_id = products.id WHERE users.id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, userId);
//                System.out.print("hello" + getId());
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
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
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Order() {
        initComponents();
//        addUser(userId);
    }
    private int userId;
    
    public void addUser(int userId){
        this.userId = userId;
        connectAndLoadData();
//        initComponents();
    }
    public int getId(){
        return userId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new mobilestore.user.swing.Background();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        updateBtn = new javax.swing.JButton();

        orderTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Mã Đơn Hàng", "Địa Chỉ", "Số Điện Thoại", "Sản Phẩm", "Trạng Thái", "Ngày Mua"
            }
        ));
        tableModel = (DefaultTableModel) orderTable.getModel();
        connectAndLoadData();
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orderTable);

        jLabel1.setText("Ngày");

        jLabel2.setText("Số Điện Thoại");

        jLabel3.setText("Địa Chỉ");

        updateBtn.setText("Cập nhật");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addressTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
        String address = tableModel.getValueAt(orderTable.getSelectedRow(), 1).toString();
        String phone = tableModel.getValueAt(orderTable.getSelectedRow(), 2).toString();
        String date = tableModel.getValueAt(orderTable.getSelectedRow(), 5).toString();
        //set text field
        addressTF.setText(address);
        try {
            dateChooser.setDate(dateFormat.parse(date));
        } catch (ParseException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        phoneTF.setText(phone);
    }//GEN-LAST:event_orderTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) orderTable.getModel();
        MessageDialog messageDialog = new MessageDialog();
        if (orderTable.getSelectedRowCount() == 1) {
            String address = addressTF.getText();
            Date date = dateChooser.getDate();
            String phone = phoneTF.getText();
            int selectedRow = orderTable.getSelectedRow();
            int modelRow = orderTable.convertRowIndexToModel(selectedRow);
            if("Chờ Duyệt".equals(tblModel.getValueAt(modelRow, 4).toString())){
                try (Connection connection = ConnectionDB.getConnection()) {
                    String sql = "UPDATE orders SET address=?, date=?, phone=? WHERE id=?";
                    try (PreparedStatement statement = connection.prepareStatement(sql)) {
                        statement.setString(1, address);
                        statement.setString(2, new SimpleDateFormat("yyyy-MM-dd").format(date));
                        statement.setString(3, phone);

                        int id = Integer.parseInt(tblModel.getValueAt(modelRow, 0).toString());
                        statement.setInt(4, id);
                                            
                        int rowsAffected = statement.executeUpdate();

                        if (rowsAffected > 0) {
                            tblModel.setValueAt(address, selectedRow, 1);
                            tblModel.setValueAt(phone, selectedRow, 2);
                            tblModel.setValueAt(new SimpleDateFormat("yyyy-MM-dd").format(date), selectedRow, 5);

                            orderTable.repaint();
                            messageDialog.inforMessegeDiaLog("Update Successfully...!", "Alert !!");
                        } else {
                            messageDialog.inforMessegeDiaLog("No rows were updated.", "Alert !!");
                        }
                    }
                } catch (SQLException e) {
                    messageDialog.inforMessegeDiaLog("Error Connect Database...!", "Alert !!");
                }
            } else {
                messageDialog.inforMessegeDiaLog("Không thể sửa thông tin", "Alert !!");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private mobilestore.user.swing.Background background2;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
