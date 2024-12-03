from unittest import TestCase
from student_grade import *

class TestCollectScoresFunction(TestCase):
    def test_that_collect_scores_function_exists(self):
        collect_scores(4, 2, [])
    
    def test_that_collect_scores_function_returns_correct_values(self):
        actual = collect_scores(2, 2, [])
        expected = [[1, 2]]
        self.assertEqual(actual, expected)
