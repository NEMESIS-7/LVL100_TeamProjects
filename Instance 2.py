
#Second Instance
#Making the class privite by adding double underscores infront of the (Iphone_price) attribute
#The attribute is not easily accessed and changed
#It can only be accessed in this code using the (acc_Iphoneprice) method
class Buyphone:
    def __init__(self, price):
        tax = 0.1
        self.__Iphone_price = price * tax
        
    def acc_Iphoneprice(self):
        return self.__Iphone_price

Adwoaa_payment = Buyphone(60000)
print(Adwoaa_payment.acc_Iphoneprice())



