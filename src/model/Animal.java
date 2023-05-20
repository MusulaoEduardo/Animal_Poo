package model;

public class Animal {

  private int idAnimal;
  private String nome;
  private String Reino;
  private String Classe;
  private String Categoria;
  private int quantPernas;

  public Animal(String nome, String reino, String Categoria, int quantPernas) {
    setNome(nome);
    setReino(reino);
    setCategoria(Categoria);
    setQuantPernas(quantPernas);
  }

  public int getIdAnimal() {
    return idAnimal;
  }

  public void setIdAnimal(int idAnimal) {
    this.idAnimal = idAnimal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantPernas() {
    return quantPernas;
  }

  public void setQuantPernas(int quantPernas) {
    this.quantPernas = quantPernas;
  }

  public String getReino() {
    return Reino;
  }

  public void setReino(String reino) {
    String a = "Animalia";
    if (!reino.equalsIgnoreCase(a)) {
      throw new IllegalArgumentException("O reino deve ser 'Animalia'.");
    }
    Reino = reino;
  }

  public String getClasse() {
    return Classe;
  }

  public void setClasse(String classe) {
    Classe = classe;
  }

  public String getCategoria() {
    return Categoria;
  }

  public void setCategoria(String Categoria) {
    this.Categoria = Categoria;
  }

  @Override
  public String toString() {
    System.out.println();
    return "Animal [idAnimal=" + getIdAnimal() + ", nome=" + nome + ", Reino=" + Reino + ", Categoria="
        + Categoria
        + ", quantPernas=" + quantPernas + "]";
  }

}
