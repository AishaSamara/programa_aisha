import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame
{
    private JComboBox imagesJComboBox;
    private JLabel label;

    private static final String[] names =
    {"bug1.gif"."bug2.gif", "travelbug.gif", "bugamin.gif"};
    private Icon[] icons= {
        new ImageIcon(getClass().getResource( names[0]));
        new ImageIcon(getClass().getResource(names[1]));
        new ImageIcon(getClass().getResource( names[2]));
        new ImageIcon(getClass().getResource(names[3]));

        public("Testing JComboBox")
        {
            super("Testing JComboBox");
            setLayout(new FlowLayout());

            imagesJComboBox = new JComboBox(names);
            imagesJComboBox.setMaximumRoowCount(3);

            imagesJComboBox.addItemListener()
            {
                public void ItemStateChanged(ItemEvent event)
                {
                    if(event.getStateChange()== ItemEvent.SELECTED)
                    Tabel.setIcon(icons)[imagesJComboBox.getSelectedIdex()];
                    
                }
            }
        }
    }
}