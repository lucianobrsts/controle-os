package br.com.controleos.util;

import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.controleos.domain.EnderecoCorreios;

public class ServicoEnderecoCorreios implements Serializable {

	private static final long serialVersionUID = -7020301141886779638L;

	public EnderecoCorreios buscarEnderecoPor(String urlJson) {
		System.out.println("Chamou o serviço...");

		final GsonBuilder gsonBuilder = new GsonBuilder();
		final Gson gson = gsonBuilder.create();
		EnderecoCorreios retornoEnderecoCorreios = gson.fromJson(urlJson, EnderecoCorreios.class);
		return retornoEnderecoCorreios;
	}
}
