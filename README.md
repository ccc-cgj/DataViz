DataViz
=======

This is the Data Visualization Project in CCC.

The project is designed for creating and visualizing a physical system that represents the interaction on the social network using the data.
In this first beta version, data only includes the comment number and friend number. In the later version of the project, more data type would be included.

Physical System
--------
The system is a imagined universe where all the particle interact with each other only through gravitational force.
For simplicity, I use Newton's universal gravitational law, not Einstein field equations.

The mass comes from users' influence upon others, which is obtained from comment number and friend number.

The distance is the distance between users' positions.

Users' position are vectors that represent the magnitude of users' interest on a certain topic.
In this version, I assume there are only 3 possible interests.
In actual situation, there would be more.
If you want to change that, be careful that you also need to change the gravitational law to let it fit in the higher dimensional space.

Open Source
--------
Thanks the examples of Three.js, I am able to write the graphics part.

The graphics part of the code is mainly from https://stemkoski.github.io/Three.js/ParticleSystem-PathMovement.html

The software will be distribued in GPL license.
