# Visitor Pattern

The Visitor pattern is a behavioral pattern that allows us to add new operations
to objects without changing their classes.
It achieves this by separating the algorithm from objects it operates on, using 
a `Visitor` class to define the new operations. 

### Advantages:
    - It is useful when we have a stable object structure but need to frequesntly add new operations.
    - Keeps new operations separate from the object structure.
    - Enables the `Open/Closed` principle : Add new operations without modifying existing classes.