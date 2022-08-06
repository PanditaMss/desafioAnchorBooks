import java.util.List;



public class Book {

	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String title;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", country=" + country + ", imageLink=" + imageLink + ", language=" + language
				+ ", title=" + title + ", id=" + id + "]";
	}

	public static void Obtenerautorytitulo(List<Book> list) {
		System.out.println("Autor y titulo: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).author + ":" + list.get(i).title);

		}

	}

	public static void obtenerlistaexplicita(List<Book> list) {
		System.out.println("Autor 3 y 8: ");
		for (int i = 0; i < list.size(); i++) {
			if (i == 2 || i == 7) {
				System.out.println(list.get(i).author + ":" + list.get(i).title);
			}
		}
	}
	public static void listalibrosautoresanonimos(List<Book> list) {
		System.out.println("autores anonimos: ");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).author.equals("Unknown")) {
				System.out.println("Author: "+ list.get(i).author + " libro: "+  list.get(i).title);
			}
			
		}
	}
}
