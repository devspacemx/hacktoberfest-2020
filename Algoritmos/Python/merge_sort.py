def merge_sort(array):

    if len(array) > 1:
        m = len(array)//2  # find the half of array
        left = array[:m]   # dividing array in 2 halves
        right = array[m:]  # left and right

        # recursive sorting both halves
        left = merge_sort(left)
        right = merge_sort(right)

        array = []

        # insert lowest element into main array
        while len(left) > 0 and len(right) > 0:
            if left[0] < right[0]:
                array.append(left[0])
                left.pop(0)
            else:
                array.append(right[0])
                right.pop(0)

        # merge sorted elements
        for i in left:
            array.append(i)
        for i in right:
            array.append(i)

    return array


array = [5, 7, 8, 3, 2, 9, 1, 4, 6]
print(merge_sort(array))
