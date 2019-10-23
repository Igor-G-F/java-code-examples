package code.examples.generics;

class BoundedGenericClass<T extends Number> {

    private T type;

    BoundedGenericClass(T type) {
        this.type = type;
    }

    void use() {
        System.out.println(
                "This " + this.getClass().getSimpleName() + " class holds a " + type.getClass().getSimpleName() +
                " that has a value of " + type.toString() + ". It will only accept constructors that extend the Number class.");
    }

    static <U extends Number> void boundedGenericMethod(U type) throws NoSuchMethodException {
        System.out.println(
                "This " + BoundedGenericClass.class.getDeclaredMethod("use") + " method holds a " + type.getClass().getSimpleName() +
                " that has a value of " + type.toString() + ". It will only accept params that extend the Number class.");
    }
}
