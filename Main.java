abstract class Animal {	//abstract
	public abstract void eat();

    public abstract void run();
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("Cat eating");
	}
	
	@Override
	public void run() {
		System.out.println("Cat running");
	}
	
	
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eating");
    }

    public void run(){
        System.out.println("Dog running");
    }
}

class main {
	public static void main(String args[]){
		Cat c1 = new Cat();
        c1.eat();
        c1.run();

        Dog d1 = new Dog();
        d1.eat();
        d1.run();

        Animal1 a1 = new Animal1();
        a1.print();

	}
}

