//Jae Jee
//CIS211 401
public class ArtNode extends Art{
    static ArtNode previous,next;

    public ArtNode(int artID, String artTitle, int artistID, int value, ArtNode previous, ArtNode next) {
        super(artID, artTitle, artistID, value);
        this.previous=previous;
        this.next=next;
    }

    public static ArtNode getPrevious() {
        return previous;
    }

    public static void setPrevious(ArtNode previous) {
        ArtNode.previous = previous;
    }

    public static ArtNode getNext() {
        return next;
    }

    public static void setNext(ArtNode next) {
        ArtNode.next = next;
    }

    @Override
    public String toString() {
        return String.format("%5d %-15s, %5d, %10.2f",getArtiD(),getArtTitle(),getArtistID(),getValue());
    }
}
