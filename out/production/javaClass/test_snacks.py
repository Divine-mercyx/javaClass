from unittest import TestCase
from snacks import *

class TestDivideOrSquare(TestCase):
    def test_that_get_division_or_square_exists(self):
        get_division_or_square(5)
        
    def test_that_get_division_or_square_function_returns_correct_value(self):
        actual = get_division_or_square(10)
        expected = 3.16
        self.assertEqual(actual, expected)
        
        
    def test_that_the_parameter_in_get_division_or_square_function_is_an_integer(self):
        self.assertRaises(TypeError, get_division_or_square, "String")
        
        
    def test_that_the_parameter_in_get_division_function_or_square_is_not_empty(self):
        self.assertRaises(ValueError, get_division_or_square, None)
        
        
    def test_that_the_parameter_in_get_division_or_square_function_is_divisible_by_5(self):
        actual = get_division_or_square(15)
        expected = 3.87
        self.assertEqual(actual, expected)
        
        
    def test_that_the_parameter_in_get_division_or_square_function_remainder_when_divided_by_5_is_not_zero(self):
        actual = get_division_or_square(6)
        expected = 1
        self.assertEqual(actual, expected)
        
        
    def test_that_if_the_parameter_in_get_division_or_square_function_is_divisible_by_5_the_square_root_will_be_valid(self):
        self.assertRaises(TypeError, get_division_or_square, 0)
        
        
        
class TestFutureInvestmentValue(TestCase):
    def test_that_get_future_investment_value_exists(self):
        get_future_investment_value(23.5, 45, 6)
        
        
    def test_that_get_future_investment_value_function_returns_correct_value(self):
        actual = get_future_investment_value(1000, 10, 1)
        expected = 3138.43
        self.assertEqual(actual, expected)
        
    def test_that_get_future_investment_value_function_works_with_string_values(self):
        self.assertRaises(TypeError, get_future_investment_value, "String", "String", "string")
        
        
        
    def test_that_get_future_investment_value_function_works_with_float_values(self):
        self.assertRaises(TypeError, get_future_investment_value, 2.4, 56.8, 3.6)
        
                
    def test_that_get_future_investment_value_function_accepts_zero_values_for_all(self):
        self.assertRaises(TypeError, get_future_investment_value, 0, 0, 0)
        
            
    def test_that_the_get_future_investment_value_function_will_work_if_empty(self):
        self.assertRaises(TypeError, get_future_investment_value, None, None, None)
        
        
    def test_that_the_get_future_investment_value_function_will_work_if_almost_empty(self):
        self.assertRaises(TypeError, get_future_investment_value, None, 56.6, None)
        
        
        
class TestForFloatNumbers(TestCase):
    def test_that_check_float_numbers_function_exists(self):
        check_float_numbers(23.4, 45.6)
        
        
    def test_that_check_float_numbers_function_returns_valid_result(self):
        actual = check_float_numbers(23.4, 45.6)
        expected = 2
        self.assertEqual(actual, expected)
        
    
    def test_that_check_float_numbers_function_works_with_one_integer(self):
        actual = check_float_numbers(23.4, 45)
        expected = 1
        self.assertEqual(actual, expected)
        
        
    def test_that_checks_float_numbers_function_works_with_string_values(self):
        self.assertRaises(TypeError, check_float_numbers, "String", "String")
        
        
    def test_that_that_check_float_numbers_function_works_when_empty(self):
        self.assertRaises(TypeError, check_float_numbers, None, 5)
        
        
    def test_whether_check_float_numbers_functon_works_with_negative_values(self):
        self.assertRaises(ValueError, check_float_numbers, -23.3, -0.23)
        
        
    def test_whether_check_float_numbers_functon_works_with_one_negative_values(self):
        self.assertRaises(ValueError, check_float_numbers, -23.3, 0.23)
        
        
        
class TestMyDiscount(TestCase):
    def test_that_my_discount_function_exists(self):
        my_discount(23, 45)
        
        
    def test_that_m_discount_function_returns_valid(self):
        actual = my_discount(150, 15)
        expected = 127.5
        self.assertEqual(actual, expected)
        
        
    def test_if_arguments_were_not_provided_in_my_discount_function(self):
        self.assertRaises(TypeError, my_discount)
        
        
    def test_if_one_arguments_were_not_provided_in_my_discount_function(self):
        self.assertRaises(TypeError, my_discount, 45)
        
        
    def test_that_my_discount_function_parameters_is_not_string_value(self):
        self.assertRaises(TypeError, my_discount, "string", "string")
        
        
    def test_that_my_discount_function_is_not_empty(self):
        self.assertRaises(ValueError, my_discount, None, None)
        

    def test_whether_check_float_numbers_functon_works_with_one_negative_values(self):
        self.assertRaises(ValueError, my_discount, -23, 23)
