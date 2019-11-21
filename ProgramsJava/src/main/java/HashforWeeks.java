import java.util.HashMap;
import java.util.Map;

public class HashforWeeks {



    public static void main(String[] args) {

        String week = "Wed";
        int numberOfDaysAfter = 23;

        Map<String, Integer> hm = new HashMap();
        Map<Integer, String> hm1 = new HashMap();

        hm.put("Mon",1);
        hm.put("Tue",2);
        hm.put("Wed",3);
        hm.put("Thu",4);
        hm.put("Fri",5);
        hm.put("Sat",6);
        hm.put("Sun",7);

        hm1.put(1,"Mon");
        hm1.put(2,"Tue");
        hm1.put(3,"Wed");
        hm1.put(4,"Thu");
        hm1.put(5,"Fri");
        hm1.put(6,"Sat");
        hm1.put(7,"Sun");

        //find the number of the given week

        int noOfGivenWeek = hm.get(week);

        int findTheWeek = (numberOfDaysAfter + noOfGivenWeek)%7;

        System.out.println(hm1.get(findTheWeek));


    }

}
