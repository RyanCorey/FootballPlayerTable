package Model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FootballPlayer extends Person implements TableMember
{

    private int number;
    private PlayerPosition position;

    public FootballPlayer(int nu, String na, String po, int hf, int hi, int wt, String ht, String hs)
    {
        super(na, hf, hi, wt, ht, hs);
        number = nu;
        position = new PlayerPosition(po);
    }

    public FootballPlayer()
    {
        this(0,"","",0,0,0,"","");
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public PlayerPosition getPosition()
    {
        return position;
    }

    public void setPosition(PlayerPosition position)
    {
        this.position = position;
    }

    @Override
    public String toString()
    {
        return number + " " + name + " " + position + " " + height; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAttribute(int n)
    {
        return getAttributes().get(n);
    }

    @Override
    public ArrayList<String> getAttributes()
    {
        ArrayList<String> attrs = new ArrayList<>();
        attrs.add(""+number);
        attrs.add(position.toString());
        attrs.add(name);
        attrs.add(height.toString());
        attrs.add(""+weight);
        attrs.add(hometown);
        attrs.add(highSchool);
        
        return attrs;

    }

    @Override
    public String getAttributeName(int n)
    {
        return getAttributeNames().get(n);
    }

    @Override
    public ArrayList<String> getAttributeNames()
    {
        ArrayList<String> attrs = new ArrayList<>();
        attrs.add("number");
        attrs.add("position");      
        attrs.add("name");
        attrs.add("height");
        attrs.add("weight");
        attrs.add("hometown");
        attrs.add("highSchool");
        
        return attrs;
    }
}
