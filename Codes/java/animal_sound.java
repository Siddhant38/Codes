//20
//18-8-2020
abstract class animal
{
	abstract void sound();
}
class dog extends animal
{
	void sound()
	{
		System.out.println(" Bark ");
	}
}
class cat extends animal
{
	void sound()
	{
		System.out.println(" Meow ");
	}
}
class lion extends animal
{
	void sound()
	{
		System.out.println(" roar ");
	}
}
class animal_sound
{
	public static void main(String[] args) 
	{
		animal a=new dog();
		a.sound();
		animal a1=new cat();
		a1.sound();
		animal a2=new lion();
		a2.sound();
			
	}
}
