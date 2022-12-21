package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import intities.Lesson;
import intities.Task;
import intities.Video;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas aulas tem o curso: ");
		int n = sc.nextInt();
		
		List<Lesson> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados da "+i+ "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char lt = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.next();
			String titulo = sc.nextLine();
			
			if(lt == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt(); 
				list.add(new Video(titulo, url, seconds));
			}
			else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				list.add(new Task(description, questionCount) );
			}
			
			System.out.println();		
		}
		
		int total = 0;
		
		for(Lesson ls : list) {
			total += ls.duration();
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + total + " segundos");
	
		sc.close();
	}

}
