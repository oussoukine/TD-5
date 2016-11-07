
import java.awt.*;


import javax.swing.*;

public class Tableau extends JFrame{
	public Tableau(){
		super("My first tab");
		Object [][] data={{"Salim","PDG","100000.0"},
				{"Halima","Secrétaire","20000.0"},
		{"AbdelHalim","Agent de securite" ,"15000.0"}                  };
		String []column={"Nom","job","salaire"};
		JTable tab=new JTable(data,column);
		tab.setPreferredScrollableViewportSize(new Dimension(300,80));
		JScrollPane pane=new JScrollPane(tab);
		getContentPane().add(pane,BorderLayout.CENTER );
	}
	

	

	public static void main(String[] args) {
		
		Tableau t=new Tableau();
		t.setVisible(true);

	}

}
