function Particle(n1, velocity1, mass1, position1){
	this.n = n1;
    this.velocity = velocity1;
    this.mass = mass1;
    this.position = position1;

    this.printPosition = function(){
        console.log("My position is:");
        console.log("x = " + this.position.x + "; y = " + this.position.y + "; z = " + this.position.z);
        console.log("");
    }
}