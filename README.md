# Project 2: PacMan ReadMe - CMSC389T Section 0101

### Group Members: Naaima Qadeer, Venkat Gokaraju, Shivani Amin, Alex S

To compile and run the game, use the following commands:

```bash
javac -cp "src/" src/*.java
java -cp "src/" StartMenu
```

## PacMan

#### get_valid_moves()
The get valid move method find all the possible moves for the pacman and store the positions into an array of positions. The valid moves are the 9 boxes around the pacman which are not walls. Pacman can move through air, cookie, and ghost (although game is over if you touch a ghost). There's no need to check if the pacman is on the edge of the map or not since the edge of the map is surrounded by walls. 

#### move()
The move() method finds the possible locations that PacMan can move by calling the get_valid_moves() method in the class. From the valid moves that are returned, PacMan will move in the direction of the first of those valid moves. The method returns true if PacMan was able to move, and false otherwise. The PacManMove test adds a PacMan object to the (0,0) Location on a new MainFrame object, and calls move() on PacMan. The AssertEquals statement ensures that the method returns true. 

#### is_ghost_in_range()
Checks if a ghost is in the region around pacman - does this by calling map’s getLoc function on each of the squares around pacman’s current location and returning true if any of them contain a ghost. The test for this is to create a situation where the ghost is not in range of pacman and see what the function returns, and then to add a ghost that is in range of pacman and see what is returned.

#### consume()
If there is a power cookie at the current location, it calls the eatCookie() method. If cookie is eaten, returns the cookie, else component returns null. My test creates the NoFrame and puts pacman at a coordinate where pacman should eat the cookie. Assert True is making sure the function does not return null. 

## Ghost
#### get_valid_moves()
The get valid move method find all the possible moves for the ghost and store the positions into an array of positions. The valid moves are the 9 boxes around the ghost which are not walls. Ghosts can move through air, cookie, and pacman (although game is over if pacman touches a ghost). There's no need to check if the ghost is on the edge of the map or not since the edge of the map is surrounded by walls. 

#### move()
The move() method finds the possible locations that a ghost can move by calling the get_valid_moves() method in the class. From the valid moves that are returned, the ghost will move in the direction of the first of those valid moves. The method returns true if the ghost was able to move, and false otherwise. The GhostMove test adds a Ghost object to the (0,0) Location on a new MainFrame object, and calls move() on the ghost. The AssertEquals statement ensures that the method returns true. 

#### is_pacman_in_range()
Checks if pacman is in the region around the ghost - does this by calling map’s getLoc function on each of the squares around the current ghost’s position and returning true if any of them contain a ghost. The test for this is to create a situation where pacman is not in range of the ghost and check that the function returns false, and then add a ghost that is in range of pacman and check that the function returns false for this new ghost.

#### attack()
If pacman is in the attack range, the method calls is_pacman_in_range and attacks. If the attack works, returns true, else returns false. My test creates a NoFrame and two locations, one for pacman and one for the ghost. The attack should be successful since it is in range, so I use assertTrue to make sure the method does not return null.


## Map
#### move()
This method moves either pacman or ghost from its current location to the new location in the parameter. If it successfully moves then the method changes the location of the pacman/ghost in all the database variables and returns true. If the object is not a pacman or ghost, the pacman or ghost does not exist, or the new location is not valid, this method returns false.a 

#### getLoc()
The getLoc() method returns what objects are currently located at the specified Location (PacMan, Ghost, Cookie, Wall, or Empty) by accessing the field property of the Map object. The MapGetLoc test adds a PacMan object to the (0,0) Location and a Ghost object to the (1,1) Location on a new MainFrame object, and calls getLoc() on the mainframe’s map. The AssertEquals statement ensures that the method returns a set containing Type.PACMAN and Type.GHOST. 

#### attack()
Checks if pacman is in range of ghost - if so the game ends (since ghost attacks pacman). This is tested by placing ghost far from pacman and seeing if game ends, and then placing a ghost next to pacman and seeing if the game ends.

#### eatCookie()
This method confirms pacman eats the cookie. Once the display is updated and pacman eats the cookie, then the cookie component that was eaten is returned, else we return null. Here, my test creates a NoFrame and adds pacman at a location. Since this method is similar to pacman consume, I am making sure that pacman does not eat the cookie, so the Assert True should equal null. I am using a try catch clause to prevent any errors. 

