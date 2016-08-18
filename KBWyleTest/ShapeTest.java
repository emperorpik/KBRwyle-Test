import org.junit.Test;
import junit.framework.TestCase;

public class ShapeTest extends TestCase 
{

	@Test
	public void testTriangle() 
	{
		Triangle t = new Triangle(3,4,5);
		
		assertEquals(12.0, t.getPerimeter());
		assertEquals(6.0, t.getArea());
	}
	
	@Test
	public void testCircle()
	{
		Circle s = new Circle(5);
		
		assertEquals(31.42, s.getPerimeter(), .1); //Relatively exact approximation for answer
		assertEquals(78.54, s.getArea(), .1);
	}
	
	@Test
	public void testRectangle()
	{
		Rectangle r = new Rectangle (5,10);
		
		assertEquals(30.0, r.getPerimeter());
		assertEquals(50.0, r.getArea());
	}
	
	@Test
	public void testSquare()
	{
		Square sq = new Square(7.0);
		
		assertEquals(28.0, sq.getPerimeter());
		assertEquals(49.0, sq.getArea());
	}
	
	@Test
	public void testEllipse()
	{
		Ellipse e = new Ellipse(10, 5);
		
		assertEquals(48.44, e.getPerimeter(), 2); //approximation (about 5% tolerance)
		assertEquals(157.08, e.getArea(), .1);
	}

	@Test
	public void testQuadrilateral()
	{
		Quadrilateral q = new Quadrilateral(5, 5, 5, 5, 1.5708, 1.5708);
		
		assertEquals(20, q.getPerimeter(), 2);
		assertEquals(25, q.getArea(), 5); //Mildly imprecise approximation for answer
	}
}
