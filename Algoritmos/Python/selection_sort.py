def selection_sort(array):

    length = len(array)
    for i in range(length):
        # use the first element as the minimum
        minimum = i
        for j in range(i + 1, length):
            if array[minimum] > array[j]:
                # if a smaller number is found update the minimum
                minimum = j
            # swap the minimum with the unsorted part
            array[i], array[minimum] = array[minimum], array[i]

    return array


array = [5, 7, 8, 3, 2, 9, 1, 4, 6]
print(selection_sort(array))
