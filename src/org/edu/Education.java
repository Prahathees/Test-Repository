package org.edu;

public class Education extends Engineering {
	public void ug() {
System.out.println("Ug");
	}
	public void pg() {
		System.out.println("pg");
			}
	
	public static void main(String[] args) {
		Education e = new Education();
		
		e.BE();
		
		e.Btech();
		e.dental();
		e.mbbs();
		e.physico();
		e.pg();
		e.ug();
	}
}
