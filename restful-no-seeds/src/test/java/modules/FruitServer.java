package modules;

import java.util.EnumSet;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class FruitServer {
	private final Server server;
	
	public FruitServer(int port){
		
		FilterHolder filterHolder = new FilterHolder();
	        filterHolder.setInitParameter("allowedOrigins", "*");
	        filterHolder.setInitParameter("allowedMethods", "GET");
	        filterHolder.setClassName("com.sun.jersey.spi.container.servlet.ServletContainer");
	        filterHolder.setInitParameter("com.sun.jersey.config.property.packages", "modules");
	        filterHolder.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
	        filterHolder.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", 
				"com.sun.jersey.api.core.PackagesResourceConfig");
	        filterHolder.setInitParameter("mimeTypes", "application/json");
	    
		ServletContextHandler context = new ServletContextHandler(server,"/",ServletContextHandler.SESSIONS);
		context.addFilter(filterHolder, "/*", EnumSet.of(DispatcherType.INCLUDE,DispatcherType.REQUEST));
		context.setAvailable(true);
	
	}
	
	public void start() throws Exception{
		server.start();
		System.out.println("Listening on " + server.getURI());
	}
	
	public void stop() throws Exception{
		server.stop();
		System.out.println("Server shutdown");
	}
	
	public static void main(String[] args) throws Exception{
		new FruitServer(8887).start();
	}

}
