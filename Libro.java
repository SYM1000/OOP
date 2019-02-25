public class Libro{

  private String titulo;
  private String autor;
  private String editorial;
  private String isbn;

  public Libro(){
    titulo = "Elon Musk: El empresario que anticipa el futuro";
    autor = "Ashlee Vance";
    editorial = "Paidos";
    isbn = "9780062301239";
  }

  public Libro(String titulo, String autor, String editorial, String isbn){
    this.titulo = titulo;
    this.autor = autor;
    this.editorial = editorial;
    this.isbn = isbn;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public void setAutor(String autor){
    this.autor = autor;
  }

  public void setEditorial(String editorial){
    this.editorial = editorial;
  }

  public void setIsbn(String isbn){
    this.isbn = isbn;
  }

  public String getTitulo(){
    return this.titulo;
  }

  public String getAutor(){
    return this.autor;
  }

  public String getEditorial(){
    return this.editorial;
  }

  public String getIsbn(){
    return this.isbn;
  }

  public static void main(String[] args) {
    Libro libro = new Libro();
    Libro steveJobs = new Libro("Steve Jobs", "Walter Isaacson", "Simon & Schuster", "9788499921181");

    System.out.println("Libro por default:");
    System.out.println("Titulo: " + libro.getTitulo());
    System.out.println("Autor: " + libro.getAutor());
    System.out.println("Editorial: " + libro.getEditorial());
    System.out.println("ISBN: " + libro.getIsbn());
    System.out.println("");

    System.out.println("Libro Nuevo: ");
    System.out.println("Titulo: " + steveJobs.getTitulo());
    System.out.println("Autor: " + steveJobs.getAutor());
    System.out.println("Editorial: " + steveJobs.getEditorial());
    System.out.println("ISBN: " + steveJobs.getIsbn());
  }
}
