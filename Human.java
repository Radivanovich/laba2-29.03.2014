package temperament;

import java.util.Scanner;
import java.util.Random;

public class Human {
	int [] temperament;
	float [] statement;
	int choice;
	Human(int i, int j)
	{
		switch(i)
		{
		case 1:
			Temperament temp=new Sanguine();
			temperament=temp.getTemperament();
			break;
		case 2:
			Temperament temp1=new Choleric();
			temperament=temp1.getTemperament();
			break;
		case 3:
			Temperament temp2=new Melancholiac();
			temperament=temp2.getTemperament();
			break;
		case 4:
			Temperament temp3=new Phlegmatic();
			temperament=temp3.getTemperament();
			break;
		}
		Statement temporary=new Statement(j);
		statement=temporary.stat;
		choice=i;
	}
	
	public int rand_value()
	{
		Random rand = new Random();
		return rand.nextInt(4);
	}
	
	public static Human input(boolean ch,Scanner inp) {
		int i,j;
		if(ch==true)
			System.out.println("Какого человека вы хотите создать?");
		else
			System.out.println("А второго какого хотите?");
		System.out.println("1 - Cангвиника");
		System.out.println("2 - Холерика");
		System.out.println("3 - Меланхолика");
		System.out.println("4 - Флегматика");
		System.out.println("(Ввести число от 1 до 4)");
		i=inp.nextInt();
		System.out.println("Настрой какой хотите?");
		System.out.println("1 - Веселый");
		System.out.println("2 - Грустный");
		System.out.println("3 - Добрый");
		System.out.println("4 - Злой");
		System.out.println("(Ввести число от 1 до 4)");
		j=inp.nextInt();
		Human temp=new Human(i,j);
		return temp;
	}
	
	public int analyzing(Human temp)
	{
		float i,j;
		boolean kind = false, happy = false;
		if(temp.statement[0]+temp.temperament[1]>temp.statement[1]+temp.temperament[2])
		{
			i=temp.statement[0]+temp.temperament[1];
			happy=true;
		}
		else
			if(temp.statement[0]+temp.temperament[1]<temp.statement[1]+temp.temperament[2])
			{
				i=temp.statement[1]+temp.temperament[2];
				happy=false;
			}
			else
				i=1;
		
		if(temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2>temp.statement[3]+temp.temperament[0])
		{
			j=temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2;
			kind=true;
		}
		else
			if(temp.statement[2]+(temp.temperament[1]+temp.temperament[1])/2<temp.statement[3]+temp.temperament[0])
			{
				j=temp.statement[3]+temp.temperament[0];
				kind=false;
			}
			else
				j=1;
		if(i>j&&happy==true)
			return 1;
		if(i>j&&happy==false)
			return 2;
		if(i<j&&kind==true)
			return 3;
		if(i<j&&kind==false)
			return 4;
		if(happy==false&&kind==false)
			return 0;
		return -1;
	}
	
