# Collections

### Home task

In this task you needs to implements methods according to the task description next to the method.
This task should be implemented without Java 8 Stream API and lambdas.


##### List

1. Generates the list of integer numbers from 1 to X inclusive.
2. Remove duplicates from the collection.
3. Find a minimum element in the collection of `LocalDate`.
4. Create a new list using elements from even position in the source collection.
5. Create a new list of strings using only strings that represents the integer numbers.
6. Having the list of strings, sort it by string length in descending order.
7. Shuffle the list.
8. Check that given list of strings is sorted alphabetically ignoring the case (apple, BANANA, Cherries, DuRiAn).
9. Check that given list of integers doesn't contain the negative numbers.
10. Having the string that consists of the following symbols `(`, `)`, `[`, `]`, `{`, `}`, check correctness of the parenthesis pairing (each open parenthesis should have closed equivalent),
if each of the parenthesis are paired return `true` otherwise `false`. Parenthesis symbols should be paired (if unpaired - sequencce is incorrect) and the pairs can be nested inside another pair, each inner pair should be closed before the outer pair is closed. Correct example: `({}[]([]){{}[]})`. Incorrect example: `({)}[]`

##### Map

1. Create a Map using the varargs (key, value, key, value, ...). If the varargs length is odd then throw IllegalArgumentException with the description of the cause of the exception and the length of varargs.
2. Generate `Map<Month, Integer>`, using month names as a Map keys and the length of the month name for the current month as a corresponding value of this key.
3. Please use `java.time.Month` enum. Example result: `{MAY=3, SEPTEMBER=9, JUNE=4, APRIL=5, AUGUST=6, ...`
4. Create a new Map from the source Map the eay that keys and values are swaped places. In case when keys are duplicated (when source Map have two or more identical values that is about to become keys in the new Map)
   for this case throw IllegalArgumentException and add some discent description of the cause of the exception - for example: duplicated key.
5. Having the list of elements, count the number of duplicated elements in this list. The method should return the `Map<K, Integer>`, where K —
   is an element of that list, and Integer — is a number of copies of the current element in the list. The elements that do not contains duplicates should not get to the result Map. Элементы, которые встречаются только 1
6. Having the `List<Map<String, String>>` create a list of all of the values that contains in all of the Maps of the original list of Maps. Sort the result list by the length of the string element and if two elements have the same length, sort them alphabetically.

##### Custom implementation

Create a class DynamicArray, which is like an equivalent of the List. The DynamicArray class should be backed by the array of generic elements of T. 
You need to created no-args constructor (in this case the length of the backed array is 10), also to create a constructor with initial length input parameter
 and a constructor with varargs to initialise the backed array. The class should have the following methods:

- `addElement(T newElement)` - to add a new alement at the end of this dynamic array
- `addElement(T newElement, int index)` - to add an element at the given index
- `setElement(T newElement, int index)` - to override an old element with the new one at the given index.
- `getElement(int index)` - to get an element by given index
- `removeElement(int index)` to remove an element at given index
- `containsElement(T element)` - to check whether the element contains in the given dynamic array or not.
- `getSize()` - to return the size of this dynamic array.
- `toString()` - toreturn a string representation of this dynamic array having all the elements toString representation in the resulting string. For example `[1, 2, 3]`.
- `equals(Object o2)` и `hashCode()` - to be able to compare with other instances of the dynamic array.

When adding new elements to the dynamic array when the backed array has no more empty cells, the backed arrays should be recreated with larger size and all of the elements from the previous array should be copied to the new one.
In case if some operation cannot be successfully completed, class should throw an `IllegalArgumentException` with some dissent description of the cause of the excception.

You can also write some demo class that will demonstrate the example of work with this dynamic array.

### The result evaluation criteria

- All the unit tests are passed for the List exercise - 1 point
- All the unit tests are passed for the Map exercise - 1 point
- All the unit tests are passed for the DynamicArray exercise - 1 point
- Static code analisys is passed - 0.5 point
- The source code is easy to read, methods and variables has dissent and meaningful names - 0.5 point
- The source code of the DynamicArray logically divided by methods, exceptional situations are considered - 1 point.