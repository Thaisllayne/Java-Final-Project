
public class TesteFuncionario {

	public static void main(String[] args) {
		
		// Cliente cliente = new Cliente();
		// cliente.getSalario(3000.0);
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("111.111.111-11");
		nico.setSalario(2500.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
