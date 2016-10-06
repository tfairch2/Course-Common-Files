import pygame, sys 			#import pygame	
from pygame.locals import * # const values like QUIT, MOUSEMOTION
import time

# Initialize pygame
pygame.init()

# Make a window whose width is 640 pixels and height is 480 pixels
window = pygame.display.set_mode( ( 640, 480 ) )

# Set the text at the top of the window
pygame.display.set_caption( "Pickin' Sticks" )

window.fill( pygame.Color( 255, 100, 100 ) )

# Draw circle. Pass in: window, color, (x,y), radius, thickness
# x = 100, y = 150, radius = 50, thickness = 5
pygame.draw.circle( window, pygame.Color( 255, 0, 0 ), ( 100, 150 ), 50, 5 )

# Draw filled-in rectangle. Pass in: window, color, (x1, y1, x2, y2)
pygame.draw.rect( window, pygame.Color( 0, 255, 0 ), ( 200, 225, 250, 275 ) )

# Draw line. Pass in: window, color, (x1, y1), (x2, y2), thickness
pygame.draw.line( window, pygame.Color( 0, 0, 255 ), ( 300, 400 ), ( 430, 400 ), 4 )

pygame.display.update()

# TEMPORARY: Pause the program
time.sleep( 2 )
