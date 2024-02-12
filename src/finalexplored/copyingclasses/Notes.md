# Defensive Copies as input

When you pass mutable types to an immutable object, a defensive copy
should be made.

The defensive copy should then be assigned to the instance field.

When you retrieve data, you should first make a defensive copy,
and paste the defensive copy back to the calling code.

## What's a copy? Shallow Copy vs Deep Copy

A shallow copy only makes a copy of the structure, and not a copy of the
elements in the structure.

A deep copy makes a copy of both the structure, and copies of each
element in that structure.

## Shallow Copy

When you use copy methods on interfaces and helper classes, the copy
that's made will probably be a shallow copy.

A shallow copy of an array, means a new array structure is created, with
the same number of indexed positions.

Each indexed position is assigned the same value that was in the previous
array, at that same position.

A copy of the referenced element isn't made.

You can see in this diagram, that both arrays, have indexed references,
pointing to the same set of instances in memory.

## Deep Copy

Deep copies usually have to be manually implemented if you need it.

Deep copies may need to be applied to arrays and collections, as well as
composite classes, to ensure immutability.

## Shallow Copy vs Deep Copy of a composite object

A class can be composed of other classes, meaning its fields are instances
of classes.

When you clone or copy this type of object, you may also need to copy or
clone the class's more complex fields.