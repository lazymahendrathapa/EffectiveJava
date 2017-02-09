package chapter02.item02;

public class NutritionFacts {

	private int servingSize;
	private int serving;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;

	public static class Builder {

		// Required parameters
		private int servingSize;
		private int serving;

		// Optional parameters - initialized to default values.
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		public Builder(int servingSize, int serving) {
			this.servingSize = servingSize;
			this.serving = serving;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	public NutritionFacts(Builder builder) {

		servingSize = builder.servingSize;
		serving = builder.serving;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;

	}
	
	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", serving=" + serving + ", calories=" + calories
				+ ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
	}


	public static void main(String[] args) {

		NutritionFacts cocaCola = new NutritionFacts.Builder(100, 8).calories(200).fat(50).build();
		
		System.out.println(cocaCola.toString());
	}
}
