value  = int(input("How many values do you want to input: "))

numbers  = int(input("Enter integer: "))

maximum = numbers;
minimum = numbers;

for counter in range(1,value):
    numbers  = int(input("Enter integer: "))

    if numbers > maximum:
        maximum = numbers;

    if numbers < minimum:
        minimum = numbers;


addition = maximum + minimum;

print("The sum of maximum and minimum  number is: ", addition);


