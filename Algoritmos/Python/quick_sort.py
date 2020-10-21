def partition(array, start, end):
    pivot = array[start]
    low = start + 1
    high = end

    # if value is larger than pivot it means is on the right side
    # and we can move left to the next element
    while True:
        # indicates all values moved to right
        while low <= high and array[high] >= pivot:
            high -= 1
        # opposite
        while low <= high and array[low] <= pivot:
            low += 1

        # order values
        if low <= high:
            array[low], array[high] = array[high], array[low]
        else:
            break
    array[start], array[high] = array[high], array[start]

    return high


def quick_sort(array, start, end):
    if start >= end:
        return

    # recursive passion
    p = partition(array, start, end)
    quick_sort(array, start, p - 1)
    quick_sort(array, p + 1, end)
    return array


arr = [29, 99, 27, 41, 66, 28, 44, 78, 87,
       19, 31, 76, 58, 88, 83, 97, 12, 21, 44]
print(quick_sort(arr, 0, len(arr) - 1))
