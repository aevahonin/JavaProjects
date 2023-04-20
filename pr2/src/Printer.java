public class Printer {

    public static void main(String[] args) {

        Printer newDoc = new Printer();
        System.out.println("Список документов для печати: " + print());
        System.out.println("\n" + "Количество страниц для печати: " + getPendingPagesCount());
        System.out.println("\n" + "Общее количество распечатанных страниц за всё время: " + getAllTimePrintedCount());
    }

    static String queue = "";
    static String allQueue = "";
    private static int count = 0;
    private static int printedCount = 0;
    private static int pendingPagesCount = 0;
    private static int allTimePrintedCount = 0;

    public Printer() {
        append("1234", "doc1", 12);
        isPrinted();
        append("1234", "doc2");
        append("1234", "doc3", 25);
        append("34576");
        append("34", "doc7", 280);
    }

    public void append (String textDoc){
    }
    public void append (String textDoc, String nameDoc){
        queue = queue + "\n " + nameDoc;
        allQueue = queue;
    }
    public void append (String textDoc, String nameDoc, int countDoc) {
        queue = queue + "\n " + nameDoc;
        allQueue = queue;
        count = count + countDoc;
        pendingPagesCount = count;
        allTimePrintedCount = allTimePrintedCount + printedCount;
    }

    public static void clear() {
        queue = "";
    }

    public static String print() {
        clear();
        return allQueue;
    }

    public static int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public static int getAllTimePrintedCount() {
        return allTimePrintedCount;
    }

    public int isPrinted () {
        printedCount = count;
        count = 0;
        clear();
        return count;
    }
}
