products = {
    "apple": 100,
    "banana": 50,
    "orange": 75,
    "milk": 200,
    "bread": 150
}

cart = []

print("Welcome to Semicolon Store Checkout System")
print("Available products:")
for product, price in products.items():
    print("  ", product, "- ₦", price)

while True:
    add_more = input("\nDo you want to add product to cart? (yes/no): ")
    if add_more != "yes":
        break
    
    product_name = input("Enter product name: ")
    product_name = product_name.lower()
    
    if product_name not in products:
        print("Product not found! Available products: apple, banana, orange, milk, bread")
        continue
    
    quantity = int(input("Enter quantity: "))
    cart.append({"name": product_name, "quantity": quantity, "price": products[product_name]})

print("\n", "="*50)
print("CUSTOMER INVOICE")
print("="*50)
print("Product          Quantity     Unit Price     Total")
print("-"*50)

subtotal = 0
for item in cart:
    item_total = item["quantity"] * item["price"]
    subtotal = subtotal + item_total
    print(item["name"], "             ", item["quantity"], "           ₦", item["price"], "         ₦", item_total)

print("-"*50)
print("Subtotal                                      ₦", subtotal)

discount = subtotal * 0.10
vat = subtotal * 0.075
total = subtotal - discount + vat

print("Discount (10%)                               -₦", discount)
print("VAT (7.5%)                                   +₦", vat)
print("="*50)
print("TOTAL AMOUNT DUE                             ₦", total)
print("="*50)
print("Thank you for shopping at Semicolon Store!")
