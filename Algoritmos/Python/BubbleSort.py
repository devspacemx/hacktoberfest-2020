toSort = [5, 2, 6, 8, 3]

n = len(toSort)

for i in range(n): 
    for j in range(0, n-1): 
        if toSort[j] > toSort[j+1] : 
            toSort[j], toSort[j+1] = toSort[j+1], toSort[j]

print(toSort)