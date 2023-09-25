from typing_extensions import Counter
#printing prime numbers in a range 
print("Prime Number")
lower =int(input("Enter Lower Number : "))
upper =int(input("Enter Upper Number : "))
count=0

for num in range (lower, upper+1):
  if num>1:
    for i in range (2, num):
      if num % i==0:
        
        break
    else:
      print(num)
      count = count+1
print("\nTotal Number from",lower,"to",upper," : ",count)
