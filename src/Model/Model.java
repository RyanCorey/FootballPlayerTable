package Model;

import java.util.ArrayList;

public class Model {

    FootballPlayerData fpData;
    FootballPlayerModel fpModel;

    public Model() {
        fpData = new FootballPlayerData();
        fpModel = new FootballPlayerModel(fpData);

        System.out.println("=============================================================");
        System.out.println("Hello World");
        System.out.println(fpData.getHeaders().toString());
        System.out.println(fpData.getHeaders().toString()); //yes, we are running this twice for testing purposes
        System.out.println("=============================================================");
        System.out.println(fpData.getLine(4).toString());
        System.out.println(fpData.getLine(4).toString()); //yes, we are running this twice for testing purposes
        System.out.println("=============================================================");
        System.out.println(fpData.getLine(50).toString());
        System.out.println(fpData.getLine(123).toString());
        System.out.println("=============================================================");
        ArrayList<ArrayList<String>> lines = fpData.getLines(0, 4);
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(i + " - " + lines.get(i).toString());
        }
        System.out.println("=============================================================");

    }

    public FootballPlayerModel getPlayerModel() {
        return this.fpModel;
    }
}
