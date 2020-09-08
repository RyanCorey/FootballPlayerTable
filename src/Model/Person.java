package Model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person 
{

    protected String name;
    protected Height height;
    protected int weight;
    protected String hometown;
    protected String highSchool;

    public Person(String na, int hf, int hi, int wt, String ht, String hs)
    {
        name = na;
        height = new Height(hf, hi);
        weight = wt;
        hometown = ht;
        highSchool = hs;
    }

    public Person()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Height getHeight()
    {
        return height;
    }

    public void setHeight(Height height)
    {
        this.height = height;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getHometown()
    {
        return hometown;
    }

    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }

    public String getHighSchool()
    {
        return highSchool;
    }

    public void setHighSchool(String highSchool)
    {
        this.highSchool = highSchool;
    }

    @Override
    public String toString()
    {
        return name + " " + height; 
    }

}
