public class Main {

    public static void main(String[] args) {

//        Phone phone= new Iphone(); // shouldn't compile
        Phone iphone = new IphoneXS("AAAAAA");

        iphone.addContact(1, "0745333444", "Adrian", "Bucur");
        iphone.addContact(2, "0730000444", "Adina", "Bucur");
        iphone.listContacts();

//        // send a message to the first contact from the previous listed
//        // max number of characters - 100
        iphone.sendMessage("0745333444", "Hello world");
        iphone.listMessages("0745333444");


// send a message to the second contact from the previous listed
        iphone.sendMessage("0730000444", "dadsadadsadsadsadasda");

        iphone.call("0740111222");
        iphone.call("0742333444");
        iphone.call("0722111000");
        iphone.call("0733555777");
        iphone.viewHistory();

        iphone.setColor("red");
        System.out.println("Phone color is " + iphone.getColor());

        System.out.println("Current battery level " + iphone.getCurrentBatteryLevel());


    }

}
