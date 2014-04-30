public class Dice {	
	public int Throw(int bounces) {	
		int total = 0;
		for (int k = bounces; k >0; k--){
			int die = (int) (1 + (Math.random() * 6));
			System.out.printf("%d\n", die);
			total = total + die;
		}
		return total;
	}
}