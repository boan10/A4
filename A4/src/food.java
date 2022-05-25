public class Food{
	private String foodID;
	private String foodName;
	private String foodDescription;
	private double foodPrice;
	private int foodCalorie;
	private String foodType;
	
	public Food(String ID, String Name, String Description, double Price, int Calorie, String Type)
	{
		foodID = ID;
		foodName = Name;
		foodDescription = Description;
		foodPrice = Price;
		foodCalorie = Calorie;
		foodType = Type;
	}
	
	public String AddFood()
	{
		int countWord = countWordsFoodName(foodName);
		if (countWord < 5 || countWord >30)
		{
			return"The food information cannot be added";
		}
		int countWord =countWordsFoodDescription(foodDescription);
		if (countWord < 5 || countWord >50)
		{
			return"The food information cannot be added";
		}
		if(foodPrice < 5 || foodPrice >150)
		{
			return"The food information cannot be added";
		}
		if(foodCalorie > 1000 && (foodPrice >= 100))
		{
			return"The food information cannot be added";
		}
		if((foodType == "Kid Food" && (foodCalorie >= 800)) || (foodType != "Kid Food " && (foodCalorie >= 1500)))
			renturn"The food information cannot be added";
	
	renturn"The food information cannot be added";
	}
}