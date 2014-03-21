package dialogs;

interface Welcome {
	final static String sentence[] = { "�������!", "������, ������",
			" ������������", "������� ����������, ������� ���." };
}

interface Phrase {
	final static String sentence[] = { "�����1", "�����2", "�����3", "�����4" };
}

interface Quation {
	final static String sentence[] = { "��� ��1", "��� ��2", "��� ��3",
			"��� ��4" };
}

interface Answer {
	final static String sentence[] = { "������1", "������2", "������3",
			"������4" };
}

interface Finale {
	final static String sentence[] = { "����1", "����2", "����3", "����4" };
}

// 0������� 1������ 2������� 3������ 4�����

class Replica implements Welcome, Phrase, Quation, Answer, Finale {

	public Human changeStatement(Human man, int type) {
		switch (type) { // ����� ����� �������� ��������� ������ � ��������� ��
						// ��������� �������
		case 1: {
			man.statement[0] += (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * 3) / 10;
			man.statement[1] -= (man.temperament[0] * man.temperament[2]
					* man.temperament[4] * 3) / 10;
			man.statement[2] += (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			man.statement[3] -= (man.temperament[0] * man.temperament[3]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			break;
		}
		case 2: {
			man.statement[0] -= (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * 3) / 10;
			man.statement[1] += (man.temperament[0] * man.temperament[2]
					* man.temperament[4] * 3) / 10;
			man.statement[2] -= (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			man.statement[3] += (man.temperament[0] * man.temperament[3]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			break;
		}
		case 3: {
			man.statement[0] += (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * 2) / 10;
			man.statement[1] -= (man.temperament[0] * man.temperament[2]
					* man.temperament[4] * 2) / 10;
			man.statement[2] += (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			man.statement[3] -= (man.temperament[0] * man.temperament[3]
					* man.temperament[4] * man.temperament[5] * 1) / 10;
			break;
		}
		case 4: {
			man.statement[0] -= (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * 2) / 10;
			man.statement[1] += (man.temperament[0] * man.temperament[2]
					* man.temperament[4] * 2) / 10;
			man.statement[2] -= (man.temperament[0] * man.temperament[1]
					* man.temperament[4] * man.temperament[5] * 3) / 10;
			man.statement[3] += (man.temperament[0] * man.temperament[3]
					* man.temperament[4] * man.temperament[5] * 3) / 10;
			break;
		}
		}
		return man;
	}

	public void sayWelcome(int type) {
		System.out.println(Welcome.sentence[type - 1]);
	}

	public void sayPhrase(int type) {
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
	}

}