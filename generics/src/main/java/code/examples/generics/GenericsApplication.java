package code.examples.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericsApplication {

    public static void main(String[] args) throws NoSuchMethodException {

        // Basic generics
        GenericClass<Integer> integerGenericClass = new GenericClass<>(5);
        integerGenericClass.use();
        integerGenericClass.forcedTypeInstanceMethodDemo(integerGenericClass);
        GenericClass<String> stringGenericClass = new GenericClass<>("lol");
        stringGenericClass.use();
        GenericClass.forcedTypeStaticMethodDemo(stringGenericClass);
        GenericClass<Number> numberGenericClass = new GenericClass<>(1);
        GenericClass.genericMethod(50);
        GenericClass.genericMethod("wow");

        // Bounded Generics
        BoundedGenericClass<Long> boundedGenericClass = new BoundedGenericClass<>(1L);
        boundedGenericClass.use();
        BoundedGenericClass.boundedGenericMethod(1000.50F);
        BoundedGenericClass.boundedGenericMethod(6);

        // Wildcard
        WildcardDemoClass.wildcardParamDemo(integerGenericClass);
        WildcardDemoClass.wildcardParamDemo(stringGenericClass);
        WildcardDemoClass.upperBoundWildcardParamDemo(integerGenericClass);
        WildcardDemoClass.lowerBoundWildcardParamDemo(numberGenericClass);
        List<Integer> integerList = new ArrayList<>();
        List<? extends Number> numberArrayListWildcardUpper = integerList;
        List<Number> numberList = new ArrayList<>();
        List<? super Integer> integerArrayListWildcardLower = numberList;
    }
}
