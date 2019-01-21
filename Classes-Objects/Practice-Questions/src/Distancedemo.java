class Distance
{
	float feet,feet1;
	float inch,inch1;
	Distance()
	{
		System.out.println("");
	}
	Distance(float feet,float feet1,float inch,float inch1)
	{
		this.feet=feet;
		this.inch=inch;
		this.feet1=feet1;
		this.inch1=inch1;
	}
	public float getfeet()
	{
		return feet;
	}
	public float getinch()
	{
		return inch;
	}
	public float getfeet1()
	{
		return feet1;
	}
	public float getinch1()
	{
		return inch1;
	}
	public void set(float feet,float inch)
	{
		this.feet=feet;
		this.inch=inch;
	}
	public void set(float feet,float inch,float feet1,float inch1)
	{
        this.feet=feet;
        this.inch=inch;
        this.feet1=feet1;
        this.inch1=inch1;
	}
	public void sum(Distance D)
	{
		float fsum,isum;
		fsum=getfeet()+D.getfeet1();
		isum=getinch()+D.getinch1();
		System.out.println(fsum+" "+isum);
	}
}
class Distancedemo
{
	public static void main(String args[])
	{
	Distance D1=new Distance();
	Distance D2=new Distance();
    D1.set(5,6,7,8);
    D2.set(9,10,11,12);
    D1.sum(D2);
    }
}