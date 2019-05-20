import java.util.ArrayList;

public class StepTracker {
    private int steps;
    private ArrayList<Integer> a;

    public StepTracker(int steps){
        this.steps = steps;

    }
    public void  addDailySteps(int stepeprs){
        a.add(stepeprs);
    }
    public double averageSteps(){
        int sum = 0;
        for(int i =0 ; i < a.size();i++){
            sum += a.get(i);
        }
        return(sum/a.size());
    }
    public int activeDays(){
        int count = 0;
        for(int i = 0;i< a.size()-1;i++){
            if(a.get(i) >= steps){
                count++;
            }
        }
        return count;
    }
}
