//package addMachine;

public class AddingMachine
{
  private int total; //running total
  private String s = "0"; //running memory

  public AddingMachine ()
  {
    total = 0;  // not needed - included for clarity
  }

  public int getTotal ()
  {
    return total; //returns current total
  }

  public void add (int value)
  {
    total += value; //adds value from total
    s = s + " + " + value; //adds addition and value to running memory
  }

  public void subtract (int value)
  {
    total -= value; //subtracts value from total
    s = s + " - " + value; //adds subtraction and value to running memory
  }

  public String toString ()
  {
    return s;//returns memory
  }

  public void clear()
  {
    total = 0; //resets running total
    s = "0"; //resets memory
  }

  public static void main(String [] args)
  {
	  AddingMachine calculator = new AddingMachine(); //inititiates an object callced calculator
  	calculator.add(3); //test addition
  	System.out.print(calculator.getTotal()); //test running memory
  }
}
//works from desktop
//works from laptop
