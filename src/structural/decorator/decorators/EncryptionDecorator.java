package structural.decorator.decorators;

import structural.decorator.datasource.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    private final String PREFIX = "EncryptionPrefix:";

    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String decode(String data) {
        return data.substring(PREFIX.length());
    }

    private String encode(String data) {
        return PREFIX + data;
    }
}
