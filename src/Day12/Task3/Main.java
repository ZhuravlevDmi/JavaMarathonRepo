package Day12.Task3;


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<MusicBand> musicBandArr = new ArrayList<>();
        musicBandArr.add(new MusicBand("The Beatles",1960));
        musicBandArr.add(new MusicBand("Metallica",1981));
        musicBandArr.add(new MusicBand("Queen",1970));
        musicBandArr.add(new MusicBand("Scorpions",1965));
        musicBandArr.add(new MusicBand("The Black Eyed Peas",1995));
        musicBandArr.add(new MusicBand("AC/DC",1973));
        musicBandArr.add(new MusicBand("Ленинград",1997));
        musicBandArr.add(new MusicBand("Little Big",2013));
        musicBandArr.add(new MusicBand("SEREBRO",2006));


        Collections.shuffle(musicBandArr);
        printList(musicBandArr);
        List<MusicBand> sortedMusicBand = new ArrayList<>();

        for (int i = 0; i < musicBandArr.size(); i++) {
            if(musicBandArr.get(i).getYear() > 2000)
                sortedMusicBand.add(musicBandArr.get(i));
        }
        printList(sortedMusicBand);
    }
    public static void printList(List<MusicBand> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}

