package Day8;

public class Task1 {
    public static void main(String[] args) {
        String text = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            text = text + i + " ";
        }
        long finish = System.currentTimeMillis();
       long result = finish - start;
        System.out.println(text);


        StringBuilder st = new StringBuilder("");
        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            st.append(i).append(" ");
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(st.toString());
        long result1 = finish1 - start1;
        System.out.println("Результат с String: " + result);
        System.out.println("Результат с StringBuilder: " + result1);
    }
}
