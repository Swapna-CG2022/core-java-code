package com.cg.oopsinjava.gettersandsettersexample;

import java.util.Scanner;

public class MP3ManagementSystem {

	//Product[] listOfProducts = new Product[20];
	MP3[] mp3List = new MP3[30];
	MP3 mp3;
	Scanner sc = new Scanner(System.in);
	String choice;
	char ch = 'y';
	int n ;
	public void MP3StoreSystem() {

		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("add : to add the products");
			System.out.println("display : to display all products");
			choice = sc.next();

			switch (choice) {
			case "add":
				// addProducts();
				addMP3DataUsingScanner();
				break;
			case "display":
				displayProducts();
				break;
			default:
				break;
			}
			System.out.println("Enter the choice to continue");
			ch = sc.next().charAt(0);
		}
	}

	/*
	 * public void addProducts() { mp3 = new MP3(123, "Mobile", 45000f); Product
	 * product1 = new Product(1234, "Mobile", 25000f); Product product2 = new
	 * Product(1235, "Mobile", 245000f); Product product3 = new Product(1253,
	 * "Mobile", 35000f); listOfProducts[0] = product; listOfProducts[1] = product1;
	 * listOfProducts[2] = product2; listOfProducts[3] = product3; }
	 */

	public void displayProducts() {
		System.out.println("ProductId" + "\t" + "Product Name" + "\t" + "Product Price"
							+ "ArtistName" + "\t" + "Duration");
		for (int i = 0; i < n; i++) {
			System.out.println(mp3List[i].getProductId() + "\t" + mp3List[i].getProductName() + "\t"
					+ "\t"+ mp3List[i].getProductPrice()
					+ "\t"+mp3List[i].getArtistName()
					+ "\t"+ mp3List[i].getDuration());
		}
	}

	public void addMP3DataUsingScanner() {
		System.out.println("Enter the number of products");
		 n= sc.nextInt();
		for (int i = 0; i < n; i++) {
			mp3 = new MP3();
			System.out.println("Enter the details of the product..........");
			System.out.println("Enter the product id");
			mp3.setProductId(sc.nextInt());
			System.out.println("Enter the product name");
			sc.nextLine();
			String name = sc.nextLine();
			mp3.setProductName(name);
			System.out.println("Enter the product price");
			//sc.nextLine();
			float price = sc.nextFloat();
			mp3.setProductPrice(price);
			System.out.println("Enter the artist name");
			sc.nextLine();
			String aname = sc.nextLine();
			mp3.setArtistName(aname);
			System.out.println("Enter the duration");
			//sc.nextLine();
			float duration = sc.nextFloat();
			mp3.setDuration(duration);
			mp3List[i] = mp3;
		}
	}

}
