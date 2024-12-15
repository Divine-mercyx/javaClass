from dairy_entry import Dairy_entry

class Dairy:
    
    
    def __init__(self):
        print("created a new dairy")
        self.entries = []
        self.isLocked = False
        
    
    def lock(self):
        self.isLocked = True
        
        
    def unlock(self):
        self.isLocked = False
        
    
    def add_new_entry(self, content_id, content):
        if self.isLocked == False:
            self.entries.append(Dairy_entry(content_id, content))
            print("entry added successfully")
        else: print("dairy is locked")
        
        
    def find_by_id(self, content_id):
        for entry in self.entries:
            if entry.get_content_id() == content_id:
                return entry
            else:
                return None
                
                
    def update_entry(self, content_id, content):
        entry = self.find_by_id(content_id)
        if entry is not None and self.isLocked == False:
            entry.set_content(content)
            print("updated your entry successfully")
        else:
            print("entry is null or dairy is locked")
            
            
    def delete_entry(self, content_id):
        entry = self.find_by_id(content_id)
        self.entries.remove(entry)
        
            
    def view_entry(self, content_id):
        if self.isLocked == False:
            entry = self.find_by_id(content_id)
            if entry != None:
                print(entry.get_content())
            else: print("entry is empty")
        else: print("dairy is locked")
        

