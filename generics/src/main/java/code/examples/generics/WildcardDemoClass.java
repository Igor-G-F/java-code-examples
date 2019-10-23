package code.examples.generics;

class WildcardDemoClass {
    //parameter, field, or local variable

    static void wildcardParamDemo(GenericClass<?> genericClass) {
        System.out.println("Using wildcard to accept "+genericClass.toString()+" as param.");
    }

    static void upperBoundWildcardParamDemo(GenericClass<? extends Number> genericClass) {
        System.out.println("Using upper bounded wildcard to accept "+genericClass.toString()+" as param.");
    }

    static void lowerBoundWildcardParamDemo(GenericClass<? super Integer> genericClass) {
        System.out.println("Using lower bounded wildcard to accept "+genericClass.toString()+" as param.");
    }

}
