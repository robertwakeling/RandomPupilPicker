package pupils;

import java.awt.*;
import java.awt.event.*;
public class TextAreaFrame{
	public static void main(String[] args) {
		Frame frame=new Frame("Text Frame");
		TextArea textArea=new TextArea("Welcome Roseindia",10,20);
		frame.add(textArea);
		frame.setLayout(new FlowLayout());
		frame.setSize(250,250);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
		}
		});
	}
}
