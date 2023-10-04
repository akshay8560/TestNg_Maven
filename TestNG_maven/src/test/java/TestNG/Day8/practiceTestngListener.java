package TestNG.Day8;



// 8 types testng listener

import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//1. IAnnotationTransformer
//2. IExecutionListener
//3. IHookable
//4. IInvokedMethodListener
//5. IMethodInterceptor
//6. IReporter
//7. ISuiteListener
//8. ITestListener


/*@Listeners(ItestlistenerDemo.class)*/
public class practiceTestngListener  {




    //1. ITestListener
    //there are two method we can extend by class or add listener into testng
@Test
void TestMethod1(){
    System.out.println("TestMethod1");
}
@Test
void TestMethod2(){
    System.out.println("TestMethod2");
}


}
