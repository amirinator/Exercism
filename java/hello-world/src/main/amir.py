def testMem(lst):
    lst1 = lst
    lst1.append(4)
    return lst
listA = [0]
listB = listA
listB.append(1)
print listA
listC = listA
listA = testMem(listA)
print listA
print listC
print listB