	public static void say_welcome(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].welcome+"(сияя)");
		break;
		case 2:
			System.out.println(sad[temp.rand_value()].welcome+"(грустно)");
		break;
		case 3:
			System.out.println(kind[temp.rand_value()].welcome+"(с улыбкой)");
		break;
		case 4:
			System.out.println(anger[temp.rand_value()].welcome+"(со злостью)");
		break;
		}
	}
	
	
	public static void say_phrase(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].phrase+"(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].phrase+"(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].phrase+"(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].phrase+"(со злостью)");
			break;
		}
	}
	
	
	public static void say_quation(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].quation+"(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].quation+"(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].quation+"(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].quation+"(со злостью)");
			break;
		}
	}
	
	
	public static void say_answer(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].answer+"(сияя)");
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].answer+"(грустно)");
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].answer+"(с улыбкой)");
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].answer+"(со злостью)");
			break;
		}
	}
	
	
	public static void say_finale(int type, Replica happy[],Replica sad[],Replica kind[],Replica anger[]) {
		Human temp=new Human(1,2);
		switch(type)
		{
		case -1:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 0:
			System.out.println("-'промолчу пожалуй..'");
			break;
		case 1:
			System.out.println(happy[temp.rand_value()].finale);
			break;
		case 2:
			System.out.println(sad[temp.rand_value()].finale);
			break;
		case 3:
			System.out.println(kind[temp.rand_value()].finale);
			break;
		case 4:
			System.out.println(anger[temp.rand_value()].finale);
			break;
		}
	}
	public void changeStatement(Human man, int type) {
		double k=0.5;
		switch (type) { // МОЖНО ПОТОМ ДОБАВИТЬ ИЗМЕНЕНИЕ ГОЛОДА И РАЗДЕЛИТЬ НА
						// НЕСКОЛЬКО ФУНКЦИЙ
		case 1: {
			man.statement[0] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[1] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[2] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			man.statement[3] -= (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			break;
			}
		case 2: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]+5) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]) / 4.0*k;
			break;
			}
		case 3: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			break;
			}
		case 4: {
			man.statement[0] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[1] += (man.temperament[0] + man.temperament[1]
					+ man.temperament[4]) / 3.0*k;
			man.statement[2] -= (man.temperament[0] + man.temperament[1]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			man.statement[3] += (man.temperament[0] + man.temperament[3]
					+ man.temperament[4] + man.temperament[5]+5) / 4.0*k;
			break;
			}
		}
	}
	
	public void hello(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("Первый говорит:");
	    say_welcome(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("А второй ему:");
	    say_welcome(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}
	
	public void question_answer(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("Первый говорит:");
	    say_quation(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("А второй ему:");
	    say_answer(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}

	public void phrase(int type_phrase, Human first, Human second, Replica happy[],Replica sad[],Replica kind[],Replica anger[])
	{
		type_phrase=analyzing(first);
	    System.out.println("Первый говорит:");
	    say_phrase(type_phrase,happy,sad,kind,anger);
	    changeStatement(second,type_phrase);
	    type_phrase=analyzing(second);
	    System.out.println("А второй ему:");
	    say_phrase(type_phrase,happy,sad,kind,anger);
	    changeStatement(first,type_phrase);
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		int n=10;
	Human first, second;
	Human temp=new Human(1,2);
	boolean ch=true;
	Scanner inp = new Scanner(System.in);
	first=input(ch,inp);
	ch=false;
	second=input(ch,inp);
	 for(int i=0; i<6; i++)
		 System.out.print(first.temperament[i]);
	 System.out.println();
	 for(int i=0; i<6; i++)
		 System.out.print(second.temperament[i]);
	Replica happy[];
	happy = new Replica[n];
    for(int i=0; i<4; i++)
        happy[i]=new Replica(0,i);
    Replica sad[];
	sad = new Replica[n];
    for(int i=0; i<4; i++)
        sad[i]=new Replica(1,i);
    Replica kind[];
    kind = new Replica[n];
    for(int i=0; i<4; i++)
    	kind[i]=new Replica(2,i);
    Replica anger[];
    anger = new Replica[n];
    for(int i=0; i<4; i++)
    	anger[i]=new Replica(3,i);
    int type_phrase=0;
    temp.hello(type_phrase, first, second,happy,sad,kind,anger);    
    while(first.statement[0]<20&&first.statement[1]<20&&first.statement[2]<20&&first.statement[3]<20||
    		second.statement[0]<20&&second.statement[1]<20&&second.statement[2]<20&&second.statement[3]<20)
    {
    	temp.question_answer(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        temp.phrase(type_phrase, first, second, happy, sad, kind, anger);
        //Thread.sleep(5000);
    }
    int check=-1;
    if(first.statement[0]>20)
    	check=0;
    if(first.statement[1]>20)
    	check=1;
    if(first.statement[2]>20)
    	check=2;
    if(first.statement[3]>20)
       	check=3;
    if(second.statement[0]>20)
    	check=4;
    if(second.statement[1]>20)
    	check=5;
    if(second.statement[2]>20)
    	check=6;
    if(second.statement[3]>20)
       	check=7;
    switch(check)
    {
	    case -1:
	    	System.out.println("Неясно в итоге чем все кончилось.. Будем считать, что все хорошо)");
	    	break;
	    case 0:
	    	System.out.println("В конце концов первый был настолько счастлив, что не выдержал и заявил:");
	    	say_finale(1,happy,sad,kind,anger);
	    	break;
	    case 1:
	    	System.out.println("В конце концов первый ужасно расстроился, и произес:");
	    	say_finale(2,happy,sad,kind,anger);
	    	break;
	    case 2:
	    	System.out.println("В конце концов первый так расчувствовался, что не удержался и как скажет:");
	    	say_finale(3,happy,sad,kind,anger);
	    	break;
	    case 3:
	    	System.out.println("В конце концов первый был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
	    	say_finale(4,happy,sad,kind,anger);
	    	break;
	    case 4:
	    	System.out.println("В конце концов второй был настолько счастлив, что не выдержал и заявил:");
	    	say_finale(1,happy,sad,kind,anger);
	    	break;
	    case 5:
	    	System.out.println("В конце концов второй ужасно расстроился, и произес:");
	    	say_finale(2,happy,sad,kind,anger);
	    	break;
	    case 6:
	    	System.out.println("В конце концов второй так расчувствовался, что не удержался и как скажет:");
	    	say_finale(3,happy,sad,kind,anger);
	    	break;
	    case 7:
	    	System.out.println("В конце концов второй был ужасно зол. Подведя черту, сквозь зубы он проскрежетал:");
	    	say_finale(4,happy,sad,kind,anger);
	    	break;
    	}
	}
}
