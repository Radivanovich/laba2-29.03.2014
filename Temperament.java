package temperament;

abstract class Temperament
{
	int sanguine[] = {4,3,3,2,3,3};
	int choleric[] = {4,3,3,2,4,4};
	int melancholiac[] = {2,2,4,4,3,2};
	int phlegmatic[] = {2,2,2,2,2,2};
	abstract int[] getTemperament();
}

class Sanguine extends Temperament
{
	
	int[] getTemperament()
	{
		return sanguine;
	}
}

class Choleric extends Temperament
{
	int[] getTemperament()
	{
		return choleric;
	}
}

class Melancholiac extends Temperament
{
	int[] getTemperament()
	{
		return melancholiac;
	}
}

class Phlegmatic extends Temperament
{
	int[] getTemperament()
	{
		return phlegmatic;
	}
}