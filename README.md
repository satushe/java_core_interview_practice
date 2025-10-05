# java_core_interview_practice
Overview Central Idea: Java Collections Framework (JCF)

1. Overview
Central Idea: Java Collections Framework (JCF)

Purpose: Manage groups of objects efficiently; operations like sorting, searching, iterating

History:

Pre-JDK 1.2: Arrays, Vectors (limitations)

JDK 1.2: Collections Framework introduced

JDK 1.5: Generics added for type safety

2. Core Interfaces
Iterable (root interface for iteration)

Collection (extends Iterable)

List

Set

Queue

Map (separate, does NOT extend Collection)

3. Collection Interfaces Details
List
Ordered, indexed collection

Allows duplicates and nulls

Implementations: ArrayList, LinkedList, Vector, Stack

Performance:

ArrayList: fast retrieval (O(1)), slow insertion/removal middle/start (O(n))

LinkedList: fast insertion/removal (O(1)), slow retrieval (O(n))

Not synchronized by default

Key methods: add, get, set, remove, size

Set
No duplicates; max one null allowed (except TreeSet - no nulls)

Internal backed by HashMap (HashSet, LinkedHashSet, TreeSet)

Ordering depends on implementation:

HashSet: no order

LinkedHashSet: insertion order

TreeSet: sorted order

Not synchronized

Key methods: add, remove, contains, size

Performance: generally O(1), TreeSet O(log n)

Queue
FIFO collection

Allows duplicates, no nulls

Implementations: LinkedList, PriorityQueue, ArrayDeque

Not synchronized by default; concurrent versions available

Key methods: add, offer, poll, peek

Performance:

LinkedList/ArrayDeque: O(1) for insertion/removal

PriorityQueue: O(log n)

Map
Key-value pairs

Keys unique, values can be duplicates

Does not extend Collection

Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable

Null key/values support varies

4. Synchronization & Thread Safety
Legacy synchronized classes: Vector, Stack, Hashtable

Modern unsynchronized by default

Synchronization wrappers: Collections.synchronizedXXX()

Concurrent Collections: ConcurrentHashMap, CopyOnWriteArrayList, etc.

5. Utility Classes
Collections class provides static methods to operate on collections

6. Summary
Use appropriate interfaces and implementations based on:

Ordering needs

Duplication rules

Null support

Synchronization / thread safety

Performance characteristics

