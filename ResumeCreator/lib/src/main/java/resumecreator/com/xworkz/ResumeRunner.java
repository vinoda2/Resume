package resumecreator.com.xworkz;

import java.io.IOException;
import java.util.Scanner;



public class ResumeRunner {

	public static void main(String[] args){
		ResumeCreator creat= new ResumeCreator();
		//ResumeDesign design = new ResumeDesign();
		creat.setValue();
		creat.createPDF();
		creat.writeUsingIText();
	}
}
