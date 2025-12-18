def check_state_code():
    code = input("Enter state code in Capital letter: ").upper()

    if code == "CT"  or code =="MA" or code == "ME" or code == "NH" or code == "NJ" or code == "NY" or code == "PA" or code == "VT":
        return "State code is valid!!!"
    return "State code is incorrect!!! "

print(check_state_code())

