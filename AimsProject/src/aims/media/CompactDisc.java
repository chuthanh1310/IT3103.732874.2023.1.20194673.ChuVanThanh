package aims.media;
import java.util.List;
import java.util.ArrayList;
public class CompactDisc extends Disc{
    private String artist;
    private List<Track> tracks = new ArrayList<>();
    public String getArtist() {
        return artist;
    }
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track added to the CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track  removed from the CD.");
        } else {
            System.out.println("Track  is not in the CD.");
        }
    }
    public int getLength(){
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
