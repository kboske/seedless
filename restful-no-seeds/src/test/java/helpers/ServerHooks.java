package helpers;

import modules.FruitServer;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class ServerHooks {
    public static final int PORT = 8887;

    private FruitServer server;
    
    @Before
    public void startServer() throws Exception {
    	System.out.println("Server hooks startServer");
        server = new FruitServer(PORT);
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }
}
