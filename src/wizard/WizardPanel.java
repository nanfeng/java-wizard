package wizard;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class WizardPanel extends JPanel {
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JPanel topPanel;
	private JPanel centerPanel;
	
	public WizardPanel() {
		super();
		init();
	}
	
	public void init(){
		this.setLayout(new BorderLayout());
		
		leftPanel = new JPanel();
		BoxLayout leftLayout = new BoxLayout(leftPanel, BoxLayout.Y_AXIS);
		leftPanel.setLayout(leftLayout);
		leftPanel.setBackground(new Color(221, 221, 221));
		
		topPanel = new JPanel();
		topPanel.setOpaque(false);
		centerPanel = new JPanel();
		centerPanel.setOpaque(false);
				
		rightPanel = new JPanel();
		rightPanel.setBackground(new Color(242, 242, 242));
		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(topPanel, BorderLayout.NORTH);
		rightPanel.add(centerPanel, BorderLayout.CENTER);
		this.add(leftPanel, BorderLayout.WEST);
		this.add(rightPanel, BorderLayout.CENTER);
	}
	
	public JPanel getLeftPanel() {
		return leftPanel;
	}
	public JPanel getTopPanel() {
		return topPanel;
	}
	public JPanel getCenterPanel() {
		return centerPanel;
	}
	
	
}
