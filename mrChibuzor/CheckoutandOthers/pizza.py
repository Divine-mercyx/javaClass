
def display_questions(size: int, pizza_type: str):
    if type(size) is not int or type(pizza_type) is not str:
        raise TypeError("not int or str")
    if size <= 0:
        return "size less than zero"
    
    match pizza_type:
        case "supa size": calculate_details(size, pizza_type, 4, 2500)
        case "small money": calculate_details(size, pizza_type, 6, 2900)
        case "big boys": calculate_details(size, pizza_type, 8, 4000)
        case "odogwu": calculate_details(size, pizza_type, 12, 5200)
        
        
def calculate_details(size: int, pizza_type: str, pizza_slice: int, amount: float):
    if type(size) is not int or type(pizza_type) is not str or type(amount) is not int or type(pizza_slice) is not int:
        raise TypeError("not int or str or float")
    if size <= 0 or pizza_slice <= 0 or amount <= 0:
        return "less than zero"
    boxes = 0
    slices = 0
    while slices < size:
        slices += pizza_slice
        boxes += 1
    display_order_details(size, pizza_type, pizza_slice, amount, boxes, slices)
        
        
def display_order_details(size: int, pizza_type: str, pizza_slice: int, amount: float, boxes: int, slices: int):
    print(f"Number of boxes to buy = {boxes}  boxes (explanation {pizza_type} size contains {pizza_slice} \nslices per box, {boxes} + should be sufficient for {size} persons/person as it would contain {slices} in all)")
    print()
    print(f"Number of leftover slices = {(slices - size) } slices (explanation: after serving {size } slices, you should have {(slices - size)} slices left)");
    print()
    print(f"price = {(boxes * amount)} (explanation {amount} per box for {boxes} boxes");
    
    
display_questions(45, "odogwu")
