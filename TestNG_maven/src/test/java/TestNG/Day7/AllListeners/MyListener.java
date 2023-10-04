package TestNG.Day7.AllListeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {
    int counter=3;

    @Override
    public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod) {
        if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
            System.out.println("Changing invocation for the following method: " + testMethod.getName());
            testAnnotation.setInvocationCount(counter);

        }
    }
    @Override
    public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
    }

    @Override
    public void transform(IDataProviderAnnotation annotation, Method method) {
        IAnnotationTransformer.super.transform(annotation, method);
    }

    @Override
    public void transform(IFactoryAnnotation annotation, Method method) {
        IAnnotationTransformer.super.transform(annotation, method);
    }

    @Override
    public void transform(IListenersAnnotation annotation, Class<?> testClass) {
        IAnnotationTransformer.super.transform(annotation, testClass);
    }
}
