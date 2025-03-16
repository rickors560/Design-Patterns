# Design Patterns

This repository contains implementations of various design patterns in Java. Design patterns are standard solutions to
common software design problems, promoting code reusability, scalability, and maintainability.

## Structural Patterns

- **[Adapter](./src/main/java/org/rick/adapter)** - Converts the interface of a class into another interface clients
  expect, enabling interoperability between incompatible interfaces.
- **[Composite](./src/main/java/org/rick/composite)** - Composes objects into tree structures to represent part-whole
  hierarchies, allowing clients to treat individual and composite objects uniformly.
- **[Decorator](./src/main/java/org/rick/decorator)** - Dynamically adds new functionalities to objects without
  modifying their structure.
- **[Facade](./src/main/java/org/rick/facade)** - Provides a simplified interface to a complex subsystem, making it
  easier to use.
- **[Proxy](./src/main/java/org/rick/proxy)** - Acts as a placeholder or intermediary for another object to control
  access, manage resources, or provide additional functionality.

## Creational Patterns

- **[Factory](./src/main/java/org/rick/factory)** - Provides an interface for creating objects in a superclass but
  allows subclasses to alter the type of objects that will be created.
- **[Singleton](./src/main/java/org/rick/singleton)** - Ensures that a class has only one instance and provides a global
  access point to it.

## Behavioral Patterns

- **[Command](./src/main/java/org/rick/command)** - Encapsulates a request as an object, allowing parameterization of
  clients with requests and support for undoable operations.
- **[Iterator](./src/main/java/org/rick/iterator)** - Provides a way to access elements of a collection sequentially
  without exposing its underlying representation.
- **[Observer](./src/main/java/org/rick/observer)** - Defines a dependency between objects so that when one object
  changes state, all its dependents are notified and updated automatically.
- **[State](./src/main/java/org/rick/state)** - Allows an object to alter its behavior when its internal state changes,
  appearing as if it has changed its class.
- **[Strategy](./src/main/java/org/rick/strategy)** - Defines a family of algorithms, encapsulates each one, and makes
  them interchangeable.
- **[Template](./src/main/java/org/rick/template)** - Defines the skeleton of an algorithm in a superclass but lets
  subclasses override specific steps without changing the overall structure.

---

## Additional Low-Level Design (LLD) Resources

- [Awesome-Low-Level-Design](https://github.com/ashishps1/awesome-low-level-design) - A curated list of LLD resources.
- [kumaransg/LLD](https://github.com/kumaransg/LLD) - GitHub repository with LLD examples and best practices.
- [Interview Prep | Low-Level Design Roadmap](https://medium.com/@sandeep.kumar.ece16/low-level-design-roadmap-7581688d96fa) -
  A detailed roadmap for mastering LLD.
- [LLD Playlist - Gaurav Sen](https://www.youtube.com/playlist?list=PLMCXHnjXnTnvQVh7WsgZ8SurU1O2v_UM7) - YouTube
  playlist covering LLD concepts and system design.
- [LLD Playlist - Shrayansh](https://www.youtube.com/playlist?list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW) - Another YouTube
  playlist explaining LLD topics.
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns/java) - Comprehensive guide on design
  patterns with Java examples.

---

This repository aims to help developers understand and implement design patterns effectively in their projects.

