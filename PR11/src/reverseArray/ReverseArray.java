package reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        int a = strings.length;
        int b = a-- / 2;
        for (int i = 0; i < b; i++) {
               String tmp = strings[i];
               strings[i] = strings[a - i];
               strings[a - i] = tmp;
        }
           return strings;
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    }

}
