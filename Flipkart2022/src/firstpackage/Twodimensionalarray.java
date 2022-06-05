package firstpackage;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = new String[2][3];

		arr[0][0] = "testone";
		arr[0][1] = "testtwo";
		arr[0][2] = "testthree";

		arr[1][0] = "amone";
		arr[1][1] = "amtwo";
		arr[1][2] = "testthree";

		String[][] arsa = { { "one", "two" }, { "a", "asd" }, { "asd", "asdas" } };// two dimen

		System.out.println("no of rows " + arr.length);
		// arr[i][j]
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i].length);

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);

			}

		}

	}

}
