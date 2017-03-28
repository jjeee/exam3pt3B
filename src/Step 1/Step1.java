import java.io.IOException;

public class Step1 {

    public Step1() throws IOException{
        MyArtistList myArtists = new MyArtistList("p7artists.txt");
        myArtists.print("Jae Jee","exam3out1.txt");
    }
}
