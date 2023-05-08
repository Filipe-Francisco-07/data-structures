package Tabelas_Hash;

public class Main_hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hashTable3 HashTable = new hashTable3(6);
		
		HashTable.inserir("123.123.123-12", "Herbert Richards");
		HashTable.inserir("777.666.777-66", "Tuezin");
		HashTable.inserir("413.753.156-32", "Sorriso Ronaldo");
		
		System.out.println(HashTable.recuperar("123.123.123-12"));
		System.out.println(HashTable.recuperar("777.666.777-66"));
		System.out.println(HashTable.recuperar("413.753.156-32"));

		
	}

}
