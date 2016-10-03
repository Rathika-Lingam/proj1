import java.lang.String;
class ElectronicDevice
{
	public void on()
	{
	System.out.println("Switch on the device");
	}

	public void off()
	{
	System.out.println("Switch off the device");
	}
}


class Radio extends ElectronicDevice
{
	public void play()
	{
	System.out.println("Play the song");
	}
	public void off()
	{
	System.out.println("stop music");
	}
}


class Tv extends Radio
{
	public void off()
	{
	System.out.println("stop movie");
	}
}
class Casting
{
public static void main(String args[])
{
ElectronicDevice e=new Radio();
e.off();
e=new Tv();
e.off();
Radio r=(Radio)e;
r.play();
ElectronicDevice m=(ElectronicDevice)e;
m.on();
}
}

	
