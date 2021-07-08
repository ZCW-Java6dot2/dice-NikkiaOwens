import java.util.ArrayList;
import java.util.HashMap;

public class Bins {

    Integer first;
    Integer last;
    HashMap<Integer, Integer> tracker;
    Integer numberOfTosses;
    // Simulation sim=new Simulation(2,10000);

    public Bins(int first, int last, Integer numberOfTosses) {
        this.first = first;
        this.last = last;
        this.tracker = new HashMap<Integer, Integer>();
        for (Integer i = first; i <= last; i++) {

            this.tracker.put(i, 0);
        }
        this.numberOfTosses = numberOfTosses;
    }

    public void incrementBin(Integer bin) {

        Integer a = tracker.get(bin) + 1;

        tracker.put(bin, a);


    }

    public Integer getBin(Integer bin) {

        return tracker.get(bin);

    }

    public String toString() {
        //String stars = "*";


        String str = "";
        for (Integer i : tracker.keySet()) {
            //  System.out.println(i);
            //double why = numberOfTosses;

            double percentage = (getBin(i) * 100) / numberOfTosses;

            int maxLengthOfStars = 89;
            int lengthOfStars = (int) Math.ceil(maxLengthOfStars * (percentage / 100));
            String stars = "";

            for (int j = 0; j < lengthOfStars; j++) {
                stars = stars + "*";
            }
                    str = str + i + ": " + getBin(i) + ": " + percentage + i + stars + "\n";

        }
        return str;
    }
}
