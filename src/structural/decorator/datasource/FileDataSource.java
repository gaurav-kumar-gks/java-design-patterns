package structural.decorator.datasource;

public class FileDataSource implements DataSource {

    private String filePath;
    private String data;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String readData() {
        System.out.printf("Read: [%s]\n", data);
        return data;
    }

    @Override
    public void writeData(String data) {
        System.out.printf("Wrote: [%s]\n", data);
        this.data = data;
    }
}
