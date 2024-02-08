# Mutable vs Immutable

Objects have state, which is the data stored in instance fields.

State can change after an objects is created, either intentionally or
unintentionally.

When state remains constant throughout the lifetime of the object, and
code is prevented from changing the state, this object is called
an immutable object.

An immutable object is an object whose internal state remains constant.

A mutable object is an object whose internal state does not remain constant.

## Immutable Objects - Advantages

An immutable object isn't subject to unwanted, unplanned and unintended
modifications, known as side-effects.

An immutable class is inherently thread-safe, because no threads at all
can change it, once it's been constructed.

This allows us to use more efficient collections and operations, which
don't have to manage synchronization of access to this object.

## Immutable Objects - Disadvantages

Am immutable object can't be modified after it's been created.

This means that when a new value is needed, you're probably going to
need to make a copy of the object with the new value.

If you're constantly needing to alter text values, it's more efficient
to use a mutable object like a StringBuilder instance, than generating
tons of new String objects.

## Classes must be designed to produce Immutable Objects

It's important to understand that POJOs and Java Beans, which many code
generation tools create, are not by design, immutable, and therefore,
this architecture may not be the preferred design for your class.

# The final modifier in Java

When we use the final modifier, we prevent any further modifications to
that component.

<ul>
    <li>A final method means it can't be overridden by a subclass</li>
    <li>A final field means an object's field can't be reassigned,
or given a different value, after the class's initialization process.</li>
    <li>A final static field is a class field that can't be reassigned,
or given a different value, after the class's initialization process.
A field declared on an Interface is always public, static and final</li>
    <li>A final class can't be overridden, meaning no class can use
it, in the extends clause</li>
    <li>A final variable, in a block of code, means that once it's
assigned a value, any remaining code in the block can't change it</li>
    <li>A final method parameter means, we can't assign a different
value to that parameter in the method code block</li>
</ul>

## Using the final modifier on methods

You can use the final modifier on methods.

Using final with methods only makes sense in the context of wanting to
restrict what your subclasses can override or hide.

Using final on and **instance** method means subclasses can't **override**
it.

Using final on an **class** (static) method means subclasses can't 
**hide** it.

## Using final for variables

It's important to understand, when you use final, it doesn't mean the
variable is immutable at that point.

It means you can't assign or reassign a new instance, or variable or
expression to it, after the initialization.

If you use final for a local variable in a code block, you can only
initialize it fully, or assign it a value, just once.

Any other additional assignments will result in a compiler error. 

If you use final for method parameters, this means you cannot assign any
values to the method parameters in the code.

## Controlling Change

Java provides mechanisms to control changes, and extensibility of your
code, at many different levels.

You can prevent:
- Changes to data in Instance fields, which is called the state of the object by not allowing clients or subclasses to have access to these fields.
- Changes to methods, by not allowing code to override or hide existing functionality
- Your classes from being extended
- Instantiation of your classes

# Immutable Object

An immutable object doesn't change state, once it's created.

An immutable object is a secure object, meaning calling code can't
maliciously or mistakenly alter it.

An immutable object simplifies concurrency design.

## Strategies for Declaring a Class, to produce immutable objects

Strategies:

- Make instance fields private and final
- Do not define any setter methods
- Create defensive copies in any getters
- Use a constructor or factory method to set data, making copies of mutable reference data
- Mark the class final, or make all constructors private