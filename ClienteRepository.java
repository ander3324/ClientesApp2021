import java.util.List;
import java.util.ArrayList;
public class ClienteRepository {

  public List<Cliente> clientes;
  
  public ClienteRepository() {
    clientes = new ArrayList<>(); //Inferencia de tipos

    clientes.add(new Cliente(1, "Díaz", "Jorgito"));
    clientes.add(new Cliente(2, "Toledo", "Lucas"));
    clientes.add(new Cliente(3, "Hageleit", "El Flaco"));
  } 

  public List<Cliente> getClientes() {
    return clientes;
  }
}
