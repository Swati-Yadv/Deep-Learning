import java.io.*;
import java.net.*;
class DateClient
{
    public static void main(String args[]) throws Exception
    {
        Socket soc =new Socket("127.0.0.1",8888);        
        BufferedReader in=new BufferedReader(new InputStreamReader(soc.getInputStream()  ));
        System.out.println(in.readLine());
        soc.close();
    }    
}

