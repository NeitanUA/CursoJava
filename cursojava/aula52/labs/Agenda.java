package com.natanael.cursojava.aula52.labs;

public class Agenda extends Contato {

	public int adicionarContato(Contato contato) {
		
		int idContato = contato.getId();
		contato.setId(idContato -1);
		return contato.getId();
	}

	public String consultarContatos(Contato[] contatos) {
		String lista = "";
		
		try {
			for (Contato c : contatos) {
				lista += modeloString(c.toString());
			}
			return lista;
		} 
		catch (NullPointerException e) {
			return lista += modeloString("Espaço de contato vazio."); 					
		} 
		catch (Exception e) {
			return lista += modeloString("Erro ao consultar contato."); 
		}
	}

	public String consultarContatoById(Contato[] contatos, int id) {
		try {			
			return  modeloString(contatos[id].toString());					  								
		} 
		catch (NullPointerException e) {
			return modeloString("Contato não existe.");					
		}
		catch (ArrayIndexOutOfBoundsException e) {
			return modeloString("Esse espaço na agenda não existe.");					
		}
		catch (Exception e) {
			return modeloString("Erro ao consutar um contato pelo identificador.");					
		}
	}
	
	public static String modeloString(String string) {
		return "\n-------------------------------\n"
		+ string +
		"\n-------------------------------\n";
	}

}
