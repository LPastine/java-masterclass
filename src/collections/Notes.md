# Collections

## A Collection

A **collection** is just an object that represents a group of objects.

In general, the group of objects have some relationship to each other.

Computer Science has common names, and an expected set of behavior,
for different types of collection objects.

Collection objects, in various languages, include arrays, lists, vectors,
sets, queues, tables, dictionaries, and maps.

These are differentiated by the way they store the objects in memory,
how objects are retrieved and ordered, and whether nulls and duplicate
entries are permitted.

Oracle's Java documentation describes it's collections framework as:

"A unified architecture for representing and manipulating collections,
enabling collections to be manipulated independently of implementation
details."

## The List

A List is an ordered collection also known as a sequence.

These can be sequenced in memory like an ArrayList, or maintain links to
the next an previous values, as a LinkedList.

## The Queue

A Queue is a collection designed for holding elements prior to processing,
in other words the processing order matters, so the first and last
positions, or the head and tail, are prioritized.

Most often these may be implemented as First In, First Out (FIFO), but
can be implemented like a Stack, as Last In First Out (LIFO) which
we've discussed.

## The Set

A Set is a collection conceptually based off of a mathematical set.

Importantly, it contains no duplicate elements, and isn't naturally ordered
or sequenced.

Java has three implementations, the HashSet, the TreeSet and the
LinkedHashSet.

These are distinguished by the underlying way they store the elements
in the set.

A Sorted Set is a set that provides a total ordering of the elements.

## The Map

A Map is a collection that stores key and value pairs.

The keys are a set, and the values are a separate collection,
where the key keeps a reference to a value.

Keys need to be unique but values don't.

Elements in a tree are sorted in a key value Node, also called an Entry.
