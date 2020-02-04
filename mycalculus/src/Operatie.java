

public class Operatie {
	
	public float calculate(Numar nr) {
	float rez=0;
	if(nr.op=='+') {
		return nr.nr1+nr.nr2;
	}
		
		
	else if(nr.op=='-')
		rez=nr.nr1-nr.nr2;
	else if(nr.op=='*')
		rez=nr.nr1*nr.nr2;
	else if(nr.op=='/')
		rez=(float)nr.nr1/nr.nr2;

	return rez;

}
}
