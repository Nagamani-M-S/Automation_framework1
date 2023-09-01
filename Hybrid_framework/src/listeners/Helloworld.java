package listeners;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Helloworld {
@Test
public void test1()
{
	System.out.println("hello bangalore");
}
@Test
public void test2()
{
	System.out.println("hello india");
	Assert.fail();
}
@Test(dependsOnMethods = "test2")
public void test3()
{
	System.out.println("hello asia");
}
//
//
}
