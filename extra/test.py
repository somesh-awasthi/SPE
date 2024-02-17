import unittest
from build import op
class test(unittest.TestCase):
    def test_check(self):
        a,b=30,20
        ans=op(a,b)
        self.assertEqual(ans,50)
if __name__=='__main__':
    unittest.main()