package structural.decorator.decorators;

import structural.decorator.datasource.DataSource;

public class CompressionDecorator extends DataSourceDecorator {

    private final String PREFIX = "CompressionPrefix:";

    public CompressionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    private String compress(String data) {
        return PREFIX + data;
    }

    private String decompress(String data) {
        return data.substring(PREFIX.length());
    }
}
