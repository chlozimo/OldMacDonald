class Chick implements Animal
{     
  private String myType;
  private String mySound;
  public Chick(String type)
  {
    myType = type;
    mySound = getSound();
  }
  public Chick()
  {
  }

  public String getSound()
  {
    if (Math.random() < 0.5)
    {
      return "Cheep";
    } else 
    return "Cluck";
  }
  public String getType()
  {
    return myType;
  }
}
