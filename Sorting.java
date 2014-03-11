import java.util.ArrayList;

class Sorting {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(8);
		ints.add(3);
		ints.add(7);
		ints.add(8);
		ints.add(7);

		ints.add(1);
		ints.add(0);
		//Test for problem 0
		//System.out.println(size(ints));
		//Test for problem 1
		// System.out.println(unSortExists(2, ints));
		// System.out.println(unSortExists(1, ints));
		//Test for problem 2
		//Test for problem 3
		//System.out.println(reverse(ints));
		//Test for problem 4
		//



		//print(bubbleSort(ints));
		print(selectionSort(ints));
		//print(insertionSort(ints));

	}
	public static void print(ArrayList<Integer> a){
		for (int i: a) {
			System.out.println(i+" ");
		}
		System.out.println();
	}


	//problem 0
	public static int size(ArrayList<Integer>a){
		int c = 0;
		for (Integer i : a) {
			c++;
		}
		return c;
	}

	//problem 1
	public static boolean unSortExists(int n, ArrayList<Integer>a){
		for (int i = 0; i < size(a); i++) {
			if (n == a.get(i)) {
				return true;
			}
		}
		return false;
	}

	//problem 2
	// public static boolean orderedList(int n, ArrayList<Integer>a){
	// 	while (size(a)>=0) {
			
	// 	}
	// 	return false;
	// }

	//problem 3
	public static ArrayList<Integer> reverse(ArrayList<Integer> a){
		int temp;
		for (int i=0; i<(size(a)/2); i++) {
			temp = a.get(i);
			a.set(i, a.get(size(a) - (i+1)));
			a.set(size(a) - (i+1), temp);
		}
		return a;
	}
	//problem 4
	public static ArrayList<Integer> sort(ArrayList<Integer> a){
		boolean t = false;
		int o =0;
		int temp =0;
		while (!t) {
			t=true;
			for (int i = 0; i < size(a)-1; i++) {
				if (a.get(i)>a.get(i +1)) {
					temp = a.get(i+1);
					a.set(i+1, a.get(i));
					a.set(i, temp);
					t=false;
				}
			}
		}
		return a;
	}
	//Selection
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> a){
		int min;
		int temp;
		for (int i=0; i<size(a); i++) {
			min = a.get(i);
			for (int j=i+1; j<size(a); j++) {
				if (min>a.get(j)) {
					min=a.get(j);
				}
			}
			temp = a.get(i);
			a.set(i,min);
			
		}
		return a;
	}
	//insertion
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> a){
		int temp;
		int j,t;
		for (int i=1; i<size(a); i++) {
			j = i-1;
			t = i;
			while (a.get(t)<a.get(j)) {
				temp = a.get(t);
				a.set(t, a.get(j));
				a.set(j, temp);
				if (j!=0) {
					j--;
					t--;
				}else{
					break;
				}
			}
		}
		return a;
	}
	//bubble
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> a){
		boolean t = false;
		int o =0;
		int temp =0;
		while (!t) {
			t=true;
			for (int i = 0; i < size(a)-1; i++) {
				if (a.get(i)>a.get(i +1)) {
					temp = a.get(i+1);
					a.set(i+1, a.get(i));
					a.set(i, temp);
					t=false;
				}
			}
		}
		return a;
	}
}