package com.relational;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk menampilkan true atau false dari bilangan memakai operator relasi
 */
public class Relational {

    public static void main(String[] args) {
	    int bil1 = 10;
	    int bil2 = 20;
	    System.out.println("a == b = "+ (bil1 == bil2)); //10 == 20 false
	    System.out.println("a != b = "+ (bil1 != bil2)); //10 != 20 true
	    System.out.println("a > b = "+(bil1 > bil2)); //10 > 20 false
	    System.out.println("a < b = " + (bil1 < bil2)); //10 < 20 true
	    System.out.println("b >= a ="+(bil2 >= bil1)); // 20 >= 10 true
	    System.out.println("b <= a ="+(bil2 <= bil1)); // 20 <= 10 false
    }
}
