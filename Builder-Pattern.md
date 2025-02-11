# Builder Pattern

The Builder design pattern is a creational pattern used to construct complex objects step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

## Concept

- **Handles Complex Constructors**: Ideal for classes with complex constructors that require many parameters, especially when some are optional.
- **Large Number of Parameters**: Simplifies the construction of objects with a large number of parameters, avoiding the need for multiple overloaded constructors.
- **Immutability**: Supports immutable objects by setting all properties during object creation, eliminating the need for setters.
- **Examples**: Common implementations include `StringBuilder`, `DocumentBuilder`, and `Locale.Builder`.

## Design

- **Flexibility Over Telescoping Constructor**: Provides a more readable and flexible alternative to telescoping constructors, where multiple constructors are defined with varying numbers of parameters.
- **Static Inner Class**: Typically uses a static inner builder class to encapsulate the construction process, keeping the main class cleaner and more focused on its core functionality.
- **Call Appropriate Constructor**: The builder class can handle the selection and validation of appropriate constructors, simplifying the client code.
- **Negates the Need for Exposed Setters**: Eliminates the need for public setters, promoting immutability and encapsulation by setting fields via the builder only.
- **Generics Support**: Can leverage generics to provide type-safe and flexible builders, particularly useful in hierarchies or when extending the builder pattern for related classes.
