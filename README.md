

# Rearrange Array in Alternate High-Low Order

## Description
This Java program rearranges an array in an alternate high-low order. It first sorts the array in ascending order and then reorders the elements so that the highest element is placed first, followed by the lowest, then the second highest, second lowest, and so on. The sorting is done using a nested loop, and reordering is achieved using two pointers.

## Code Explanation

### 1. Input Handling
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size");
int size = s.nextInt();
int a[] = new int[size];
System.out.println("Enter the Elements");
for(int i = 0; i <= a.length - 1; i++)
{
    a[i] = s.nextInt();
}
System.out.println(Arrays.toString(a));
```
- A `Scanner` object is used to take input.
- The user is prompted to enter the size of the array.
- An integer array `a` is created with the given size.
- A `for` loop is used to take `size` number of inputs and store them in `a`.
- The array is printed using `Arrays.toString(a)`.

### 2. Sorting the Array in Ascending Order
```java
for(int i = 0; i <= a.length - 1; i++)
{
    for(int j = 0; j <= i - 1; j++)
    {
        if(a[j] > a[i]) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
System.out.println(Arrays.toString(a));
```
- This **nested loop** sorts the array in ascending order.
- Outer loop (`i`) iterates through the array elements.
- Inner loop (`j`) iterates through the previous elements to compare and swap if necessary.
- The `if` condition checks if `a[j] > a[i]` and swaps values using a temporary variable.
- After sorting, the array is printed.

### 3. Rearranging Elements in Alternate High-Low Order
```java
int arr[] = new int[a.length];
int low = 0;
int high = a.length - 1;
for(int i = 0; i <= arr.length - 1; i++)
{
    if(i % 2 == 0)
        arr[i] = a[high--];
    else
        arr[i] = a[low++];
}
System.out.println(Arrays.toString(arr));
```
- A new array `arr[]` is created to store the rearranged elements.
- Two variables `low` and `high` are initialized:
  - `low` starts at `0` (beginning of the sorted array).
  - `high` starts at `a.length - 1` (end of the sorted array).
- The `for` loop iterates through `arr[]` and fills it alternately:
  - If `i` is even, the highest remaining value (`a[high]`) is placed, and `high` is decremented.
  - If `i` is odd, the lowest remaining value (`a[low]`) is placed, and `low` is incremented.
- Finally, the rearranged array is printed.

## Summary of Important Components
### `for` Loops
- Used for:
  1. Taking user input.
  2. Sorting the array.
  3. Rearranging elements.
- The outer loop in sorting runs from `0` to `size-1`.
- The inner loop in sorting checks and swaps elements for ordering.
- The final loop places elements in an alternate pattern.

### Arrays
- `a[]`: Stores the user input and is later sorted.
- `arr[]`: Stores the rearranged elements in alternate high-low order.

### Variables `high` and `low`
- `low = 0`: Starts from the beginning of the sorted array.
- `high = a.length - 1`: Starts from the end of the sorted array.
- Used to select values alternately in the final rearrangement.

### `if` Condition
- Used in the rearrangement step:
  - If index `i` is even, the highest remaining value is placed.
  - If index `i` is odd, the lowest remaining value is placed.

## Example Execution
### **Input:**
```
Enter the Size
6
Enter the Elements
3 1 9 7 5 2
```
### **Sorting Output:**
```
[1, 2, 3, 5, 7, 9]
```
### **Final Rearranged Output:**
```
[9, 1, 7, 2, 5, 3]
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Array_Alternate_High_Low_Sorting.git
```
