
package healthanalyticswithml;
import application.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
 
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
 
public class HeaderRenderer extends JLabel implements TableCellRenderer {
 
    public HeaderRenderer() {
        setFont(new Font("Consolas", Font.BOLD, 14));
		setOpaque(true);
        setForeground(Color.WHITE);
        setBackground(Color.BLUE);
        setBorder(BorderFactory.createEtchedBorder());
    }
     
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }
 
}