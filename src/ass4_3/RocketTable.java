package ass4_3;

public class RocketTable extends AbstractTableModel{

    protected Rocket[] rockets;
    protected String[] columnNames = new String[]{"Names", "Price", "Apogee"};

    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }

    public int getCoulumnCount(){
        return columnNames.length;

    }

    public String getColumnName(int i){

        return columnNames[i];
    }

    public int getRowCount(){

        return rockets.length;
    }


}


