// Name:
// USC NetID:
// CS 455 PA1
// Fall 2019



/*

CoinTossSimulator. This is the class responsible for doing the simulation.
It has no graphical output, and in fact, does no I/O to the console either.
It has a run method to run a simulation of tossing a pair of coins for some number of trials.
It has accessors to get the results of the simulation. Subsequent calls to run add trials to the current simulation.
To reset the CoinTossSimulator to start a new simulation, call the reset method. For examples of how it operates,
see the sample output of the test program from the section on testing this class.



 */
import java.util.Random;

public class CoinTossSimulator {

   private Random generator = new Random(); //Create a random generator for the class
   private int twoHeads=0;  //add private instance to store a value
   private int twoTails=0;   //add private instance to store a value
   private int headTails=0;  //add private instance to store a value



   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {

   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {
      if (numTrials < 0) { //Paramter checking
         System.out.println("ERROR: Number entered must be greater than 0.");
         return;
      }else
      {

         int i = generator.nextInt(2);  //Toss first coin i
         int j = generator.nextInt(2);  //Toss second coin j
         // results checking and storing
         if(i==0&&j==0){
            twoHeads++;
         }
         else if(i==1&&j==1)
         {
            twoTails++;
         }
         else
         {
            headTails++;
         }
         numTrials--;
         if(numTrials==0) return;  //exist when there is no trail left
         run(numTrials); //recursively calling the run method until numTrail hits 0;
      }
   }



   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return getTwoHeads() + getTwoTails() + getHeadTails(); // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoHeads; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twoTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      this.twoHeads = 0;
      this.twoTails = 0;
      this.headTails = 0;
   }

}
