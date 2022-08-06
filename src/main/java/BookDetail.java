
public class BookDetail {

	private String author;
	private String country;
	private String imageLink;
	private String language;
	private String link;
	private int  pages;
	private String title;
	private int year;
	private Double price;
	private Double lastPrice;
	private Boolean delivery;
	
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
	@Override
	public String toString() {
		return "BookDetail [author=" + author + ", country=" + country + ", imageLink=" + imageLink + ", language="
				+ language + ", link=" + link + ", pages=" + pages + ", title=" + title + ", year=" + year + ", price="
				+ price + ", lastPrice=" + lastPrice + ", delivery=" + delivery + "]";
	}

}
