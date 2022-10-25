package visit;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.URL;

public class VisitThread extends Thread {

    private String url;

    public VisitThread(String url){

        this.url = url;

    }

    public void run() {

        for(int i=1; i<=20000; i++){

            try {

                visit(url);

            } catch (IOException e) {

                e.printStackTrace();

            }

        }

    }

// private static Proxy proxy;

// static {

// SocketAddress sa = new InetSocketAddress("120.26.192.127", 3128);

// proxy=new Proxy(java.net.Proxy.Type.HTTP, sa);

// }

    public void visit(String url) throws IOException {

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

        connection.setRequestProperty("User-Agent", "");

        connection.getInputStream();

        connection.disconnect();

// HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection(proxy);

//

// connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

// connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36");

// BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

// String s;

// while ((s=reader.readLine())!= null){

// System.out.println(s);

// }

// reader.close();

// connection.disconnect();

    }

}

