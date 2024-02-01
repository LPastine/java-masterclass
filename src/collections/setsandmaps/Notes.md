# The Set

- A Set is not implicitly ordered.
- A Set contains no duplicates.
- A Set may contain a single null element.
- Sets can be useful because operations on them are very fast.

The Set interface defines the basic methods add, remove and clear,
to maintain the items in the set.

We can also check if a specific item is in the set using the contains
method.

Interestingly enough, there's no way to retrieve an item from a set.

You can check if something exists, using **contains**, and you can iterate
over all the elements in the set, but attempting to get the 10th element,
for example, from a set isn't possible, with a single method.

# The HashSet class

The best-performing implementation of the Set interface is the HashSet class.

This class uses hashing mechanisms to store the items.

Oracle describes this class as offering constant time performance for
the basic operations (add, remove, contains and size).

Constant time has the Big O Notation O(1).

# Ordered Sets

If you need and ordered Set, you'll want to consider either the
**LinkedHashSet** or the **TreeSet**.

A LinkedHashSet maintains the insertion order of the elements.

The TreeSet is a sorted collection, sorted by the natural order of the
elements, or by specifying the sort during the creation of the set.

# The Linked HashSet

The LinkedHashSet **extends the HashSet** class.

It maintains relationships between elements with the use of a doubly
linked list between entries.

The **iteration order** is therefore the same as the **insertion order**
of the elements, meaning the order is **predictable**.

All the methods for the LinkedHashSet are the same as those for the HashSet.

Like HashSet, it provides constant-time performance, O(1), for the add,
contains and remove operations.

# TreeSet

A TreeSet's class, uses a data structure that's a derivative of what's
called a binary search tree, or Btree for short, which is based on the
concept and efficiencies of the binary search.

This search iteratively tests the mid range of a group of elements to
be searched, to quickly find its element, in a collection.

As elements are added to a TreeSet, they're organized in the form of a tree,
where the top of the three represents that mid point of the elements.

Further binary divisions become nodes under that.

The **left** node and its children are elements that are **less than**
the parent node.

The **right** node and its children are elements that are **greater than**
the parent node.

Instead of looking through all the elements in the collection to locate
a match, this allows the tree to be quickly traversed, each node a simple
decision point.

The main point is the tree remains balanced as elements are added.

## TreeSet O Notation

You'll remember that O(1) is constant time, meaning the time or cost
of an operation doesn't change, regardless of how many elements are
processed.

O(n) is linear time, meaning it grows in line with the way the collection
grows.

Another annotation, is O(log(n)), which means the cost falls somewhere
in between constant and linear time.

The TreeSet promises O(log(n)) for the add, remove, and contains operations,
compared to the HashSet which has constant time O(1) for those same
operations.

## The TreeSet interface hierarchy

A TreeSet can be declared or passed to arguments typed with any of the
following interfaces:

- SortedSet: This class is sorted, and implements the SortedSet interface,
which has such methods as first, last, headSet, and tailSet, and
comparator.
- NavigableSet: This set also implements the NavigableSet interface, so
it has methods such as ceiling, floor, higher, lower, descendingSet
and others.

## The TreeSet relies on Comparable or Comparator methods

Elements which implement Comparable (said to have a natural order sort,
like Strings and numbers) can be elements of a TreeSet.

If your elements don't implement Comparable, you must pass a Comparator
to the constructor.
