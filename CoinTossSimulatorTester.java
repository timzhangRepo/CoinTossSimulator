public class CoinTossSimulatorTester
{
    public static void main(String[] args)
    {

        CoinTossSimulator simTester = new CoinTossSimulator();  //create an instance of the CoinTossSimulator class
        System.out.println("After constructor:");
        System.out.println("Number of trials [exp:0]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails

        System.out.println();

        simTester.run(1);
        System.out.println("After run (1)");
        System.out.println("Number of trials [exp:1]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails

        System.out.println();

        simTester.run(10);
        System.out.println("After run (10)");
        System.out.println("Number of trials [exp:1]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails

        System.out.println();

        simTester.run(100);
        System.out.println("After run (100)");
        System.out.println("Number of trials [exp:1]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails

        System.out.println();
        System.out.println("[ . . . output for tests with different number of trials were here . . .]");
        System.out.println();

        simTester.reset();
        System.out.println("After reset");
        System.out.println("Number of trials [exp:1]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails

        System.out.println();
        simTester.run(1000);
        System.out.println("After run (1000)");
        System.out.println("Number of trials [exp:1]: "+ simTester.getNumTrials());   //output numTrails
        System.out.println("Two-head tosses: "+ simTester.getTwoHeads()); //output results with twoheads
        System.out.println("Two-tail tosses: "+ simTester.getTwoTails()); //output results with twotails
        System.out.println("One-head one-tail tosses:"+ simTester.getHeadTails()); //output results with one head and one tail
        System.out.println("Tosses add up correctly? "+sum(simTester.getTwoHeads(),simTester.getTwoTails(),simTester.getHeadTails(),simTester.getNumTrials())); //Calls for sum method to check if sum is equal to trails
        System.out.println();
        System.out.println("[ . . . output for tests with different number of trials were here . . .]");


    }

    public static boolean sum(int getTwoHeads, int getTwoTails, int getHeadTails, int getNumTrials ) //method to use to check sum
    {
        int sum = getTwoHeads+getTwoTails+getHeadTails;
        if(sum==getNumTrials) {  //check if sum of twoheads, twotails and headtails is equal to numtrails
            return true;
        }
        else{
           return false;
        }
    }
}