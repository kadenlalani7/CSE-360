package addMachine;

public class AddingMachine
{
  private int total;
  private String s = "0";

  public AddingMachine ()
  {
    total = 0;  // not needed - included for clarity
  }

  public int getTotal ()
  {
    return total;
  }

  public void add (int value)
  {
    total += value;
    s = s + " + " + value;
  }

  public void subtract (int value)
  {
    total -= value;
    s = s + " - " + value;
  }

  public String toString ()
  {
    return s;
  }

  public void clear()
  {
    total = 0;
  }

  public static void main(String [] args)
  {
	  AddingMachine machine = new AddingMachine();
  	  machine.add(3);
  	  machine.subtract(1);
  	  machine.add(12);
  	  machine.subtract(8);
  	  System.out.println(machine.toString());
  	  System.out.print(machine.getTotal());

  }
}
//works on desktop
