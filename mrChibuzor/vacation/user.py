from dairy import Dairy

class User:


    def __init__(self, first, last):
        self.set_first_name(first)
        self.set_last_name(last)
        self.my_dairy = None
        
        
    def create_new_dairy(self):
        self.my_dairy = Dairy()
        
    
    def set_first_name(self, first):
        self.first_name = first
        
        
    def set_last_name(self, last):
        self.last_name = last
        
        
    def lock(self):
        self.my_dairy.lock()
        
        
    def unlock(self):
        self.my_dairy.unlock()
        
        
    def add_new_entry(self, content_id, content):
        self.my_dairy.add_new_entry(content_id, content)
        
        
    def find_by_id(self, content_id):
        self.my_dairy.view_entry(content_id)
        
        
    def update_entry(self, content_id, content):
        self.my_dairy.update_entry(content_id, content)
        
    
    def delete_entry(self, content_id):
        self.my_dairy.delete_entry(content_id)
        print("entry deleted.")
        
        
    def view_entry(self, content_id):
        self.my_dairy.view_entry(content_id)
        
        

person = User("divine", "mercy")
person.create_new_dairy()
person.add_new_entry("1", "hello there")
#person.create_new_dairy()
person.delete_entry("1")
person.view_entry("1")
        
