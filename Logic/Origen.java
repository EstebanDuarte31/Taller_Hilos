package Logic;

import java.util.ArrayList;

public class Origen {

    private String source;



    private ArrayList<Logic.Destination> targets;

    public Origen(String source) {
        this.source = source;

        this.targets = new ArrayList();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    public ArrayList<Logic.Destination> getTargets() {
        return targets;
    }

    public void setTargets(ArrayList<Logic.Destination> targets) {
        this.targets = targets;
    }

    @Override
    public String toString() {
        return "{" + "origen=" + source + ", destinos=" + targets + '}';
    }


}
