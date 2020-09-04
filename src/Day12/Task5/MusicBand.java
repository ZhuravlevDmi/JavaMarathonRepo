package Day12.Task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<Artist> artist;


    @Override
    public String toString() {
        return name + ", " + year + ", " + artist;
    }

    public MusicBand(String name, int year, List<Artist> artist) {
        this.name = name;
        this.year = year;
        this.artist = artist;
    }

    public List<Artist> getArtist() {
        return artist;
    }

    public void setArtist(List<Artist> artist) {
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
