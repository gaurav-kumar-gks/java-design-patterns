package structural.decorator.decorators;

import structural.decorator.datasource.DataSource;

public abstract class DataSourceDecorator implements DataSource {

    private DataSource datasource;

    public DataSourceDecorator(DataSource dataSource) {
        this.datasource = dataSource;
    }

    @Override
    public String readData() {
        return datasource.readData();
    }

    @Override
    public void writeData(String data) {
        datasource.writeData(data);
    }
}
