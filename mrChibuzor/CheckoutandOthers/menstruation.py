def display_info(name: str):
    if type(name) is not str:
        raise TypeError("not string")
        
    print("hello " + name)
    print("""
\033[93m
Average Cycle Length: The average menstrual cycle lasts 28 days,\nbut it can range from 21 to 35 days and still be considered normal.
\033[0m
    """)
    print("""
\033[93m
Phases of the Cycle: The menstrual cycle has four phases:
1. Menstruation (days 1-5): The uterus sheds its lining, resulting in bleeding.
2. Follicular Phase (days 6-14): The uterus prepares for a potential pregnancy by thickening its lining. Estrogen levels rise, causing the uterine lining to thicken.
3. Ovulation (around day 14): The pituitary gland releases luteinizing hormone (LH), triggering the release of an egg from the ovary.
4. Luteal Phase (days 15-28): If the egg is not fertilized, the corpus luteum produces progesterone, maintaining the uterine lining. If pregnancy occurs, the fertilized egg implants in the uterine lining.
        \033[0m
    """)
    
    
def display_choice():
    print("""
 \033[93m
1. Flow Date
2. Safe periods
3. Ovulation dates
4. back
\033[0m
    """)
    options = int(input("> "))
    match options:
        case 1: pass
        case 2: pass
        case 3: pass
        case 4: pass
