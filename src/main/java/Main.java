import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book book = new Book();
		BookDetail bookDt = new BookDetail();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response respuestaAPI = invocationBuilder.get();

		List<Book> list = respuestaAPI.readEntity(new GenericType<List<Book>>() {
		});

		// detalle
		Client client2 = ClientBuilder.newClient();
		WebTarget TargetDetalle = client2.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks/")
				.path("bookDetail");

		Invocation.Builder invocationBuilderDt = TargetDetalle.request(MediaType.APPLICATION_JSON);

		Response respuestaAPIDt = invocationBuilderDt.get();

		List<BookDetail> listDt = respuestaAPIDt.readEntity(new GenericType<List<BookDetail>>() {
		});

		 

		MenuLibros menu = new MenuLibros();
		int caso = 0;
		do {
			menu.menu();
			caso = sc.nextInt();
			switch (caso) {
			case 1:
				System.out.println(list.toString());
				 System.out.println("-------------------------------");

				break;
			case 2:
				 book.Obtenerautorytitulo(list);
				  System.out.println("-------------------------------");
				
				break;
			case 3:
				 book.obtenerlistaexplicita(list);
				 System.out.println("-------------------------------");

				break;
			case 4:
				 bookDt.obtenerlistadetalle(listDt);
				 System.out.println("-------------------------------");
				 
				 break;
			case 5:
				book.listalibrosautoresanonimos(list);
				  System.out.println("-------------------------------");
				  
				  break;
				
			}
		} while (caso <= 5);

	}
}
