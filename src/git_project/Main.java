package git_project;
import java.util.Scanner;

public class Main {
	static Main main = new Main();
	static Scanner input = new Scanner(System.in);
	Gadai gd = new Gadai();
	
	public void inputGadai() {
		String nama, productCategory, description;
		int price;
		boolean valid = false;
	
		do {
			input.nextLine();
			System.out.print("Nama :");
			nama = input.nextLine();
			
			if (nama.length() >= 3 && nama.length() <= 15) {
				gd.setNama(nama);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Product Category :");
			productCategory = input.nextLine();
			
			if (productCategory.equalsIgnoreCase("laptop") || productCategory.equalsIgnoreCase("motor") || productCategory.equalsIgnoreCase("emas")) {
				gd.setProductCategory(productCategory);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Description :");
			description = input.nextLine();
			
			if (description.indexOf(" ") >= 1) {
				gd.setDescription(description);
				valid = true;
			}
		} while (!valid);
		
		do {
			valid = false;
			System.out.print("Price :");
			price = input.nextInt();
			
			if (price%10000 == 0) {
				gd.setPrice(price);
				valid = true;
			}
		} while (!valid);
		
	}
	

	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean valid;
		
		System.out.println("Pegadaian System: ");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. Exit");
		
		while(true) {
			do {
				valid = true;
				try {
					System.out.print("\n\nMasukan nomor program: ");
					int nomor = input.nextInt();
					main.inputan(nomor);
				}
				catch(Exception e){
					valid = false;
					System.out.print("Format harus angka");
					input = new Scanner(System.in);
				}
			}while(!valid);
		}
	}
	
	public void inputan(int nomor) {
		switch(nomor) {
		case 1:
			main.inputGadai();
			System.out.println(gd.getPrice());
			break;
		case 2:
			System.out.print("Tebus");
			break;
		case 3:
			System.out.print("Tampilkan Inventory");
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
