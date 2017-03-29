import java.io.IOException;

public class Step3A {
    public Step3A() throws IOException{
        MyArtistNodes myArtists=new MyArtistNodes("p7artists.txt");
        myArtists.print("Jae Jee","exam3out3A.txt");
    }
}
