import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Digite a lista de elementos separados por espaços (ou 'exit' para sair): ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("exit")) {
				break;
			}

			List<String> inputList = Arrays.asList(input.split("\\s+"));

			System.out.println("Escolha o algoritmo de ordenação (1: Bubble Sort, 2: Quick Sort, 3: Merge Sort): ");
			int choice = scanner.nextInt();
			SortStrategy<String> sortingStrategy = getSortingStrategy(choice);

			if (sortingStrategy != null) {
				Sorter<String> stringSorter = new Sorter<>(sortingStrategy);
				List<String> stringList = new ArrayList<>(inputList);
				stringSorter.sortList(stringList);
			} else {
				System.out.println("Escolha inválida. Tente novamente.");
			}

			// Consumir a quebra de linha pendente após a entrada do usuário
			scanner.nextLine();
		}

		System.out.println("Encerrando o programa.");
		scanner.close();
	}

	private static SortStrategy<String> getSortingStrategy(int choice) {
		switch (choice) {
		case 1:
			return new BubbleSort<>();
		case 2:
			return new QuickSort<>();
		case 3:
			return new MergeSort<>();
		default:
			return null;
		}
	}
}
