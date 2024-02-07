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

