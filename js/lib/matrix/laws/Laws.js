function VelocityAddition(v1, v2){
    var sX = v1.speedX + v2.speedX;
    var sY = v1.speedY + v2.speedY;
    var sZ = v1.speedZ + v2.speedZ;
    return new Velocity(sX, sY, sZ);
}

function SumOfVelocity(lstVelocity){
    var v = lstVelocity[0];
    for ( var i = 1; i < lstVelocity.length; i++){
        var newV = VelocityAddition(v, lstVelocity[i]);
        v = newV;
    }
    return v;
}

function MotionChange(p1, additionalVelocity){
    this.p = p1;
    this.updatePosition = function(){
        this.p.position.x = this.p.position.x + this.p.velocity.speedX / scaleConstant;
        this.p.position.y = this.p.position.y + this.p.velocity.speedY / scaleConstant;
        this.p.position.z = this.p.position.z + this.p.velocity.speedZ / scaleConstant;
    }
    this.updateVelocity = function(){
        this.p.velocity = VelocityAddition(this.p.velocity, scaleDownVelocity(additionalVelocity)); 
    }
    this.update = function(){
        this.updateVelocity();
        this.updatePosition();
    }
    this.getParticle = function(){
        this.update();
        return this.p;
    }
}

function Gravitation(p1T, p2T){

    this.p1 = p1T;
    this.p2 = p2T;
    this.distance = new Distance(this.p1, this.p2);

    this.getGravitationalPotentialVelocity = function(whichOne){
        var bigM = this.p1.mass.getMass();
        // if whichOne == 1, it means mass 1, vice versa.
        if ( whichOne == -1 ){
            bigM = this.p2.mass.getMass();
        }
        var gravitationalPotential = gravitationalConstant * bigM / Math.pow(this.distance.getDistance(), 2);
        var doubleDistance = whichOne * this.distance.getDistance();

        var speedX = (this.p2.position.x - this.p1.position.x) / doubleDistance * gravitationalPotential;
        var speedY = (this.p2.position.y - this.p1.position.y) / doubleDistance * gravitationalPotential;
        var speedZ = (this.p2.position.z - this.p1.position.z) / doubleDistance * gravitationalPotential;

        return new Velocity(speedX, speedY, speedZ);
    }

}