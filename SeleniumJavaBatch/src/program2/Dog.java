package program2;

public class Dog extends Animal{

	void barking() {
		super.barking();
		System.out.println("Dog is barking");
		
	}
	
	void sleeping () {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.barking();
		d.sleeping();

	}

}
