import helpers.FileHelper;
import java.io.IOException;


public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Requests requests = new Requests();
        //@todo need to uncomment for clear all list
//        System.out.println("Clear list");
//        requests.sendDel();

        System.out.println("Adding new list of cards");
        FileHelper fileHelper = new FileHelper();
        for (String cardNumber:fileHelper.getDataFromFile()
             ) {
//            System.out.println(cardNumber);
            requests.sendSave(cardNumber);
            Thread.sleep(250);
        }
    }
}