arr =[10, 13, 2, 22, 5, 1, 26, 8, 3, 30, 7]

def bubbleSort(theSeq):
  n=len(theSeq)
  for i in range(n-1):
    for j in range(n - 1 - i):
      if theSeq[j] > theSeq[j + 1]:
        temp = theSeq[j]
        theSeq[j]=theSeq[j+1]
        theSeq[j+1]=temp
  return theSeq

print(bubbleSort(arr))
