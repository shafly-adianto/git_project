package git_project;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Main main = new Main();
	static Scanner input = new Scanner(System.in);
	Gadai gd = new Gadai();
	ArrayList<Gadai> data_gadai = new ArrayList<>();
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean valid;
		
		while(true) {
			do {
				valid = true;
				try {
					System.out.println("Pegadaian System: ");
					System.out.println("1. Gadai");
					System.out.println("2. Tebus");
					System.out.println("3. Tampilkan Inventory");
					System.out.println("4. Exit");
					System.out.print("\n\nMasukan nomor program: ");
					int nomor = input.nextInt();
					main.inputan(nomor);
				}
				catch(Exception e){
					valid = false;
					System.out.print("Sesuaikan Format Inputtan!!!");
					input = new Scanner(System.in);
				}
			}while(!valid);
		}
	}
	
	public void inputan(int nomor) {
		switch(nomor) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			System.out.print("Exit");
			System.exit(0);
			break;
		default:
			System.out.print("Nomor program tidak ada");
			break;
		}
		
	}
}