package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData
{

    private ArrayList<FootballPlayer> players;

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();
    }

    @Override
    public void loadTable()
    {
        ReadPlayersFromXML();
    }

    @Override
    public ArrayList<FootballPlayer> getTable()
    {
        return this.players;
    }

    @Override
    public ArrayList<String> getHeaders()
    {
        return new FootballPlayer().getAttributeNames();
    }

    @Override
    public ArrayList<String> getLine(int line)
    {
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine)
    {
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
        for(int i = firstLine; i<=lastLine; i++)
        {
            lines.add(getLine(i));
        }
        return lines;
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

}
