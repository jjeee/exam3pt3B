public class ArtNode extends Art{
    static ArtNode previous,next;

    public ArtNode(int artID, String artTitle, int artistID, int value) {
        super(artID, artTitle, artistID, value);
        previous=null;
        next=null;
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
