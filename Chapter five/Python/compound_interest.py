import math

principal = 1000.0

for interest in range(5,11):
    interestConversion = interest / 100.0;

    print("This is compound interest for " , interest , " rate")
    print(f"{'year':<10} {'Amount on Deposit':>5}")

    for year in range(1,10):
        amount = principal * math.pow(1.0 + interestConversion, year)
        print(f"{year:<10} {amount:>5}" )
