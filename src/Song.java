import java.util.ArrayList;
public class Song {
    private String title;
    private String artist;
    private ArrayList<String> names= new ArrayList<>();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> names){
        int people = 0;
        for (String s : names){
            if (!this.names.contains(s.toLowerCase())){
                this.names.add(s.toLowerCase());
                people++;
            }
        }
        return people;
    }

}
