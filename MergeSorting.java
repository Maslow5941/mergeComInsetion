package sort;

import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

import java.time.Instant;
import java.util.Scanner;

public class MergeSorting {

	int cont2;

	public static void main(String[] args) {

		System.out.print("tempo em milliseconds = ");
		System.out.println(System.currentTimeMillis() / 1000000);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos deseja: ");
		int elemento = sc.nextInt();

		int[] a = new int[elemento];

		System.out.println("Entre com os elementos: ");
		for (int i = 0; i < elemento; i++) {
			a[i] = sc.nextInt();
		}

		mergeSort(a, 0, a.length - 1, 0);
		for (int x : a) {
			System.out.println(x);
			sc.close();
		}

	}

	private static void mergeSort(int[] a, int i, int j, int cont2) {
		if (i < j) {
			cont2++;
			int mid = (i + j) / 2;
			mergeSort(a, i, mid, cont2);
			mergeSort(a, mid + 1, j, cont2);
			merge(a, i, mid, j, cont2);

		}
		// System.out.println(" 2: " + cont2);
	}

	private static void merge(int[] a, int baixo, int meio, int cima, int cont2) {
		int i = baixo;
		int[] b = new int[a.length];
		int j = meio + 1;
		int k = baixo;
		while (i <= meio && j <= cima) {

			if (a[i] < a[j]) {
				b[k] = a[i];
				i++;
				k++;

			} else {
				b[k] = a[j];
				j++;
				k++;
				cont2++;
			}
		}
		while (i <= meio) {

			b[k] = a[i];
			i++;
			k++;

		}
		while (j <= cima) {
			b[k] = a[j];
			j++;
			k++;

		}
		for (i = baixo; i <= cima; i++) {
			a[i] = b[i];

		}

	}

}
