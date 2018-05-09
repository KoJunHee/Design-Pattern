package compositePattern_practice_file;

public abstract class AbstractFile {
    private String name;
    private int depth = 0;

    public AbstractFile(String name) {
        this.name = name;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
    public String getName(){
        return this.name;
    }
    public int getDepth(){
        return this.depth;
    }

    public abstract int getSize();
    public abstract void print();
}



