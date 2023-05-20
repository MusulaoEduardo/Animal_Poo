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

  public void Escolha(int opc) {
    menuLista();
    opc = ind.nextInt();
    switch (opc) {
     /*  case 1:
        adicinoarAnimal(null, null, null, opc);
        break;*/
      case 2:
        listarAnimaisPorCategoria(null);
      case 3:
        VerificarLista();
      case 4:
        AnimaisNaLista();
      default:
        System.out.println("nanana");
        
    }
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
    for (Animal animal : listaAnimal) {
      System.out.println(animal);
    }

  }

  public void listarAnimaisPorCategoria(String categoria) {

    System.out.println("Animais da categoria " + categoria + ":");
    boolean encontrouCategoria = false;
    for (Animal animal : listaAnimal) {
      if (animal.getCategoria().equalsIgnoreCase(categoria)) {
        encontrouCategoria = true;
        System.out.println(animal);
      }
    }

    if (!encontrouCategoria) {
      System.out.println("Nenhum animal encontrado na categoria " + categoria + ".");
    }
  }

  public void menuLista() {
  //  System.out.println("1-Adicionar");
    System.out.println("2-Animais Por Categoria");
    System.out.println("3-Verificar Lista Por Indice");
    System.out.println("4-Listar todos os Animais");

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
