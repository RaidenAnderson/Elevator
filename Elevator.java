
public class Elevator
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;
  
    public Elevator()
    {
       current_floor = 0;
       top_floor = 0;
    }
    
    public void ascend() 
    {
        if (current_floor < top_floor)
        {
            current_floor = current_floor + 1;
        }
        else
        {
            System.out.println("Sorry you are on the top floor");
        }
    }
    
    public void descend()
    {
        if (
    }
}
