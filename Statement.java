package temperament;

interface Happiness
{
	final static float stat[] = {10,-10,5,-5};
	final static String name = "Счастье";
}

interface Sadness
{
	final static float stat[] = {-10,10,-5,5};
	final static String name = "Грусть";
}

interface Kindness
{
	final static float stat[] = {5,-5,10,-10};
	final static String name = "Доброта";
}

interface Anger
{
	final static float stat[] = {-5,5,-10,10};
	final static String name = "Злость";
}

public class Statement implements Happiness, Sadness, Kindness, Anger {
	float stat[];
	Statement(int i)
	{
		switch(i)
		{
		case 1:
			stat=Happiness.stat;
			break;
		case 2:
			stat=Sadness.stat;
			break;
		case 3:
			stat=Kindness.stat;
			break;
		case 4:
			stat=Anger.stat;
			break;
		}
	}

}
