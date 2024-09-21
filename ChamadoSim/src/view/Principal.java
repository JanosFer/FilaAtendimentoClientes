package view;

import javax.swing.JOptionPane;

import controller.Cliente;
import controller.FilaController;
import model.Fila;

public class Principal {
	static int i = 1;
	public static void main(String[] args) {
		Fila<Cliente> fila = new Fila<Cliente>();
		Fila<Cliente> filaPrioritarios = new Fila<Cliente>();
		
		FilaController fc = new FilaController();
		
		int opc = 0;
		String nome = "";
		int senha = 0;
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n 1 - Adicionar cliente na fila; \n 2 - Adicionar cliente na fila Prioritária; \n 3 - Atender próxima senha."));
			switch(opc) {
				case 1:
					Cliente c = new Cliente();
					nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
					senha = i++;
					
					c.setNome(nome);
					c.setSenha(senha);
					
					fc.adicionaCliente(c, fila);
					break;
				case 2:
					Cliente p = new Cliente();
					nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
					senha = i++;
					
					p.setNome(nome);
					p.setSenha(senha);
					
					fc.adicionaClientePrioritario(p, filaPrioritarios);
					break;
				case 3:
					if(!fila.isEmpty() || !filaPrioritarios.isEmpty()) {
						fc.atendeProximo(fila, filaPrioritarios);
					}else {
						System.out.println("Não há clientes na fila aguardando atendimento!");
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
