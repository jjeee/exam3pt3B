//Jae Jee
//CIS211 401
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyArtistNodes {
    static public ArrayList<ArtistNode> myArtistNodes=new ArrayList<>();
    static Scanner input;

    public MyArtistNodes(String inputFile) throws IOException{
        input=new Scanner(new File(inputFile));
        input.useDelimiter("\t|\r\n");
        while (input.hasNext()){
            int id=input.nextInt();
            String name=input.nextLine();

            myArtistNodes.add(new ArtistNode(id,name));
        }
        Collections.sort(myArtistNodes);
    }

    public void print(String heading,String outputID) throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter(new File(outputID));
        output.println(heading+"\n\n");

        for(ArtistNode a:myArtistNodes)
            output.println(a);

        output.close();
    }

    public void print(){
        myArtistNodes.forEach(System.out::println);
    }

    public int indexOfArtistID(int artistID){
        int index=-1;

        for (Artist a:myArtistNodes){
            if (artistID==a.getArtistID()){
                index=myArtistNodes.indexOf(a);
                System.out.println(index);
                break;
            }
        }if (index==-1){
            System.out.println("Artist not found");
        }

        return index;
    }
}
