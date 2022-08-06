import java.util.List;

public class BookDetail {

	private int id;
	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String link;
	private int pages;
	private String title;
	private int year;
	private Double price;
	private Double lastPrice;
	private Boolean delivery;

	public BookDetail() {
		super();
	}

	@Override
	public String toString() {
		return "BookDetail [id=" + id + ", author=" + author + ", country=" + country + ", imageLink=" + imageLink
				+ ", language=" + language + ", link=" + link + ", pages=" + pages + ", title=" + title + ", year="
				+ year + ", price=" + price + ", lastPrice=" + lastPrice + ", delivery=" + delivery + "]";
	}

	public BookDetail(int id, String author, String country, String imageLink, String language, String link, int pages,
			String title, int year, Double price, Double lastPrice, Boolean delivery) {
		super();
		this.id = id;
		this.author = author;
		this.country = country;
		this.imageLink = imageLink;
		this.language = language;
		this.link = link;
		this.pages = pages;
		this.title = title;
		this.year = year;
		this.price = price;
		this.lastPrice = lastPrice;
		this.delivery = delivery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Boolean getDelivery() {
		return delivery;
	}

	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}

	public static void obtenerlistadetalle(List<BookDetail> listDt) {
		System.out.println("Detalle ");
		for (int i = 0; i < listDt.size(); i++) {
			if (i == 0) {
				System.out.println(listDt.get(i).toString());
			}
		}

	}

}
