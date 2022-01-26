package exe3;
import java.util.Scanner; 

public class exe3 {
	
	public static void main(String[] args) {
		int totalSegu, seg, min, hora;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento?");
		totalSegu = leia.nextInt();
		
		hora = totalSegu/ 3600;
		min = (totalSegu % 3600) / 60;
		seg = (totalSegu % 3600) % 60;
		
		System.out.println("O evento durou"+hora+ " horas" +min+ "minutos e " +seg+ "segundos" );
				
	}
}
