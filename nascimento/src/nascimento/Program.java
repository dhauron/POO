package nascimento;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		LocalDateTime dhn = LocalDateTime.of(1989, 2, 21, 21,30,00);
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatoBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Data de nascimento: " + dhn.format(formatoBarra) + " " + dhn.getHour()
		+ "h" + dhn.getMinute()+ "min");
		System.out.println("Dia de hoje: " + agora.format(formatoBarra));
		
		System.out.println("Nasceu em ano bissexto: " + dhn.toLocalDate().isLeapYear());
		
		Duration duracao = Duration.between(dhn, agora);
		System.out.println("Desde o nasccimento se passaram: " + duracao.getSeconds() + " segundos");
		System.out.println("Desde o nasccimento se passaram: " + duracao.toDays() + " dias");
		System.out.println("Desde o nasccimento se passaram: " + duracao.toDays()/365 + " anos"); 
	}

}
