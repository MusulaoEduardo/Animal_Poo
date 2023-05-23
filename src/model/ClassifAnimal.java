package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassifAnimal {
  private List<Animal> listaAnimal;
  Scanner ind = new Scanner(System.in);

  public ClassifAnimal() {
    listaAnimal = new ArrayList<>();
  }

  // adiciona um novo objeto animal na lista
  public void adicinoarAnimal(String nome, String reino, String categoria, int quantPernas) {
    int idanimal = listaAnimal.size();
    Animal a = new Animal(nome, reino, categoria, quantPernas);
    listaAnimal.add(a);
    a.setIdAnimal(idanimal++);
  }

  // Verificar se a lista não está vazia antes de acessar um índice específico na
  // lista.
  public void VerificarLista() {
    List<Animal> listaAnimal = getListaAnimal();

    if (!listaAnimal.isEmpty()) {
      // Índice desejado
      System.out.println("infomre um numero para verificar:");
      int indice = ind.nextInt();
      if (indice < listaAnimal.size()) {
        Animal animal = listaAnimal.get(indice);
        System.out.println(animal);
      } else {
        System.out.println("Índice inválido.");
        System.out.println("O tamnho da lista e " + getListaAnimal().size());
      }
    } else {
      System.out.println("A lista está vazia, adicione um objeto antes.");
    }
  }

  public void AnimaisNaLista() {
    // total animais informa quantos obj animais foram adicionados;
    System.out.println("---- Animais na Lista ---- TotalAnimais:" + listaAnimal.size());
    for (Animal animal : listaAnimal) {
      System.out.println(animal);
    }

  }

  public void listarAnimaisPorCategoria(String categoria) {

    System.out.println("---------------------------------------");
    System.out.print("Animais da categoria " + categoria + ":");
    boolean encontrouCategoria = false;
    for (Animal animal : listaAnimal) {
      if (animal.getCategoria().equalsIgnoreCase(categoria)) {
        encontrouCategoria = true;
        System.out.print(animal);
      }
    }

    if (!encontrouCategoria) {
      System.out.println("Nenhum animal encontrado na categoria " + categoria + ".");
    }
    System.out.println();
  }

  public List<Animal> getListaAnimal() {
    return listaAnimal;
  }

  public void setListaAnimal(List<Animal> listaAnimal) {
    this.listaAnimal = listaAnimal;
  }

  @Override
  public String toString() {
    return "ClassifAnimal [listaAnimal=" + listaAnimal + "]";
  }

}
