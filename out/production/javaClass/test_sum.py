from unittest import TestCase
from list_sum import get_sum_list
from list_remove import get_list



class TestGetSumList(TestCase):
    def test_that_get_sum_list_exists(self):
        get_sum_list([23, 2])
        
    def test_that_get_sum_list_gives_valid_value(self):
        actual = get_sum_list([2, 2, 4, 2])
        expected = 10
        self.assertEqual(actual, expected)
        
    def test_that_get_sum_list_works_with_strings(self):
        self.assertRaises(TypeError, get_sum_list, ["ahsjads", "ashvcha"])
        
    def test_that_get_sum_list_works_with_all_negatives(self):
        actual = get_sum_list([-2, -3, -4])
        expected = -9
        self.assertEqual(actual, expected)
        
    def test_that_get_sum_list_is_not_empty(self):
        self.assertRaises(ValueError, get_sum_list, [None, None])
        
        
    def test_that_get_sum_will_work_with_one_negative_value(self):
        actual = get_sum_list([-2, 8])
        expected = 6
        self.assertEqual(actual, expected)
        
        
        
        
        

class TestListRemove(TestCase):
    def test_that_get_list_function_exists(self):
        get_list([23, 34])
        
    def test_that_get_list_function_returns_valid_output(self):
        actual = get_list([23, 4, 6])
        expected = [23, 6]
        self.assertEqual(actual, expected)
        
    def test_that_get_list_funtion_is_not_string_value(self):
        self.assertRaises(TypeError, get_list, "asjdajbd")
        
    """def test_that_get_list_function_is_not_None(self):
        self.assertRaises()"""
        
    def test_that_get_list_function_returns_zero_if_element_is_one(self):
        actual = get_list([23])
        expected = 0
        self.assertEqual(actual, expected)
