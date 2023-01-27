package ders16;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {

		Queue<String> q = new ArrayDeque<>();
//		Queue<String> q = new ArrayBlockingQueue<>(10); // Kapasiteyi sinirlandirabiliriz
        q.add("Volvo");
        q.add("BMW");
        q.add("Mazda");
        q.add("Toyota");
        q.add("Honda");
        q.add("Subaru");        
        System.out.println(q.offer("Audi"));        
        System.out.println(q);        
        //offer dizinin siniri varsa onu kontrol ederek ekler
        //remove silmek icin kullanilir
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove("Honda"));
        System.out.println(q);
//        q.offer("Okan"); //ArrayBlockingQueue ile olusturursan sinir verirsin. Eger bos yer varsa offer ile ekleyebilirsin
//        System.out.println("q = " + q);
	}

}
