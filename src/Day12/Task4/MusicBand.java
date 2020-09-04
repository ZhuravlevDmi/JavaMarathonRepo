package Day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> artist;


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artist=" + artist +
                '}';
    }

    public MusicBand(String name, int year, List<String> artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }


    public List<String> getArtist() {
        return artist;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
