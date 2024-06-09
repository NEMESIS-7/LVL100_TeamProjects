# Python Object-Oriented Programming
# Encapsulation implementation

# First Intance
# The Iphone_price attribute is easily acessed and changed
class Buyphone:
    def __init__(self, price):
        tax = 0.1
        self.Iphone_price = price * tax
        
Adwoaa_payment = Buyphone(60000)
print(Adwoaa_payment.Iphone_price)



