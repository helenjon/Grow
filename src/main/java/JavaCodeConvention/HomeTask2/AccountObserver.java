package JavaCodeConvention.HomeTask2;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AccountObserver implements Observer {

    private File log;
    private BufferedWriter writer;



    public AccountObserver(String fileName) {
        logFileCreation(fileName);
           }

    @Override
    public void objectAddMoney(String data) {
        writeUsingFileWriter("money was added to " + data);
    }

    @Override
    public void objectWithdrawMoney(String data) {
        writeUsingFileWriter("objectWithdrawMoney " + data);

    }

    private void logFileCreation(String fileName) {
        this.log = new File("C:\\My doc\\Authomation\\Grow\\" + fileName);
         //newFile.createNewFile();

    }

    private void writeUsingFileWriter(String data){
        try {
            // Open given file in append mode.
            writer = new BufferedWriter(new FileWriter(this.log, true));
            writer.write(data+"\n");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);

        }
    }

}


