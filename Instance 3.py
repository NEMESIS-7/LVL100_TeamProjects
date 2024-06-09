
#Third Instance
#The class can now be changed using the (chg_Iphoneprice) method

class Buyphone:
	def __init__(self, price):
		tax = 0.5
		self.__Iphone_price = price * tax  
  
	def acc_Iphoneprice(self):
		return self.__Iphone_price

	def chg_Iphoneprice(self, decrease):
		 self.__Iphone_price =self.__Iphone_price - decrease

		
Adwoaa_payment = Buyphone(60000)
Adwoaa_payment.chg_Iphoneprice(50)
print(Adwoaa_payment.acc_Iphoneprice())
