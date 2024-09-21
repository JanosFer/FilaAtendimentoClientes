package controller;

import model.Fila;

public class FilaController {
	public static int i = 0;
	public void adicionaCliente(Cliente c, Fila<Cliente> fila) {
		fila.insert(c);
	}
	
	public void adicionaClientePrioritario(Cliente p, Fila<Cliente> filaPrioritarios) {
		filaPrioritarios.insert(p);
	}
	
	public void atendeProximo(Fila<Cliente> fila, Fila<Cliente> filaPrioritarios) {
		Cliente temp = new Cliente();
		
		if(i < 3 && !filaPrioritarios.isEmpty()) {
			try {
				temp = filaPrioritarios.remove();
				System.out.println("O(A) Cliente Prioritário " +temp.getNome()+ " de senha " +temp.getSenha()+ " foi atendido(a).");
				i++;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}else {
			try {
				temp = fila.remove();
				System.out.println("O(A) Cliente " +temp.getNome()+ " de senha " +temp.getSenha()+ " foi atendido(a).");
				i = 0;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
