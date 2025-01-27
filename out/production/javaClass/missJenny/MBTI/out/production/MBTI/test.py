number = int(input("enter a number: "))

for count in range(1, number + 1):
	for counter in range(1, count + 1):
		print(counter, end=" ")
	print()



for count in range(number, 0, -1):
	for counter in range(1, count):
		print(counter, end=" ")
	print()