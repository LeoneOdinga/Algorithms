#Binary Search Iterative Function

def iterativeBinarySearch(listToSearch, searchValue):
    lowerIndex =0
    higherIndex = len(listToSearch)-1
    while lowerIndex <= higherIndex:
        middleElement = int((lowerIndex+higherIndex)/2)
        if listToSearch[middleElement] == searchValue:
            return True
        elif listToSearch[middleElement] < searchValue:
            lowerIndex= middleElement+1
        else:
            higherIndex=middleElement-1
    return False

ourList =[1,2,4,6,4,5,6,8,2,4,63,66,39,92,12]

ourList.sort()  # for binary search to work, we must first sort the incoming list

testSearchValue = 33

print("Value Found") if iterativeBinarySearch(ourList, testSearchValue)==True else print("Value Not Found!")

