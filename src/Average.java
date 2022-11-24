import java.util.*;

public class Average {
    private ArrayList<Integer> data = new ArrayList<>();
    private double mean;
    public Average(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter mark " +(i+1));
            data.add(input.nextInt());
        }

        selectionSort();
        calculateMean();
    }

    public void selectionSort() {
        Collections.sort(data,Collections.reverseOrder());

    }

    public void calculateMean() {
        int sum = 0;
        for (int i:data){
            sum = sum + i;
        }
        mean = (double)sum/data.size();
    }
    public String toString(){
        String result ="";
        for (int i :data) {
            result+=i+" ";
        }
        return result + "\nMean is "+mean;
    }
}
