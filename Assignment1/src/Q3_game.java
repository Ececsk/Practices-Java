import java.util.*;

public class Q3_game {
	
		public static void main(String[] args) {
			// sayi tahmin
			Scanner ky = new Scanner(System.in);
			 Random rnd = new Random();
			 int counter=1; //deneme sayısı için
			
			 System.out.println("Please enter a number (between 0-100): ");
			int guess = ky.nextInt();
			int number = rnd.nextInt(101); // rastgele bir sayı belirleyecek.(100 de dahil)
			 
			while (guess != number) {
				counter++; //her sayı girişinde 1 artacak 
				if(guess < 0 || guess > 100 ) 
					{System.out.println("Please enter a number between 0 and 100! ");
					guess = ky.nextInt(); }
				else if (guess < number) 
			 {System.out.println("Please enter a higher number: ");
			 guess = ky.nextInt(); }
				else if (guess>number)
			{System.out.println("Please enter a lower number: ");
			guess = ky.nextInt();}
				}
			  
			 System.out.println("You guessed the number after "+counter+" attempts!"); }


		}