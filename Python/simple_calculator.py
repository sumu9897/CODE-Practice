a= int(input("Enter number of a : "))
b= int(input("Enter number of b : "))

print("SUM=1\nSUB=2\nMUL=3\nDIV=4\n\n")
c= int(input("Enter number of : "))

sum = a+b;
sub = a-b;
mul = a*b;
div = a/b;

if(c==1):
  print("Sum : ",sum)
elif (c==2):
  print("Sub : ",sub)
elif (c==3):
  print("Mul : ",mul)
elif (c==4):
  print("Div : ",div)
else:
  print("Invalid Number")
