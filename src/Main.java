import network.Ping;

public class Main {

    public static void main(String[] args) {

        System.out.println(args[0]);
        Ping ping = new Ping(args[0]);
        ping.pingIP(1000);


    }

}
