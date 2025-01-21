from unittest import TestCase
from cryptography import *

class TestEncryptFunction(TestCase):
    def test_that_encrypt_function_exists(self):
        encrypt("app", 3)
        
    def test_that_encrypt_function_returns_correct_value(self):
        actual = encrypt("app", 3)
        expected = "dss"
        self.assertEqual(actual, expected)
        
    def test_that_encrypt_function_returns_correct_with_spaces(self):
        actual = encrypt("a pp", 3)
        expected = "d#ss"
        self.assertEqual(actual, expected)


class TestDecryptFunction(TestCase):
    def test_that_decrypt_function_exists(self):
        decrypt("dss", 3)
    
    def test_that_decrypt_function_returns_correct_value(self):
        actual = decrypt("dss", 3)
        expected = "app"
        self.assertEqual(actual, expected)
        
    def test_that_decrypt_function_returns_correct_with_spaces(self):
        actual = decrypt("d#ss", 3)
        expected = "a pp"
        self.assertEqual(actual, expected)
        
