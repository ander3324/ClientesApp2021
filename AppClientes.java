class AppClientes {
  
  public static void main(String[] args) {
    limpiarPantalla();
    System.out.println("Aplicación Listado de Clientes - Ejemplo 2 Git");
    System.out.println("================================================\n");
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
