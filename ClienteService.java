import java.util.List;
public class ClienteService {
  
  ClienteRepository repo = new ClienteRepository();

  public List<Cliente> buscarTodo() {
    return repo.getClientes();
  }
}
