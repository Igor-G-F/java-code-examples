## Generics naming convention
By default these are single, uppercase letters. 
- E - Element (used extensively by the Java Collections Framework)
- K - Key
- N - Number
- T - Type
- V - Value
- S,U,V etc. - 2nd, 3rd, 4th types

## Rules
- In generic code, the question mark (?), called the wildcard, represents an unknown type. 
- The wildcard can be used in a variety of situations: as the type of a parameter, field, or local variable; sometimes as a return type (though it is better programming practice to be more specific). 
- The wildcard is never used as a type argument for a generic method invocation, a generic class instance creation, or a supertype.
- In generics "extends", upper bound, binds to extends and implements(children of a class).
- In generics "super", lower bound, binds to any parents of a class.