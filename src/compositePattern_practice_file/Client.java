package compositePattern_practice_file;

public class Client {
    public static void main(String[] args) {
        Directory directory01 = new Directory("root");
        Directory directory02 = new Directory("Dir1");

        File file01 = new File("file01", 100);
        File file02 = new File("file02", 200);
        File file03 = new File("file03", 300);
        File file04 = new File("file04", 400);

        directory01.addEntry(file01);
        directory01.addEntry(directory02);
        directory02.addEntry(file02);
        directory02.addEntry(file03);
        directory01.addEntry(file04);

        directory01.print();
    }
}



