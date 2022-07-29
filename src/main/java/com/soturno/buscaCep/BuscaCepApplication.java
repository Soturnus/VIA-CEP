package com.soturno.buscaCep;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dominio.Endereco;
import viacep.ServicoCep;

@SpringBootApplication
public class BuscaCepApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BuscaCepApplication.class, args);
		
		System.out.print("Informe seu CEP: ");
        @SuppressWarnings("resource")
		String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
	}

}
