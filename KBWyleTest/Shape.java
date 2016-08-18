
public interface Shape 
{
	public double getArea();
	public double getPerimeter();

}


class Triangle implements Shape
{
	private double sideA;
	private double sideB;
	private double base;
	Triangle(double side1, double side2, double b)
	{
		sideA = side1;
		sideB = side2;
		base = b;
	}
	
	//uses heron's law
	public double getArea()
	{
		double sp = this.getPerimeter()/2;  //semiperimeter
		return Math.sqrt(sp * (sp - sideA) * (sp - sideB) * (sp - base));
	}
	
	public double getPerimeter()
	{
		return sideA + sideB + base;
	}
}

class Circle implements Shape
{
	private double radius;
	
	Circle(double r)
	{
		radius = r;
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter()
	{
		return Math.PI * 2 * radius;
	}
}

class Rectangle implements Shape
{
	private double length;
	private double width;
	
	Rectangle (double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return (2 * length) + (2 * width);
	}
}

class Square implements Shape
{
	private double side;
	
	Square(double s)
	{
		side = s;
	}
	public double getArea()
	{
		return Math.pow(side, 2);
	}
	
	public double getPerimeter()
	{
		return 4 * side;
	}
}

class Ellipse implements Shape
{
	private double major;
	private double minor;
	
	Ellipse(double a, double b)
	{
		major = a;
		minor = b;
	}
	
	public double getArea()
	{
		return Math.PI * major * minor;
	}
	
	//approximation, accurate with 5% tolerance most of the time
	public double getPerimeter()
	{
		return 2 * Math.PI * Math.sqrt( ((Math.pow(major, 2) + Math.pow(minor, 2))/2 ));
	}
}

class Quadrilateral implements Shape
{
	public double sideA;
	public double sideB;
	public double sideC;
	public double sideD;
	public double angleAB; //radians
	public double angleCD; //radians
	
	Quadrilateral(double a, double b, double c, double d, double ab, double cd)
	{
		sideA = a;
		sideB = b;
		sideC = c;
		sideD = d;
		angleAB = ab;
		angleCD = cd;
	}
	public double getArea()
	{
		double sp = this.getPerimeter()/2;
		//Bretschneider's formula
		return Math.sqrt((sp - sideA) * (sp -sideB) * (sp -sideC) * (sp -sideD) - (sideA * sideB * sideC * sideD * Math.pow(Math.cos(angleAB + angleCD)/2, 2)));
	}
	
	public double getPerimeter()
	{
		return sideA + sideB + sideC + sideD;
	}
}


