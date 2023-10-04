package TestNG.Day7;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNgListenersDemo implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println(result.getName());
    }


    public  void onTestSuccess(ITestResult result) {
        System.out.println(result.getName());
    }

  
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName());
    }

    
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName());
    }





    
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(result);
    }

   
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
        System.out.println(result);
    }

    public void onStart(ITestContext context) {
        System.out.println(context.getName());

    }

    
    public void onFinish(ITestContext context) {
        System.out.println(context);

    }

    public static void main(String[] args) {
       ITestResult result;

    }

}
