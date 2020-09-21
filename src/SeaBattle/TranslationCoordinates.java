package SeaBattle;

public interface TranslationCoordinates {
    default int coordinatesY(String s){
        int y = 0;
        try {
            String[] arrCoordinates = s.split(" ");
            y = Integer.parseInt(arrCoordinates[1]);
        } catch (Exception e) {
            return y;
        }
        return y;
    }
    default int coordinatesX(String s) {
        int x;
        try {
            String[] arrCoordinates = s.split(" ");
            if (arrCoordinates[0].equals("а"))
                x = 1;
            else if(arrCoordinates[0].equals("б"))
                x = 2;
            else if(arrCoordinates[0].equals("в"))
                x = 3;
            else if(arrCoordinates[0].equals("г"))
                x = 4;
            else if(arrCoordinates[0].equals("д"))
                x = 5;
            else if(arrCoordinates[0].equals("е"))
                x = 6;
            else if(arrCoordinates[0].equals("ж"))
                x = 7;
            else if(arrCoordinates[0].equals("з"))
                x = 8;
            else if(arrCoordinates[0].equals("и"))
                x = 9;
            else if(arrCoordinates[0].equals("к"))
                x = 10;
            else
                x = 500;
            return x;
        } catch (Exception e) {
            return 500;
        }
    }
}
