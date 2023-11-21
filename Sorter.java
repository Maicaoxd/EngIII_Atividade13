import java.util.List;

public class Sorter<T extends Comparable<T>> {
	private SortStrategy<T> strategy;

	public Sorter(SortStrategy<T> strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(SortStrategy<T> strategy) {
		this.strategy = strategy;
	}

	public void sortList(List<T> list) {
		System.out.println("Lista antes da ordenação: " + list);
		strategy.sort(list);
		System.out.println("Lista após a ordenação: " + list);
	}
}