package cse360assignment02;

public class AddingMachine {
  private int total;

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
  }

  public void subtract (int value)
  {
    total -= value;
  }

  public String toString ()
  {
    return "";
  }

  public void clear()
  {
    total = 0;
  }
}
