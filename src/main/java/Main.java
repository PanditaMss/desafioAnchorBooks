import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
		
		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		
		Response respuestaAPI = invocationBuilder.get();
		
		List<Book> list = respuestaAPI.readEntity(new GenericType<List<Book>>() {});
		
		
		System.out.println(list.toString());
		book.Obtenerautorytitulo(list);
		book.obtenerlistaexplicita(list);


	}

}
