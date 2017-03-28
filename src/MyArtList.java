import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyArtList {
    ArrayList<ArtistWork> list=new ArrayList<>();
    ArrayList<Artist> artistList=new ArrayList<>();

    public MyArtList(String fileName) throws IOException{
        Scanner input=new Scanner(new File(fileName));
        Scanner artists=new Scanner(new File("p7artists.txt"));

        artists.useDelimiter("\t");
        while (artists.hasNext()){
            int ID=artists.nextInt();
            String name=artists.nextLine();

            artistList.add(new Artist(ID,name));
        }

       input.useDelimiter("\t|\r\n");
        while (input.hasNext()){
            int artID=input.nextInt();
            String artTitle=input.next();
            int artistID=input.nextInt();
            int value=input.nextInt();
            String artistName= findName(artistID);

            list.add(new ArtistWork(artistID,artistName,artID,artTitle,value));
        }

        Collections.sort(list);

    }

    public String findName(int artistID){
        String artistName="";
        for (Artist a:artistList){
            if (artistID==a.getArtistID()){
                artistName=a.getArtistName();
                break;
            }
        }return artistName;
    }

    public void print(String heading,String outputID) throws IOException{
        java.io.PrintWriter output=new java.io.PrintWriter(new File(outputID));
        output.println(heading+"\n");

        for(ArtistWork a:list)
            output.println(a);

        output.close();
    }

    public void print(){
        list.forEach(System.out::println);
    }
}
