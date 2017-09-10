package an;

public class AllAnimals {
	public static void main(String[]args) {
		Animal animals[]=new Animal[3];
		animals[0]=new Cat(0, 5.5, "Barsic", 3);
		animals[1]=new Dog(10, "Bax", 3);
		animals[2]=new Kitten(2, 0, 0.6, "Sem", 1);//метод voice не переопределен в классе Kitten поэтому вызывается метод voice super класса.
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i].getName()+" seys "+animals[i].voice());
		
		}
	}
}
