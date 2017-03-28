import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyArtistList {
    ArrayList<Artist> list = new ArrayList<>();

    public MyArtistList(String fileName) throws IOException{
        Scanner input=new Scanner(new File(fileName));

        input.useDelimiter("\t");
        while (input.hasNext()){
            int ID=input.nextInt();
            String artistName=input.nextLine();

            list.add(new Artist(ID,artistName));
        }
    }

    public void print(String heading,String outputID) throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter(new File(outputID));
        output.println(heading+"\n");

        for(Artist a:list)
            output.println(a);

        output.close();
    }

    public void print(){
        for(Artist a:list)
            System.out.println(a);
    }

}
