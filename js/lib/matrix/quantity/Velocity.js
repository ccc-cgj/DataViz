function Velocity(speedX1, speedY1, speedZ1){
    this.speedX = speedX1;
    this.speedY = speedY1;
    this.speedZ = speedZ1;
}
function scaleDownVelocity(velocity){
	var speedX = velocity.speedX / scaleConstant,
	speedY = velocity.speedY / scaleConstant,
	speedZ = velocity.speedZ / scaleConstant;
	var v = new Velocity(speedX, speedY, speedZ);
	return v;
}