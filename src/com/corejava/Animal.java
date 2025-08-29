package com.corejava;


//parent class
class Animal
{
	void sound() 
	{
		System.out.println("sound of Animal");
	}
}

//sub class
	class Dog extends Animal{
		void bark() 
		{
			System.out.println("dog barks");
		}
	
}
