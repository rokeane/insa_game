import java.util.*;

public class INSA {

	 public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);

			System.out.println("\n\n\n\n\nHi! Welcome to INSA\n");
      System.out.println("The aim of the game is to take as much food as possible while being charged only €3.30.\n");

      System.out.println("To Begin, Please select your character\n");
      System.out.println("Press 1 for Sergio (Easy Mode)\nPress 2 for Kenny (Intermediate Mode)\nPress 3 for Ronan (Advanced Mode)");

      int ans = keyboard.nextInt();
      Canteen canteen = new Canteen(ans);

			switch(ans) {
			  case 1:
				System.out.println("You have chosen Sergio, this should be easy");

				break;
			  case 2:
				System.out.println("You have chosen Kenny, I see you like a challenge");


				break;
				case 3:
				System.out.println("You have chosen Ronan.....Have Fun");

        break;
			  default:
				System.out.println("Fine, don't choose a character then");
			}



        System.out.println("What time do you wish to arrive?\n");
        System.out.println("Press 1 for 11:30 (Empty)\nPress 2 for 12:00 (Small crowd)\nPress 3 for 12:30 (Super Busy)");

        int answer = keyboard.nextInt();

        canteen.getTime(answer);

        System.out.println("Step 1: Entrées\n");
        System.out.println("Select as many entrées as you wish but choose wisely:\n");
        System.out.println("1.Bread\n2.Tray of Eggs\n3.Cheese\n4.Couscous\n5.Sardines\n6.Quiche (Chaud)\n7.Soupe (Chaud)\n8.Coleslaw\n9.Move on");

        //int choice_entree = keyboard.nextInt();

        int entrees = 0;

      while(true){
          int choice_entree = keyboard.nextInt();
          canteen.Entree(choice_entree);
          entrees++;
          if (choice_entree == 9){
          break;
          }
        }
      System.out.println("Ooh la la! You have taken "+entrees+" Entrees");
      System.out.println("Score: "+canteen.getScore());
      System.out.println("\nStep 2: Deserts\n");
      System.out.println("Select as many deserts as you wish but choose wisely:\n");
      System.out.println("1.Fruit\n2.Creme Brulee\n3.Donut\n4.Yoghurt\n5.Fruit salad\n6.Move on");

      //int choice_desert = keyboard.nextInt();

      int deserts = 0;

    while(true){
        int choice_desert = keyboard.nextInt();
        canteen.Desert(choice_desert);
        deserts++;
        if (choice_desert == 6){
        break;
        }
      }

      System.out.println("Ooh la la! You have taken "+deserts+" Deserts");
      System.out.println("Score: "+canteen.getScore());
      System.out.println("\n\nStep 3: Mains\n");
      System.out.println("Select as many mains as you wish, if you're brave enough:\n");
      System.out.println("1.Tasteless Pasta\n2.Overcooked Fish\n3.Dry chicken\n4.Cassoulet\n5.Move on");

      //int choice_main = keyboard.nextInt();
      int mains = 0;

    while(true){
      int choice_main = keyboard.nextInt();
        if(choice_main < 5)
        canteen.Main(choice_main);
        mains++;
        if (choice_main == 5){
        mains--;
        break;
        }
      }

    if (mains>1){
      System.out.println("Oh Mon Dieu! You have taken "+mains+" Mains");
      System.out.println("Score: "+canteen.getScore());
    }


      System.out.println("Final Step: Cashier\n");
      System.out.println("How would you like to address the cashier?");
      System.out.println("1.Say Nothing\n2.Make Eye contact and Smile\n3.Say Bonjour\n4.Make Eye contact and say Bonjour");

      int response = keyboard.nextInt();
      canteen.Cashier(response);

      if (canteen.getScore()>25){
        System.out.println(" \nATTENDS! ATTENDS! ATTENDS! ATTENDS! ATTENDS! ATTENDS! \n");
        System.out.println("Unfortunately, you have been charged extra. Better luck next time\n");
      }else{
        System.out.println("\nGreat Work, you paid €3.30 for "+entrees+" Entrees,"+deserts+" Deserts & "+mains+" Mains\n");
        System.out.println("Score: "+canteen.getScore());
        System.out.println("Bon Appetite!");
      }

      }


	}
