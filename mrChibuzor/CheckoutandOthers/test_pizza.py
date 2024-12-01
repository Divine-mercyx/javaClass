from unittest import TestCase
from pizza import *

class TestDisplayFunction(TestCase):
    def test_that_display_questions_function_exists(self):
        display_questions(23, "odogwu")
        
    def test_that_display_questions_returns_correct_value(self):
        actual = display_questions(23, "odogwu")
        expected = "odogwu"
        self.assertEqual(actual, expected)
        
    def test_that_display_questions_function_doesnt_accept_anything_other_than_int_or_str(self):
        self.assertRaises(TypeError, display_questions, 45, [])
        
