package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		//Instância de data-hora (agora)
		LocalDate d01 = LocalDate.now(); 
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//Conversão do padrão ISO 8601 para data-hora
		LocalDate d04 = LocalDate.parse("2022-07-12");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-12T09:07:09");
		Instant d06 = Instant.parse("2022-07-12T12:07:09Z");
		
		//Converter data-hora local para a data-hora global (SP GMT-3 > LONDRES): 
		Instant d07 = Instant.parse("2022-07-12T12:07:09-03:00");
		
		//Converter um texto customizado para data-hora
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		LocalDate d08 = LocalDate.parse("11/07/2024", fmt1); 
		// OU
		LocalDate d09 = LocalDate.parse("11/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		// COM HORA = 
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d10 = LocalDateTime.parse("11/07/2024 01:30", fmt2); 
		// OU
		LocalDateTime d11 = LocalDateTime.parse("11/07/2024 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		
		//Converter dia, mes, ano, [horario] -> data-hora
		LocalDate d12 = LocalDate.of(2022, 12, 25);
		LocalDateTime d13 = LocalDateTime.of(2024, 7, 11, 1, 30);
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("d12 = " + d12);
		System.out.println("d13 = " + d13);
	}

}
