import java.io.IOException;

public class Step2 {

    public Step2() throws IOException {
        MyArtList myArts=new MyArtList("p7arts.txt");
        myArts.print("Jae Jee","exam3out2.txt");
        myArts.print();
    }
}
