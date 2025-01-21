from unittest import TestCase
from credit_card_validator import *

class TestCardValidatorFunction(TestCase):
    def test_that_card_validator_function_exists(self):
        card_validator(124354657689)
        
    def test_that_card_validator_returns_correct_value(self):
        actual = card_validator(5399831619690403)
        expected = ["Master card", "Valid", "5399831619690403"]
        self.assertEqual(actual, expected)
