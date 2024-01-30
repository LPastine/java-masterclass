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


