package application;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Diferenca {

	public static void main(String[] args) {
		//define datas
		LocalDateTime dataCadastro = LocalDateTime.of(2022, 05, 25, 0, 0, 0);
		LocalDateTime hoje = LocalDateTime.now();

		//calcula diferença
		long meses = dataCadastro.until(hoje, ChronoUnit.MONTHS);
		System.out.println("MONTHS "+ meses);
		meses = dataCadastro.until(hoje, ChronoUnit.YEARS);
		System.out.println("YEARS "+ meses);
		meses = dataCadastro.until(hoje, ChronoUnit.DAYS);
		System.out.println("DAYS "+ meses);
		meses = dataCadastro.until(hoje, ChronoUnit.HALF_DAYS);
		System.out.println("HALF_DAYS "+ meses);
	}

}
