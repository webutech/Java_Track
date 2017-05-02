import javax.swing.JOptionPane;

public class FirstApproach {

	public static void main(String[] args) {
		int id;
		String name;
		
		id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee Id"));
		name=JOptionPane.showInputDialog("Enter name");
		JOptionPane.showMessageDialog(null, id+" , "+name);
		//System.out.println(id+", "+name);
		

	}

}
