Tic Tac Toe
-----------

- went to an interview
- Design Tic Tac Toe
    - LLD
    - HLD
    - What datastructure will we use
    - Requirements gathering
    - Logic
    - Clear Segregation
    - Database Design
    - MVP
    - OOP Design
    - Modular Code
    - Scalability
    - API
    - SOILD principles
- Test whether you can "design" things.
-- --

- Delivered a GUI for TicTacToe
- Delivered a perfect AI
- Multithreaded solution

- Not passed the interview!

-- --

LLD Interviews
--------------

- asked in a lot of companies
- SDE2+ positions
- Fresher
  - Udaan
  - Uber
  - Flipkart


-- --

What is the interviewer really looking for?
-------------------------------------------

1. Can you understand the problem?
   - gathering the requirements
   - understanding the edge-cases
2. Can you break the problem down into solvable pieces?
3. How do you design it? And is your design EXTENSIBLE?

chess.com
isc.ro (scrabble)

- features change all the time
- fixing bugs
- maintainability
  - Hibernate - ORM for Java
  - easily migrate b/w libraries / dependencies
-- --
  
Requirements Gathering
----------------------

- Understand what Tic Tac Toe is
- Think about all the ways in which you can "generalize" the requirements
- Multiple Players
  - 2 player game  - X   O
  - Human Player / Computer Player
  - Human Player - Profile, Stats
  - Computer Player - AI, difficulty level, Stats
- Symbols must be customizable
- Board Size must be flexible
  - 3x3, 4x4, 10x20, 40x40
  - Rules are also flexible
- Different types of Rules

- Color of Board? Feature Request - Not a generaization
  - User interface
  - TicTacToe
- What are the exact game rules in case of a 5x5 TicTacToe Game?
  - No.
  - Is your design flexible enough to incorporate different rule sets?
  - Can the rules change? Can we have multiple variants
    of the game with different rules?
- how are the players going to interact with our application?
  - my design should be able to incorporate
  - different ways of interaction
  - "representing the game state"

- Usually LLD interviews
  - 1.5 hours - 3 hours
  - not possible
- If at the end of the interview we have non-working code

- MVP - Minimal Viable Product
- Minimal
  - does not have all the feature
  - it must still be easily extensible
- Viable
  - running end to end
  - people should be able to use it

- Code quality
- Design Patterns

Break till 9.40


-- --


Remaining Agenda
----------------

- Guest - Roopak
- Implement 1 version of Tic Tac Toe
- Quiz