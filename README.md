DataViz
=======

This is the Data Visualization Project in CCC.

The project is designed for creating and visualizing a physical system that represents the interactions on the social network using the data.
In this first beta version, data only includes the comment number and friend number. In the later version of the project, more data type would be included.

Physical System
--------
The system is an imagined universe where all the particles interact with each other only due to gravitational force.
For simplicity, I use Newton's universal gravitational law, not Einstein field equations.

The mass comes from users' influence upon others, which is obtained from comment number and friend number.

The distance is the distance between users' positions.

Users' positions are vectors that represent the magnitude of users' interest on a certain topic.
In this version, I assume there are only 3 possible interests.
In actual situation, there would be more.
If you want to change that, be careful that you also need to change the gravitational law to let it fit in the higher dimensional space.

Notes
---------
The program should be executed in a server. Otherwise, you will receive error message of prohibited Cross-Domain request from JavaScript engine.

Open Source
--------
Thanks the examples of Three.js, I am able to write the graphics part.

The graphics part of the code is mainly from https://stemkoski.github.io/Three.js/ParticleSystem-PathMovement.html

The software will be distribued in GPL license.
