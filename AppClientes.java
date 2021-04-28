import java.util.List;
class AppClientes {
  
  static ClienteService service = new ClienteService();

  public static void main(String[] args) {
    limpiarPantalla();
    System.out.println("Aplicación Listado de Clientes - Ejemplo 2 Git");
    System.out.println("================================================\n");
    listarClientes();
  }

  static void listarClientes() {
    List<Cliente> clientes = service.buscarTodo();

    for (Cliente c : clientes) {
      System.out.println(" - " + c);
      System.out.println("---------------------------------------------------");
    }  
  }

  static void limpiarPantalla() {
    try {
      //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
      new ProcessBuilder("clear").inheritIO().start().waitFor(); 
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}
