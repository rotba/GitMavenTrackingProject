/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 02 13:32:04 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Main main0 = new Main();
      int int0 = main0.foo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Main main0 = new Main();
      main0.doo();
      assertEquals(0, main0.foo());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Main main0 = new Main();
      main0.goo();
      assertEquals(0, main0.foo());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Main main0 = new Main();
      main0.boo();
      assertEquals(0, main0.foo());
  }
}
