package structural.decorator.client;

import structural.decorator.datasource.DataSource;
import structural.decorator.datasource.FileDataSource;
import structural.decorator.decorators.EncryptionDecorator;
import structural.decorator.decorators.CompressionDecorator;

public class Client {

    public static void run() {

        String filePath = "testFile.txt";
        String data = "RandomString";
        String gotData;
        DataSource dataSource = new FileDataSource(filePath);

        System.out.printf("Client using FileDataSource: WritingData: %s \n", data);
        dataSource.writeData(data);
        gotData = dataSource.readData();
        System.out.printf("Client using FileDataSource: DataFound: %s \n\n",
                gotData);

        dataSource = new EncryptionDecorator(new FileDataSource(filePath));
        System.out.printf("Client using EncryptionDecorator: WritingData: %s \n", data);
        dataSource.writeData(data);
        gotData = dataSource.readData();
        System.out.printf("Client using EncryptionDecorator: DataFound: %s \n\n", gotData);

        dataSource = new EncryptionDecorator(
                new CompressionDecorator(
                        new FileDataSource(filePath)));
        System.out.printf("Client using EncryptionAndCompressionDecorator: WritingData: %s \n", data);
        dataSource.writeData(data);
        gotData = dataSource.readData();
        System.out.printf("Client using EncryptionAndCompressionDecorator: DataFound: %s \n\n", gotData);

    }
}
