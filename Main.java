import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config1 = new ExportConfig("1.txt");
        ExportConfig config2 = new ExportConfig("2.txt");

        List<Persoana> list = new ArrayList<Persoana>();
        list.add(new Persoana("Slavu", "Tudor"));
        list.add(new Persoana("Popescu", "Ion"));

        Exporter exp1 = new Exporter(config1, list);
        Exporter exp2 = new Exporter(config2, list);

        exp1.export();
        exp2.export();
    }
}