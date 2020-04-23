
#
#  Copyright (c) 2020 by <박민종>, All rights reserved.

#  File       : 2020313064.박민종.HW5.py
#  Written on : Apr. 27, 2020
#
#  Student ID : 2020313064
#  Author     : 박민종 (tongs0@naver.com)
#  Affiliation: School of Electrical Engineering
#               Sungkyunkwan University
#  py version : tested on 3.8.2, 64-bit
#  Class      : Engineering Computer Programming (GEDT018-43)
#  Subject    : program about Text File Objects
#
#  Modification History:
#     * version 1.0, by 박민종, Apr. 27, 2020:
#       - 1st released on this day.
#  end of Modification History

"""The 5th lab program template. Add your words to docstring."""

# Import random module for random number generation.
import random
from eepy import einput as input     # Never remove this line.


def get_int(minimum, maximum):
    """Get an integer given by user.

    User must enter an integer between minimum and maximum.

    :return: the integer which user enters.
    :rtype:  int

    :param minimum: minimum integer which must be given by user.
    :type minimum:  int

    :param maximum: maximum integer which must be given by user.
    :type maximum:  int

    :precondition: minimum <= maximum
    """
    assert minimum <= maximum, (
        'minimum must be less than maximum or equal to it.')
    assert type(minimum) == int, repr(minimum)+' is not integer.'
    assert type(maximum) == int, repr(maximum)+' is not integer.'

    valid_input = False
    while not valid_input:
        user_input = input('enter the number which i have: ')
        try:
            user_number = int(user_input)
            valid_input = True
        except ValueError:
            print('Invalid input: Please enter a number between {0} and {1}'.format(minimum,maximum))

    if user_number<minimum or user_number>maximum:
            print('Invalid input: Please enter a number between {0} and {1}'.format(minimum,maximum))

    return user_number


def guess_number(minimum, maximum, max_tries):
    """main program of Guess-A-Number game. Write your docstring"""

    assert minimum <= maximum, (
        'minimum must be less than maximum or equal to it.')
    assert type(minimum) == int, repr(minimum)+' is not integer.'
    assert type(maximum) == int, repr(maximum)+' is not integer.'
    assert type(max_tries) == int, repr(max_tries)+' is not integer.'
    assert max_tries >= 1, 'max_tries must be an integer greater than 1.'

    # decide a number which user must guess.
    my_number = random.randint(minimum, maximum)
    total_try = max_tries
    print('I have a number between {0} and {1}'.format(minimum,maximum))
    while max_tries>0:
        num = get_int(minimum,maximum)
        if num<my_number:
            print('My number is larger than your choice.')
            minimum = num+1
            print('I have a number between {0} and {1}'.format(minimum,maximum))
        elif num==my_number:
            print('Your choice is correct, You earned {0} points.'.format(max_tries))
            break
        else:
            print('My number is less than your choice.')
            maximum = num-1
            print('Ihave a number between {0} and {1}'.format(minimum,maximum))
        max_tries = max_tries-1

    if max_tries==0:
        print('My number is {0}.'.format(my_number))
        print('You can try {0} times. You lose this game.'.format(total_try))

    

# -- end of 2020313064.박민종.HW5.py