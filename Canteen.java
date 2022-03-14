
import java.util.*;

public class Canteen {

    private int difficulty;
    private int score;

    public Canteen(int diff) {
      this.difficulty = diff;
      this.score = 2*diff - 2;
    }

    public int getScore() {
        return this.score;
    }

    public int getDiff() {
        return this.difficulty;
    }


    public void getTime(int time) {

      switch(time) {
        case 1:
        System.out.println("No queue");
        System.out.println("But less cover\n");
        score += 6;
        break;
        case 2:
        System.out.println("There's a small weight");
        System.out.println("But at least there's more cover\n");
        score += 3;
        break;
        case 3:
        System.out.println("Okay you may have to wait a while");
        System.out.println("Optimum coverage on the other hand\n");
        break;
        default:
        System.out.println("You Stupid or something?\n\nI'll ask again\nWhat time do you want to arrive?");

      }

    }

    public void Entree(int choice) {

      switch(choice) {
        case 1:
        System.out.println("+ Bread");
        this.score += 1;
        break;
        case 2:
        System.out.println("+ Eggs");
        this.score += 2;
        break;
        case 3:
        System.out.println("+ Cheese");
        this.score += 1;
        break;
        case 4:
        System.out.println("+ Couscous");
        this.score += 2;
        break;
        case 5:
        System.out.println("+ Sardines");
        this.score += 2;
        break;
        case 6:
        System.out.println("+ Quiche");
        this.score += 3;
        break;
        case 7:
        System.out.println("+ Soupe");
        this.score += 5;
        break;
        case 8:
        System.out.println("+ Coleslaw");
        this.score += 2;
        break;
        case 9:
        System.out.println("Moving on");
        break;
        default:
        System.out.println("Incorrect answer, you messed up the greeting.");
      }
    }

      public void Desert(int choice_desert) {

        switch(choice_desert) {
          case 1:
          System.out.println("+ Fruit");
          this.score += 1;
          break;
          case 2:
          System.out.println("+ Creme Brulee");
          this.score += 2;
          break;
          case 3:
          System.out.println("+ Donut");
          this.score += 1;
          break;
          case 4:
          System.out.println("+ Yoghurt");
          this.score += 1;
          break;
          case 5:
          System.out.println("+ Fruit Salad");
          this.score += 2;
          break;
          case 6:
          System.out.println("Moving on");
          break;
          default:
          System.out.println("Please try again. It's not that hard");
        }
      }

      public void Main(int choice_main) {

        switch(choice_main) {
          case 1:
          System.out.println("+ Pasta");
          this.score += 10;
          break;
          case 2:
          System.out.println("+ Fish");
          this.score += 10;
          break;
          case 3:
          System.out.println("+ Chicken");
          this.score += 10;
          break;
          case 4:
          System.out.println("+ Cassoulet");
          this.score += 10;
          break;
          case 5:
          System.out.println("Moving on");
          break;

          default:
          System.out.println("Please try again. It's not that hard to get it right");
          break;
        }
      }

      public void Cashier(int response) {

        switch(response) {
          case 1:
          System.out.println("Looking suspicious");
          score += 2;
          break;
          case 2:
          System.out.println("A bit creepy but ok");
          score += 1;
          break;
          case 3:
          System.out.println("Nice, nothing unusual here");

          break;
          case 4:
          System.out.println("Very Good, Divert them away from looking at your tray");
          break;

          default:
          System.out.println("Please try again. It's not that hard to get it right");
        }
      }

    }
