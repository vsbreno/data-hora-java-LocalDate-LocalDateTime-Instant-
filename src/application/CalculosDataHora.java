package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {

	public static void main(String[] args) {

			// Calculos com data-hora
			LocalDate d04 = LocalDate.parse("2022-07-12");
			LocalDateTime d05 = LocalDateTime.parse("2022-07-12T09:07:09");
			Instant d06 = Instant.parse("2022-07-12T09:07:09Z");
			
			System.out.println("Current date = " + d04);
			
			System.out.println("LocalDate");
			LocalDate nextWeekLocalDate = d04.plusDays(7);
			LocalDate pastWeekLocalDate = d04.minusDays(7);
			
			System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
			System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
			
			System.out.println("LocalDateTime");
			LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
			LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
			/* com um obj LocalDateTime também é possivel realizar a soma e 
			 * subtração de horas, min, sec, etc.
			*/
			
			System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
			System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
			
			System.out.println("Instant");
			Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
			Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
			
			System.out.println("nextWeekInstant = " + nextWeekInstant);
			System.out.println("pastWeekInstant = " + pastWeekInstant);
			
			/*
			 * Saber a duração entre duas datas (Duration)
			 */
			
			Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
			// OU
			Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
			/* O Java não permite calcular a duração entre 2 LocalDate sem informar o Time
			*/
			Duration t3 = Duration.between(pastWeekLocalDateTime, d05);
			Duration t4 = Duration.between(pastWeekInstant, d06);
			
			System.out.println("t1 dias = " + t1.toDays());
			System.out.println("t2 dias = " + t2.toDays());
			System.out.println("t3 dias = " + t3.toDays());
			System.out.println("t4 dias = " + t4.toDays());
	}

}
