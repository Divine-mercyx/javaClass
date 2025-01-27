from unittest import TestCase
from checkout import *

class TestDisplayFunction(TestCase):
    def test_that_the_display_function_exists(self):
        display_questions("divine", [], [], [])
        
    def test_that_display_functions_accept_string_and_list(self):
        self.assertRaises(TypeError, display_questions, "divine", [], [], [])
