
    public class Simulation {
        Integer numberOfDies;
        Integer numberOfTosses;
        Integer binLow;
        Integer binHigh;
        Bins bin;
        public Simulation(Integer numberOfDies, Integer numberOfTosses) {
            this.numberOfDies = numberOfDies;
            this.numberOfTosses = numberOfTosses;
            this.binLow = numberOfDies;
            this.binHigh = numberOfDies * 6;
            this.bin = new Bins(binLow, binHigh, numberOfTosses);
        }
        public static void main(String[] args) {
            Console console = new Console();
            int numberOfDies= 0;
            int numberOfTosses = 0;
            numberOfDies = console.getIntegerInput("\u001B[34m Please enter Number of Dice:\u001B[34m").intValue();
            numberOfTosses = console.getIntegerInput("\u001B[34m Please enter Number of Tosses:\u001B[34m\u001B[0m").intValue();
            Simulation simulateToss = new Simulation(numberOfDies, numberOfTosses);
            simulateToss.runSimulation();
        }
        public void runSimulation() {
            System.out.println("***" + "\n" + "Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times" + "\n" + "***");
            Dice rollTheDice = new Dice(this.numberOfDies,this.numberOfTosses);

            //   Integer outputOfToss = rollTheDice.tossAndSum();
            // System.out.println(outputOfToss);
            //  outputOfToss = rollTheDice.tossAndSum();
            //sum+=Math.random()*(max-min+1)+min;
            for (Integer i = 0; i < this.numberOfTosses; i++) {
                bin.incrementBin(rollTheDice.tossAndSum());

            }
            System.out.println(bin.toString());
        }
    }
