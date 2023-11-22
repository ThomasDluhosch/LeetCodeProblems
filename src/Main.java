import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
            } else{
                map.put(nums[i], 1);
            }
        }


        //    System.out.print("Key: " + key + " - ");
          //  System.out.print("Value: " + map.get(key) + "\n");
        }





    }
}