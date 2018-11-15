
package Graphic;

import Code.BL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Patrick
 */
public class Model extends AbstractTableModel{
    private List<BL>list = new ArrayList<>();
    public static final String [] colNames = { "Bezeichnung","AK","Inbetriebnahme","ND","bish. ND","Afa bisher","Wert vor Afa","Afa d. J.","BW 31.12"};
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }   
    

    @Override
    public Object getValueAt(int r, int c) {
       
        BL = list.get(r); //Pro zeile 1 wegpunkt 
        
        // Enum[] enumWerteArray = Enum.values();
        // Enum enumIndex = enumWerteArray[c];
        switch () {
            case 0:
                return ;
            case :
                return ;

            case :
                return ;

            case :
                return );

            default:
                return "?";
        }
    }
    
}
