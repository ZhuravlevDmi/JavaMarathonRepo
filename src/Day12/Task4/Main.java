package Day12.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicBand> musicBandArr = new ArrayList<>();
        musicBandArr.add(new MusicBand("The Beatles",1960, new ArrayList<>(Arrays.asList("Пол Макартни", "Джон Леннон","Джордж Харрисон","Ринго Стар"))));
        musicBandArr.add(new MusicBand("Metallica",1981, new ArrayList<>(Arrays.asList("Джеймс Хэтфилд", "Кирк Хэммет", "Роберт Трухильо", "Ларс Ульрих"))));
        musicBandArr.add(new MusicBand("Queen",1970,new ArrayList<>( Arrays.asList("Фредди Меркьюри", "Роджер Тейлор","Брайан Мэй","Джон Дикон"))));
        musicBandArr.add(new MusicBand("Scorpions",1965,new ArrayList<>( Arrays.asList("Клаус Майне", "Рудольф Шенкер", "Маттиас Ябс", "Павел Мончивода", "Микки Ди"))));
        musicBandArr.add(new MusicBand("The Black Eyed Peas",1995,new ArrayList<>( Arrays.asList("Taboo", "Ферги", "Ким Хилл"))));
        musicBandArr.add(new MusicBand("AC/DC",1973,new ArrayList<>(Arrays.asList("Ангус Янг", "Малькольм Янг", "Стиви Янг", "Брайан Джонсон",
                "Бон Скотт", "Эксл Роуз", "Клифф Уильямс", "Крис Слейд", "Фил Радд", "Дэйв Эванс"))));
        musicBandArr.add(new MusicBand("Ленинград",1997,new ArrayList<>( Arrays.asList("Сергей Шнуров", "Юлия Коган", "Игорь Вдовин"))));
        musicBandArr.add(new MusicBand("Little Big",2013,new ArrayList<>( Arrays.asList("Илья Прусикин", "Сергей Макаров", "Антон Лиссов", "Софья Таюрская"))));
        musicBandArr.add(new MusicBand("SEREBRO",2006,new ArrayList<>( Arrays.asList("Елена Темникова", "Оля Серябкина", "Катя Кищук", "Марина Лизоркина",
                "Полина Фаворская", "Анастасия Карпова", "Дарья Шашина"))));


        printList(musicBandArr);

        merger(musicBandArr.get(0).getArtist(), musicBandArr.get(1).getArtist());

        printList(musicBandArr);


    }
    public static void printList(List<MusicBand> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public static void merger(List<String> artistLeaves, List <String> comesArtist){
        for (int i = 0; i < artistLeaves.size(); i++) {
            comesArtist.add(artistLeaves.get(i));
        }
        artistLeaves.clear();
    }
}

