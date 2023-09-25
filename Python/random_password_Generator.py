import random

characters ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890!@#$%^&*_+"
pass_length=int(input("Enter the length of req. password: "))
pass_count = int(input("Enter the number of req. password: "))

for i in range (0, pass_count):
  password = ""
  for j in range (0, pass_length):
    pass_char = random.choice(characters)
    password = password +pass_char
  print("The generated password is ", password)
