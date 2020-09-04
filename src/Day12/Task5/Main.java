package Day12.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Artist> theBeatles = new ArrayList<>(Arrays.asList(new Artist("Пол Макартни",32),
                new Artist("Джон Леннон",29),
                new Artist("Джордж Харрисон", 43),
                new Artist("Ринго Стар", 36)));
        List<Artist> metallica = new ArrayList<>(Arrays.asList(new Artist("Джеймс Хэтфилд",32),
                new Artist("Роберт Трухильо",29),
                new Artist("Джордж Харрисон", 43),
                new Artist("Ларс Ульрих", 36)));
        List<Artist> queen = new ArrayList<>(Arrays.asList(new Artist("Фредди Меркьюри",32),
                new Artist("Роджер Тейлор",29),
                new Artist("Брайан Мэй", 43),
                new Artist("Джон Дикон", 36)));
        List<Artist> scorpions = new ArrayList<>(Arrays.asList(new Artist("Клаус Майне",32),
                new Artist("Рудольф Шенкер",29),
                new Artist("Маттиас Ябс", 43),
                new Artist("Павел Мончивода", 36),
                new Artist("Микки Ди", 24)));
        List<Artist> theBlackEyedPeas = new ArrayList<>(Arrays.asList(new Artist("Taboo",32),
                new Artist("Ферги",29),
                new Artist("Ким Хилл", 43)));
        List<Artist> acdc = new ArrayList<>(Arrays.asList(new Artist("Ангус Янг",32),
                new Artist("Малькольм Янг",29),
                new Artist("Стиви Янг", 43),
                new Artist("Брайан Джонсон", 36),
                new Artist("Бон Скотт", 24)));
        List<Artist> leningrad = new ArrayList<>(Arrays.asList(new Artist("Сергей Шнуров",32),
                new Artist("Юлия Коган",29),
                new Artist("Игорь Вдовин", 43)));
        List<Artist> littleBig = new ArrayList<>(Arrays.asList(new Artist("Илья Прусикин",32),
                new Artist("Сергей Макаров",29),
                new Artist("Антон Лиссов", 43),
                new Artist("Софья Таюрская", 36)));
        List<Artist> serebro = new ArrayList<>(Arrays.asList(new Artist("Елена Темникова",32),
                new Artist("Оля Серябкина",29),
                new Artist("Катя Кищук", 43),
                new Artist("Марина Лизоркина", 36),
                new Artist("Полина Фаворская", 24)));


        List<MusicBand> musicBandArr = new ArrayList<>();
        musicBandArr.add(new MusicBand("The Beatles",1960, theBeatles));
        musicBandArr.add(new MusicBand("Metallica",1981, metallica));
        musicBandArr.add(new MusicBand("Queen",1970,queen));
        musicBandArr.add(new MusicBand("Scorpions",1965,scorpions));
        musicBandArr.add(new MusicBand("The Black Eyed Peas",1995,theBlackEyedPeas));
        musicBandArr.add(new MusicBand("AC/DC",1973,acdc));
        musicBandArr.add(new MusicBand("Ленинград",1997, leningrad));
        musicBandArr.add(new MusicBand("Little Big",2013,littleBig));
        musicBandArr.add(new MusicBand("SEREBRO",2006,serebro));

        printArr(musicBandArr);

        merger(musicBandArr.get(0), musicBandArr.get(2));

        printArr(musicBandArr);

    }
    public static void merger(MusicBand artistLeaves, MusicBand comesArtist){
        for (int i = 0; i < artistLeaves.getArtist().size(); i++) {
            comesArtist.getArtist().add(artistLeaves.getArtist().get(i));
        }
        artistLeaves.getArtist().clear();
    }

    public static void printArr(List<MusicBand> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
