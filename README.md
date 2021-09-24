# network-programming-project
A network-based implementation of the "ten guesses" game in Java

Design and write (in Java) a simple network-based 
implementation of the “ten guesses” game.
Game rules / outcomes:
• Server programme selects a number between 1 and 1000.
• Client has ten (iterative) attempts at guessing the number.
(i.e. user running the client programme will input guesses at the keyboard)
• Server responds with “Correct – you win!”, or “Too high – guess again”, or
“Too low – guess again”, or “You’re out of guesses – you lose!” as 
appropriate.
• Client wins if they guess correctly.
• Server wins if the client runs out of guesses.
• Server should keep a tally of scores, and should ask the user (client) at the end 
of each game if they would like to play again or not.
Included:
• The client programme – GuessClient – that implements the client side 
functionality.
• The Server programme – GuessServer – that facilitates the playing of the game 
and its outcomes.
