# The Map Interface

A map in the collections framework is another data structure.

Although it's still a grouping of elements, it's different, because
elements are stored with keyed references.

This means a Map requires two type arguments, for example:

```java
interface Map<K, V>
```

The Map has K for its key type, and V for the value type.

As with any generic classes, the only restriction on these types is,
they must be reference types and not primitives.

## Map characteristics

A Java Map can't contain duplicate keys.

Each key can only map to a single value.

Three of the Java classes that implement the map interface are the
**HashMap**, the **LinkedHashMap**, and the **TreeMap**.

The HashMap is unordered, the LinkedHashMap is ordered by insertion order,
and the TreeMap is a sorted map.

## The View

The view, or view collection as Java calls it, doesn't store elements,
but depends on a backing collection that stores the data elements.

They let us manipulate the collections, without really having to know
exact details, about the storage of the data.