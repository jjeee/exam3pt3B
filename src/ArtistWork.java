public class ArtistWork extends Art implements Comparable<ArtistWork>{
    String artistName;

    public ArtistWork(int artistID, String artistName, int artID, String artTitle, int value) {
        super(artID, artTitle,  artistID, value);
        this.artistName=artistName;
    }

    public int compareTo(ArtistWork o) {
        if (getArtistID()>o.getArtistID())
            return 1;
        else if (getArtistID()<o.getArtistID())
            return -1;
        else if (getArtistID()==o.getArtistID()){
            if (getArtiD()>o.getArtiD())
                return 1;
            else if (getArtiD()<o.getArtiD())
                return -1;
            else return 0;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "ArtistID = "+getArtistID()+"\t, ArtistName = "+artistName+"\t, ArtID = "+getArtiD()+
                "\t, ArtTitle = "+getArtTitle()+"\t, Appraised Value = "+getValue();
    }
}
