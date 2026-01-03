package structural.decorator.datasource;

public interface DataSource {
    String readData();

    void writeData(String data);
}
