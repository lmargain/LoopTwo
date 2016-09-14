
/**
 *Luis Oliver Juarez
 *Loop Two
 */
import java.util.Arrays;
import java.util.Random;
public class LoopTwo
{

    int[] array = new int[100];

    public LoopTwo()
    {

    }

    public void loadRandom()
    {
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
        }

    } 

    public void printArray(){
        int t = 0;
        for(int i = 0; i < array.length; i++){
            if(t < 10){
                t++;
                System.out.print("" + array[i] + "\t");
            }
            else{
                t = 0;
                System.out.println("" + array[i] + "\t");
            }
        }
    }

    public void sortArray(){
        Arrays.sort(array);
    }

    public int findAverage(){
        int v = 0;
        for(int i = 0; i < array.length; i++){
            v = v + array[i];
        }
        return v;
    }
}
