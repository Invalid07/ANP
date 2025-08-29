package practices;

public class TemperatureConverter 
{
	private float Celsius , Fahrenheit ;
	
	
	
//	setter 
public void setFahrenheit(float Fahrenheit) 
	{	this.Fahrenheit=Fahrenheit;
		this.Fahrenheit=this.Celsius*(9/5) + 32;
	}

public void setCelsius(float Celsius)
{	this.Celsius=Celsius;
	this.Celsius= this.Fahrenheit-32*5/9;
}

//gettre 
public float getCelsius (){
	return Celsius;
}


public float getFahrenheit() {
	return Fahrenheit;
}

}


