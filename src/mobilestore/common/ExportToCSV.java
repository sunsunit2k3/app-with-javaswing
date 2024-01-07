package mobilestore.common;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportToCSV {
    public static String exportToCSV(JTable table, File file) {
        String message = " ";
        try (FileWriter writer = new FileWriter(file)) {
            TableModel model = table.getModel();
            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.write(model.getColumnName(i) + ",");
            }
            writer.write("\n");
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);
                    writer.write(value != null ? value.toString() : "");  
                    writer.write(",");
                }
                writer.write("\n");
            }
            message =  "Exported to CSV successfully!";
        } catch (IOException e) {
            message =  "Error exporting to CSV: " + e.getMessage();
        }
        return message;
    }
}
