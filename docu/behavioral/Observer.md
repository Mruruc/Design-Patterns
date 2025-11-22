# Observer (Event-Subscriber, Listener)

Observer is a behavioral design pattern that lets you define ``a subscription mechanism`` to notify
multiple objects about any events that happen to ``the object they are observing``.

[Refactoring Guru](https://refactoring.guru/design-patterns/observer)

* The object that has some state is often called ``subject``,
* since its also going to notify other object about the changes to its state,usually called ``publisher``.
* All other objects that want to track changes to the   ```publisher's state``` are called ``subcriber``.

````text
The Observer pattern suggests that you add a subscription mechanism 
to the publisher class so individual objects can subscribe to or unsubscribe from a stream of events coming that publisher.
````