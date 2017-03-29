//Jae Jee
//CIS211 401
public class ArtistNode extends Artist implements Comparable<ArtistNode>{
    static ArtNode firstNode=ArtNode.next,lastNode=ArtNode.previous;
    static int totalEntries;
    static double totalValue;

    public ArtistNode(int artistID, String artistName) {
        super(artistID, artistName);
        totalEntries=0;
        totalValue=0;
    }

    public static int getTotalEntries() {
        return totalEntries;
    }

    public static void setTotalEntries(int totalEntries) {
        ArtistNode.totalEntries = totalEntries;
    }

    public static double getTotalValue() {
        return totalValue;
    }

    public static void setTotalValue(double totalValue) {
        ArtistNode.totalValue = totalValue;
    }

    @Override
    public String toString() {
        return String.format("%5d %-15s, %5d , %10.2f",getArtistID(),getArtistName(),totalEntries,totalValue);
    }

    @Override
    public int compareTo(ArtistNode o) {
        if (getArtistID()>o.getArtistID())
            return -1;
        else if (getArtistID()<o.getArtistID())
            return 1;
        else
            return 0;
    }

    public void printList(){

    }

    public void append(){

    }
}
