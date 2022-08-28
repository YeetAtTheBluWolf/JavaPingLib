package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ping {

    private InetAddress address;
    Exception indexOutOfBounds;

    public Ping(String address)
    {
        indexOutOfBounds = new Exception("Index is out of bounds");
        try
        {
            this.address = InetAddress.getByName(address);
        }
        catch(UnknownHostException ex)
        {
            System.out.println(ex + ": Please insert a valid IP.");
        }
    }

    public void pingIP(int timeout)
    {
        try
        {
            System.out.println(this.address.isReachable(timeout) ? "IP is reachable" : "IP is not reachable");
        }
        catch(IOException io)
        {
            System.out.println(io + "Please enter a valid IP address");
        }
    }

    public void repeatingPing(int amountOfRepeats)
    {
        try
        {
            if(amountOfRepeats <= 0)
                throw indexOutOfBounds;

            int count = amountOfRepeats;
            while(0 < count)
            {
                pingIP(1000);
                count--;
            }

        }
        catch(Exception ex)
        {
            System.out.println(ex + "Please give a amountOfRepeats");
        }
    }

    public void repeatingPing(int amountOfRepeats, int timeout)
    {
        try
        {
            if(amountOfRepeats <= 0)
                throw indexOutOfBounds;

            int count = amountOfRepeats;
            while(0 < count)
            {
                pingIP(timeout);
                count--;
            }

        }
        catch(Exception ex)
        {
            System.out.println(ex + "Please give a amountOfRepeats");
        }
    }

}
