package temperament;

interface Welcome {
	 final static String sentence_happy[] = { " - Приветик! ", " - Привет, солнце! ", " - Как я рад тебя видеть! ", " - Аллоха! " };
	  final static String sentence_sad[] = { " - привет...", " - Здрастье..", " - Хай..", " - Дарова.." };
	  final static String sentence_kind[] = { " - Какооой сегодня дееень..я вижу вновь теебяяя... Здравствуйте, мы начинаем)", " - Привет-привет!"," - Здароооовааа! ", " - Бобра тебе!" };
	  final static String sentence_anger[] = { " - Ну неужели ты пришел!", " - Откуда ты взялся, черт возьми"," - Опять ты тут..!", " - Никуда от вас не деться.." };
}

interface Phrase {
		final static String sentence_happy[] = { " - А  у нас в квартире газ!)", " - Оооооберниииись, ты красивее со спины) ", " - Щаас скажу!... ой, не скажу - забыл ", " - А у меня дочка родилась!!" };
		final static String sentence_sad[] = { " - Поверь мне, не в пирогах счастье", " - О, я самый больной в мире человек", " - Женщины.. она такие женщины", " - Как безумен этот мир.. на земле столько красивого, а мы тратим кучу времени на то чтоб виртуальный мир был как можно более реалистичным" };
		final static String sentence_kind[] = { " - Я тучка, тучка, тучка, я вовсе не медведь", " - С ума поодиночке не сходят. Это только гриппом все вместе болеют)", " - Поздравляю тебя, Шарик! ты балбес!)", " - Я мужчина хоть куда! в полном расцвете сил"};
		final static String sentence_anger[] = { "- Как же ты меня уже задрал", "- Сил нет больше тебя терпеть!","- Давай говори что надо и проваливай", "- Нет у меня времени на твои глупости"};
		
}

interface Quation {
	 final static String sentence_happy[] = { " - Я получил сегодня з/п! подешь со мной отмечать?)", " - Я сегодня выступаю в школе, будешь вторым клоуном?) ", "А ты сегодня бухал?) ", "Гаити! а вы были на Гаити?" };
	   final static String sentence_sad[] = { " - Есть что поесть..? кууушат ахота..", " - А давай бояться вместе,а?", " - Малыш, ведь я же лучше? ..лучше собаки?а?", " - Или может обратиться к врачу?" };
	   final static String sentence_kind[] = { " - Говорят, вас счатья привало?", "это что, сказка такая?"," - Там еще осталось немножечко варенья?", " - Чебурашка, Чебурашка, где ты?.." };
	   final static String sentence_anger[] = { " - Тебе еще не надоело чушь нести?", " - Может хватит уже?"," - Совсем придурок? ", " - А не пойти бы тебе..? сам знаешь куда."};
}

interface Answer {
	    final static String sentence_happy[] = { "- Отличная идея!)", "- Let's go ", "- Ты черотвски прав! ", " - Лучше и придумать невозможно) " };
	    final static String sentence_sad[] = { "- Ну может не сегодня...", "- вряд ли.., я не лежал еще сегодня на диване", "- ну... когда-нибудь ", "- ты уверен что это неоходимо? " };
	    final static String sentence_kind[] = { "- я помогу тебе, друг!", "- быть или не быть..? пожалуй быть! ","- ну как же без меня в таком деле? я с тобой) ", "- я обещал своей черепашке, что больше не буду с тобой общаться.. и то что она умерла ВСЕГО ЛИШЬ 5 лет назад должно меня остановить.. но я не брошу тебя, товарищщ" };
	    final static String sentence_anger[] = { "- Я тебя конечно удивлю.. но не пошел бы ты с такими вопросами!", "- Что за тупые вопросы?","- Пошел ты, ублюдок", "- Да ты ли не охренел мне такое предлагать?"};
}

interface Finale {
		   final static String sentence_happy[] = { " - Обнимааашки!!!", " - А  пошли на карусели! ", " - А теперь! все танцуют босиком на песке..)) тыц-тыц-тыц ", " - А сейчас песня!!  Ага, а мы гуляем, мы крутые,Ага, а мы хорошие, не злые, Ага, когда проснёмся - будет вечер, Будут выходные" };
		   final static String sentence_sad[] = { " - Я хочу остаться один", " - А в чем он, смысл жизни..?", " - Дождь, сегодня будет дождь? Я хочу спрятать свои слезы", " - А птичку-то жалко..." };
		   final static String sentence_kind[] = { " - До скорого, братюнь, мне пора идти", " - А... может сегодня ко мне..?;)  "," - Дай я тебя поцелую!!! ", " - Добра, Бобра тебе, человек" };
		   final static String sentence_anger[] = { " - Да я тебя сейчас ушатаю!", " - Шоп ты сдох!"," - Гореть тебе в аду, придурок", " - А ну иди сюда, козел!"};
}

// 0радость 1грусть 2доброта 3злость 4голод

public class Replica implements Welcome, Phrase, Quation, Answer, Finale {
	String welcome,phrase,quation,answer,finale;
	Replica(int i,int j)
	{
		switch(i)
		{
		case 0:
			welcome=Welcome.sentence_happy[j];
			break;
		case 1:
			welcome=Welcome.sentence_sad[j];
			break;
		case 2:
			welcome=Welcome.sentence_kind[j];
			break;
		case 3:
			welcome=Welcome.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			phrase=Phrase.sentence_happy[j];
			break;
		case 1:
			phrase=Phrase.sentence_sad[j];
			break;
		case 2:
			phrase=Phrase.sentence_kind[j];
			break;
		case 3:
			phrase=Phrase.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			quation=Quation.sentence_happy[j];
			break;
		case 1:
			quation=Quation.sentence_sad[j];
			break;
		case 2:
			quation=Quation.sentence_kind[j];
			break;
		case 3:
			quation=Quation.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			answer=Answer.sentence_happy[j];
			break;
		case 1:
			answer=Answer.sentence_sad[j];
			break;
		case 2:
			answer=Answer.sentence_kind[j];
			break;
		case 3:
			answer=Answer.sentence_anger[j];
			break;
		}
		switch(i)
		{
		case 0:
			finale=Finale.sentence_happy[j];
			break;
		case 1:
			finale=Finale.sentence_sad[j];
			break;
		case 2:
			finale=Finale.sentence_kind[j];
			break;
		case 3:
			finale=Finale.sentence_anger[j];
			break;
		}
	}
	
	/*public void sayPhrase(int type) {
		System.out.println(Phrase.sentence[type - 1]);
	}

	public void sayQuation(int type) {
		System.out.println(Quation.sentence[type - 1]);
	}

	public void sayAnswer(int type) {
		System.out.println(Answer.sentence[type - 1]);
	}

	public void sayFinale(int type) {
		System.out.println(Finale.sentence[type - 1]);
	}*/

}
