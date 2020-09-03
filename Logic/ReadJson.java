package Logic;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class ReadJson  extends Thread{
//    private Thread t;
    private String routJSON;

     boolean state=true;

    Origen[] OriginsArray;

    ArrayList<Node<Origen>> arrayListOrigen;
    ArrayList<ArrayList<Node<Destination>>> arrayListDestination;

    public ReadJson(String routJSON) {
        this.routJSON = routJSON;
        arrayListOrigen = new ArrayList<Node<Origen>>();
        arrayListDestination = new ArrayList<ArrayList<Node<Destination>>>();

    }

    @Override
    public void run() {
            // Creo una instancia de GSON
            Gson gson = new Gson();

            // Leo el fichero
            String fichero = "";

            try (BufferedReader br = new BufferedReader(new FileReader(routJSON))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    fichero += linea;
                }

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }


            OriginsArray = gson.fromJson(fichero, Origen[].class);
            createNodes();
    }



    public void createNodes() {

        for(Origen user : OriginsArray) {
            Node<Origen> origenNode = new Node<Origen>(new Origen(user.getSource()), user.getSource());
            arrayListOrigen.add(origenNode);



            ArrayList<Node<Destination>> arrayListDestination = new ArrayList<Node<Destination>>();
            for (int i = 0; i < user.getTargets().size(); i++) {
                Node<Destination> destinoNode = new Node<Destination>(new Destination(user.getTargets().get(i).getTarget(), user.getTargets().get(i).getDistance(), user.getTargets().get(i).getValue()), user.getTargets().get(i).getTarget().toString());
                arrayListDestination.add(destinoNode);
//            graph.addEdge(new Distance(or.getTargets().get(i).getDistance(), origenNode.getId()+arrayListDestination.get(i).getId()), origenNode, arrayListDestination.get(i), EdgeType.DIRECTED);
            }
            this.arrayListDestination.add(arrayListDestination);
        }

        System.out.println(arrayListOrigen);



    }

    public ArrayList<Node<Origen>> getArrayListOrigen() {
        return arrayListOrigen;
    }

    public ArrayList<ArrayList<Node<Destination>>> getArrayListDestination() {
        return arrayListDestination;
    }
}
