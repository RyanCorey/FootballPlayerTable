package Model;

public class Height
{

    private int feet;
    private int inches;

    public Height(int f, int i)
    {
        feet = f;
        inches = i;
    }

    public Height()
    {
    }

    /**
     * @return the feet
     */
    public int getFeet()
    {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet)
    {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches()
    {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches)
    {
        this.inches = inches;
    }

    @Override
    public String toString()
    {
        return getFeet() + "'" + getInches() + '"';
    }

}
