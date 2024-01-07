/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobilestore.common;

import javax.swing.JOptionPane;

/**
 *
 * @author Long
 */
public class MessageDialog {
    public void inforMessegeDiaLog(String message, String title){
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
