def is_prime(number):
	if number < 2:
		return "number must be greater than 1"
	if number == 2:
		return True
	for count in range(3, number):
		if number % count == 0:
			return False
	return True

number = int(input("enter a number: "))
check = is_prime(number)
if check:
	print("prime number")
else:
	print("not prime number") 