public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(towerOfHanoi(6));
	}
	 public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1;
        }
        if (num == 1){
			return 1;
		}

		return (int) Math.pow(2, num) - 1;
    }
}
