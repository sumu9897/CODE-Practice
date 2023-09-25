import turtle
loadWindow = turtle.Screen()
turtle.speed(200)

for i in range(80):
	turtle.circle(5*i)
	turtle.circle(-5*i)
	turtle.left(i)

turtle.exitonclick()
