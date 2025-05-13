import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Exporter {
    final ExportConfig config;
    List<Persoana> list;

    public Exporter(ExportConfig config, List<Persoana> list){
        this.config = config;
        this.list = list;
    }

    public Exporter(ExportConfig c){
        this.config = c;
    }

    public void export(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(config.getFilename()));
            for(Persoana persoana : list){
                writer.write(persoana.toString());
                writer.newLine();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
