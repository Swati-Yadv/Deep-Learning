import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String[] args)throws Exception
    {
        Socket s = new Socket("127.0.0.1",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Binay Sir");
        dout.flush();
        dout.close();
        s.close();
    }
}