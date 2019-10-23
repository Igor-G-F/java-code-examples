package code.examples.generics;

class GenericClass<T> {

    private T type;

    GenericClass(T type) {
        this.type = type;
    }

    void use() {
        System.out.println(
                "This " + this.getClass().getName() + " class holds a " + type.getClass().getSimpleName() +
                " that has a value of " + type.toString());
    }

    static <U> void genericMethod(U type) throws NoSuchMethodException {
        System.out.println(
                "This " + GenericClass.class.getDeclaredMethod("use") + " method holds a " + type.getClass().getSimpleName() +
                " that has a value of " + type.toString());
    }

    static <U> void forcedTypeStaticMethodDemo(GenericClass<U> genericClass) {
        System.out.println("Using static method that forces a type "+genericClass.toString()+" as param.");
    }

    void forcedTypeInstanceMethodDemo(GenericClass<T> genericClass) {
        System.out.println("Using method that forces a type from class "+genericClass.toString()+" as param.");
    }
}
