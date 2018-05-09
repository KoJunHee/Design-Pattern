package compositePattern_practice_file;

public class File extends AbstractFile{

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void print() {

        for(int i=0; i<getDepth(); i++){
            System.out.print("\t");
        }

        System.out.println("[File] " + getName()+ " Size : "+ this.size+ ", depth: " + getDepth());
    }
}





