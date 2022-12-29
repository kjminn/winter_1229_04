package bmi.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMIView extends JFrame {
	JTextField tfWeight, tfHeight;
	
	public BMIView() {
		add(new PanelAbove(),"North");
		add(new PanelBelow(),"Center");
		setTitle("BMI(Body Measure Index)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(50, 50);
		setSize(400, 600);
		setVisible(true);
	}
	
	class PanelAbove extends JPanel{
		public PanelAbove() {
			setBackground(new Color(204, 204, 255));
			setLayout(new BorderLayout());
			JLabel lblTitle = new JLabel("체질량지수(BMI)", JLabel.CENTER); 
			JLabel lblWeight = new JLabel("체중: ");
			JLabel lblHeight = new JLabel("신장: ");
			JLabel lblkg = new JLabel("㎏");
			JLabel lblcm = new JLabel("㎝");
			JButton btnResult = new JButton("결과확인");
			tfWeight = new JTextField(15);
			tfHeight = new JTextField(15);
			add(lblTitle, "North");
			JPanel panCenter = new JPanel(new BorderLayout());
			
			JPanel[] pans = new JPanel[3];
			for (int i = 0; i < pans.length; i++) {
				pans[i] = new JPanel();
			}
			
			panCenter.add(pans[0], "North");
			panCenter.add(pans[1], "Center");
			pans[0].add(lblWeight); pans[0].add(tfWeight); pans[0].add(lblkg);
			pans[1].add(lblHeight); pans[1].add(tfHeight); pans[1].add(lblcm);
			pans[2].add(btnResult);
			
			add(panCenter, "Center");
			add(pans[2], "South");
		}
	}
	
	class PanelBelow extends JPanel{
		public PanelBelow() {
			setBackground(new Color(255, 204, 229));
		}
	}
	
}
