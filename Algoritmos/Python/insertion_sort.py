def insertion_sort(array):
    length = len(array)
    for i in range(length):
        # define a temporal element for comparison
        curr = array[i]

        # move elementss greater than curr to a position ahead
        j = i - 1
        while (j >= 0) and (curr < array[j]):
            array[j + 1] = array[j]
            j -= 1

        array[j + 1] = curr

    return array


array = [5, 7, 8, 3, 2, 9, 1, 4, 6]
print(insertion_sort(array))
