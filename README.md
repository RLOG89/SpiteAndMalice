#Spite and Malice
=====

##Project Objectives
Use Java to model a card game called Spite and Malice.
  - Demonstrate through TDD that the game logic is sound and it would be playable on an interface

##Game Objective 
  - Be the first play to play all cards from your payoff pile to the centre stacks.  Side stacks act as a holding area for your discards.

##Rules/Setup
  - 2 players
  - 3 decks
  - 5 cards dealt to players hand, all visible to player
  - 20 cards dealt face down to player payoff pile, top card turned face up 
  - 4 empty centre stacks which players play on 
  - 4 empty side stacks which each player gets to store cards

##Rules/Play
  - Take turns.  On your turn play cards from your hand, payoff pile or side stacks to the centre stacks (if you can).  
  Cards go in ascending order Ace - Queen in the centre, with Kings being wild (can be played as any card except an Ace) 
  - When you play the top card of your payoff pile, the next card is turned up to replace it.
  - When a Queen is played to a centre stack the stack is complete and is moved to the discard pile, resetting the centre stack again.
  - if you play all five cards in your hand to the centre stack you draw another five cards and your turn continues
  - to end your turn (when you can no longer / don’t want to make anymore moves) play a card from your hand to one of your side stacks.  Your hand is then replenished with five cards (you must always have five to start) and the other player takes a turn.
  - The winner is the first player to clear their payoff pile.  The winner gets 5 points plus a point for each card left in the other players payoff pile.
  
