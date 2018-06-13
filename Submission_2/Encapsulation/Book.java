
class Book
{
	private  String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String n,Author a,double p,int q)
	{
		name=n;
		price=p;
		qtyInStock=q;
		author=a;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	public void setQtyInStock(int qty)
	{
		this.qtyInStock=qty;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}




	public static void main(String[] args) {

		Author author=new Author("Sheshadri","sheshadri@gamil.com",'M');
		Book book=new Book("Yugavatara",author,200,50);
		System.out.println(" Book name: "+book.getName()+" Available copies: "+book.getQtyInStock()+" Price per copy: "+book.getPrice());
		Author a=(Author) book.getAuthor();
		System.out.println(" Author Name: "+a.name+" Email: "+a.email+" Gender: "+a.gender);

		
	}

}