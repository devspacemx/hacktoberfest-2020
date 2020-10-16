const bubbleSort = inputArr => {
    
    let len = inputArr.length;
    for (let i = 0; i < len; i++) {
        for (let j = 0; j < len; j++) {
            if (inputArr[j] > inputArr[j + 1]) {
                let tmp = inputArr[j];
                inputArr[j] = inputArr[j + 1];
                inputArr[j + 1] = tmp;
            }
        }
    }
    return inputArr;
};


// let arr = [1,6,4,2,7,5,10]
// console.log(arr)
// let sortedArr = bubbleSort(arr)
// console.log(sortedArr)