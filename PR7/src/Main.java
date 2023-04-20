public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        System.out.println("\n");
        for (int i = 0; i <= 65536; i++) {
            char t = (char) i;
            if( t >= 'А' && t <= 'я' ) {
                System.out.println(i + " - " + t);
            } else if ( t == 'Ё'|| t == 'ё'){
                System.out.println( i + " - " + t);
            }
        }

    }
}
