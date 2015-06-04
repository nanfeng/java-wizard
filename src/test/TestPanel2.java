package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import wizard.WizardPanel;


public class TestPanel2 extends WizardPanel {
 
    private javax.swing.JLabel anotherBlankSpace;
    private javax.swing.JLabel blankSpace;
    private javax.swing.ButtonGroup connectorGroup;
    private javax.swing.JRadioButton ethernetRJRadioButton;
    private javax.swing.JRadioButton ethernetTenRadioButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton notInventedYetRadioButton;
    private javax.swing.JRadioButton serialParallelRadioButton;
    private javax.swing.JLabel welcomeTitle;
    private javax.swing.JRadioButton wirelessRadioButton;
    private javax.swing.JLabel yetAnotherBlankSpace1;
    
    private JLabel iconLabel;
    private JSeparator separator;
    private JLabel textLabel;
    private JPanel titlePanel;
    
    private int width = 100;//labels on the left side width
    private int height = 30;//labels on the left side height
    private String[] labels = {"first", "second", "third"};//labels on the left side
    private int index = 1;//second step
    
    public TestPanel2() {
        super();

    	setLabelsPanel();
    	setTopPanel();
    	setContentPanel();
    }
    
    public void addCheckBoxActionListener(ActionListener l) {
        jCheckBox1.addActionListener(l);
    }
    
    public boolean isCheckBoxSelected() {
        return jCheckBox1.isSelected();
    }
    
    public String getRadioButtonSelected() {
        return connectorGroup.getSelection().getActionCommand();
    }

	//label panel on the left side
	private void setLabelsPanel(){
	    for(int i=0; i<labels.length; i++){
			JLabel jl = new JLabel((i+1)+" "+labels[i]);
			jl.setPreferredSize(new Dimension(width, height));
			jl.setBorder(new EmptyBorder(10, 10, 0, 10));
			if (i<index)
				jl.setEnabled(false);
			if (i == index)
				jl.setFont(new Font("MS Sans Serif", Font.BOLD, 14));
			this.getLeftPanel().add(jl);
		}
	}
	
	//top panel
	private void setTopPanel(){
        ImageIcon icon = getImageIcon();
        
        titlePanel = new javax.swing.JPanel();
        textLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();

        titlePanel.setLayout(new java.awt.BorderLayout());
        titlePanel.setBackground(Color.gray);
        
        textLabel.setBackground(Color.gray);
        textLabel.setFont(new Font("MS Sans Serif", Font.BOLD, 14));
        textLabel.setText("Favorite Connector Type");
        textLabel.setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
        textLabel.setOpaque(true);

        iconLabel.setBackground(Color.gray);
        if (icon != null)
            iconLabel.setIcon(icon);
        
        titlePanel.add(textLabel, BorderLayout.CENTER);
        titlePanel.add(iconLabel, BorderLayout.EAST);
        titlePanel.add(separator, BorderLayout.SOUTH);
        
		this.getTopPanel().add(titlePanel);
	}

	//content panel
    private void setContentPanel() {     
        JPanel contentPanel1 = this.getCenterPanel();
        
        connectorGroup = new javax.swing.ButtonGroup();
        welcomeTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        blankSpace = new javax.swing.JLabel();
        wirelessRadioButton = new javax.swing.JRadioButton();
        ethernetRJRadioButton = new javax.swing.JRadioButton();
        ethernetTenRadioButton = new javax.swing.JRadioButton();
        serialParallelRadioButton = new javax.swing.JRadioButton();
        notInventedYetRadioButton = new javax.swing.JRadioButton();
        
        wirelessRadioButton.setActionCommand("Wireless Radio");
        ethernetRJRadioButton.setActionCommand("Ethernet RJ-45");
        ethernetTenRadioButton.setActionCommand("Ethernet 10 base T");
        serialParallelRadioButton.setActionCommand("Serial/Parallel");
        notInventedYetRadioButton.setActionCommand("Not Yet Invented");
        
        anotherBlankSpace = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        yetAnotherBlankSpace1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        ethernetRJRadioButton.setSelected(true);
        
        contentPanel1.setLayout(new java.awt.BorderLayout());

        welcomeTitle.setText("Please enter your favorite type of data connector:");
        contentPanel1.add(welcomeTitle, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel1.add(blankSpace);

        wirelessRadioButton.setText("802.11 b/g");
        connectorGroup.add(wirelessRadioButton);
        jPanel1.add(wirelessRadioButton);

        ethernetRJRadioButton.setText("Ethernet RJ-45");
        connectorGroup.add(ethernetRJRadioButton);
        jPanel1.add(ethernetRJRadioButton);

        ethernetTenRadioButton.setText("Ethernet 10 base T");
        connectorGroup.add(ethernetTenRadioButton);
        jPanel1.add(ethernetTenRadioButton);

        serialParallelRadioButton.setText("Serial/Parallel");
        connectorGroup.add(serialParallelRadioButton);
        jPanel1.add(serialParallelRadioButton);

        notInventedYetRadioButton.setText("Something Not Yet Invented But You're Sure You'll Want It");
        connectorGroup.add(notInventedYetRadioButton);
        jPanel1.add(notInventedYetRadioButton);

        jPanel1.add(anotherBlankSpace);

        jCheckBox1.setText("I agree to laugh at people who chose options other than mine");
        jPanel1.add(jCheckBox1);

        jPanel1.add(yetAnotherBlankSpace1);

        contentPanel1.add(jPanel1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Note that the 'Next' button is disabled until you check the box above.");
        
        contentPanel1.add(jLabel1, java.awt.BorderLayout.SOUTH);
    }
    
    private ImageIcon getImageIcon() {
        return null;
    }
}
