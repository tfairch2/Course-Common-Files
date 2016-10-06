import pygame, sys 			#import pygame	
from pygame.locals import * # const values like QUIT, MOUSEMOTION
import time

# Initialize pygame
pygame.init()

# Make a window whose width is 640 pixels and height is 480 pixels
window = pygame.display.set_mode( ( 640, 480 ) )

# Set the text at the top of the window
pygame.display.set_caption( "Pickin' Sticks" )

# TEMPORARY: Pause the program
time.sleep( 2 )
