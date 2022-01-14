package sunadventure.container;

import javax.swing.JButton;
import javax.swing.JFrame;

import sunadventure.modelos.Fase;

public class Container_SunAdventure extends JFrame {

	public Container_SunAdventure() {

		add(new Fase());
		setTitle("Sun Adventure");
		setSize(1024, 768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Container_SunAdventure();

	}

}
