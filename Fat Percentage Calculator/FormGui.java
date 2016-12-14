import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FormGui extends JFrame implements ActionListener{
	JTextField initialPercentTF, initialWeightTF, goalPercentTF, goalWeightTF;
	JLabel initialPercentLabel, initialWeightLabel, goalPercentLabel, goalWeightLabel;
	double initialPercent, initialWeight, initialFat, leanWeight, goalFat, goalPercent, goalWeight;
	JButton calculateButton;
	Font font1 = new Font("Arial",Font.BOLD,18);
	JPanel labelPanel, textFieldPanel;
	
	public FormGui(){

		setTitle("Goal Weight Calculator");
		setLayout(new GridLayout(0,2,0,5));
		setSize(350, 200);		
		initializeTextFields();			
		
		calculateButton = new JButton("Calculate");
		calculateButton.setPreferredSize(new Dimension(100,25));
		calculateButton.addActionListener(this);
		add(calculateButton);
		
	}



	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == calculateButton){
			/*if(initialPercentTF.getText().isEmpty() || initialWeightTF.getText().isEmpty() || goalPercentTF.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,  "You must enter Current BFP, Current Weight, and Goal BFP!!!", "Missing Input", JOptionPane.ERROR_MESSAGE);
			}			
			else*/
			try{
				goalWeightTF.setText(String.valueOf(Math.round(calculate())));
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,  "You must enter valid numbers for Current BFP, Current Weight, and Goal BFP!!!", "Missing Input", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public void initializeTextFields(){		
		
		initialPercentTF = new JTextField();
		initialWeightTF = new JTextField();
		goalPercentTF = new JTextField();		
		goalWeightTF = new JTextField();
		goalWeightTF.setEditable(false);
		
		JTextField[] textFieldArray = {initialPercentTF, initialWeightTF, goalPercentTF, goalWeightTF};
		
		initialPercentLabel = new JLabel("Current BFP");	
		initialWeightLabel = new JLabel("Current Weight");	
		goalPercentLabel = new JLabel("Goal BFP");		
		goalWeightLabel = new JLabel("Goal Weight");
		
		JLabel[] labelArray = {initialPercentLabel, initialWeightLabel, goalPercentLabel, goalWeightLabel};
		
		for(int i = 0; i < textFieldArray.length; i++){
			labelArray[i].setFont(font1);
			textFieldArray[i].setPreferredSize(new Dimension(100, 25));
			add(labelArray[i]);
			add(textFieldArray[i]);
			
		}
	}
	
	public double calculate(){
		initialWeight = Double.parseDouble(initialWeightTF.getText());
		initialPercent = Double.parseDouble(initialPercentTF.getText())/100;
		goalPercent = Double.parseDouble(goalPercentTF.getText())/100;
		initialFat = initialWeight * initialPercent;
		leanWeight = initialWeight-initialFat;
		goalFat = leanWeight*goalPercent/(1-goalPercent);
		goalWeight = goalFat + leanWeight;
		return goalWeight;
	}



}
