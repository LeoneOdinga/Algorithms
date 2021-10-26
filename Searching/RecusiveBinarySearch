# binary search recursive function

def RecursiveBinarySearch(listToSearch,searchValue):
    lowerIndex =0
    higherIndex = len(listToSearch)-1
    return BinarySearchRecursiveFunction(listToSearch,lowerIndex,higherIndex,searchValue)

def BinarySearchRecursiveFunction(listToSearch,lowerIndex,higherIndex,searchValue):

    if lowerIndex > higherIndex:
        return  False
    middleElement = int((lowerIndex+higherIndex)/2)

    if listToSearch[middleElement] == searchValue:
        return True
    elif searchValue > listToSearch[middleElement]:
        return BinarySearchRecursiveFunction(listToSearch,middleElement+1,higherIndex,searchValue)
    else:
        return BinarySearchRecursiveFunction(listToSearch,lowerIndex,middleElement-1,searchValue)

ourList =[1,2,4,6,4,5,6,8,2,4,63,66,39,92,12]

ourList.sort()  # for binary search to work, we must first sort the incoming list

testSearchValue = 4

print("Value Found") if RecursiveBinarySearch(ourList, testSearchValue)==True else print("Value Not Found!")

