import java.util.List;

public class QuickSort<T extends Comparable<T>> implements SortStrategy<T> {
	@Override
	public void sort(List<T> list) {
		quickSort(list, 0, list.size() - 1);
	}

	private void quickSort(List<T> list, int low, int high) {
		if (low < high) {
			int pi = partition(list, low, high);

			quickSort(list, low, pi - 1);
			quickSort(list, pi + 1, high);
		}
	}

	private int partition(List<T> list, int low, int high) {
		T pivot = list.get(high);
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (list.get(j).compareTo(pivot) < 0) {
				i++;

				// troca
				T temp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}

		// troca
		T temp = list.get(i + 1);
		list.set(i + 1, list.get(high));
		list.set(high, temp);

		return i + 1;
	}
}