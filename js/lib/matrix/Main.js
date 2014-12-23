function constructParticles(){

    var post1 = new Post(30000, 1);
    var post2 = new Post(30000, 1);
    var post3 = new Post(30000, 1);
    var user1 = new User("1", 1);
    var user2 = new User("2", 1);
    var user3 = new User("3", 1);
    user1.addPost(post1);
    user2.addPost(post2);
    user3.addPost(post3);
    var mass1 = new Mass(user1);
    var mass2 = new Mass(user2);
    var mass3 = new Mass(user3);
    // construct mass

    var velocity1 = new Velocity(20.0, 0.0, -10.0);
    var velocity2 = new Velocity(0.0, 0.0, 10.0);
    var velocity3 = new Velocity(-20.0, 0.0, 0.0);
    // construct velocity

    var position1 = new Position(-80.0, 0.0, 0.0);
    var position2 = new Position(0.0, 0.0, 0.0);
    var position3 = new Position(80.0, 0.0, 0.0);
    // construct position

    var p1 = new Particle("1", velocity1, mass1, position1);
    var p2 = new Particle("2", velocity2, mass2, position2);
    var p3 = new Particle("3", velocity3, mass3, position3);
    // construct particles

    var lstParticle = [];
    lstParticle[0] = p1;
    lstParticle[1] = p2;
    lstParticle[2] = p3;

    return lstParticle;
}
function sumOfGravitationalPotential(lstParticle, particle){
    var lstV = [];
    for ( var i = 0; i < lstParticle.length; i++){
        var thisParticle = lstParticle[i];
        if ( particle.n == thisParticle.n ){
            // Do nothing.
        }else{
            var gpV = new Gravitation(particle, thisParticle).getGravitationalPotentialVelocity(1);
            lstV[lstV.length] = gpV;
        }
    }
    return SumOfVelocity(lstV);
}
function updateAllMotion(lstParticle){
    var resultantParticleList = [];
    for ( var i = 0; i < lstParticle.length; i++){
        var p = lstParticle[i];
        p = new MotionChange(p, sumOfGravitationalPotential(lstParticle, p)).getParticle();
        resultantParticleList[resultantParticleList.length] = p;
    }
    return resultantParticleList;
}
function printPositionInAList(lstParticle){
    for ( var i = 0; i < lstParticle.length; i++){
        var p = lstParticle[i];
        p.printPosition();
    }      
}

function getPositionListFromParticleList(lstParticle){
    var lstPosition = new Array();
    for ( var i = 0; i < lstParticle.length; i++){
        var position = lstParticle[i].position;
        lstPosition[i] = position;
    }
    return lstPosition;
}

function runCmdLine(){
    var lstParticle = constructParticles();

    printPositionInAList(lstParticle);
    console.log("------------");
    for ( var i = 0; i < 1000; i++){
        lstParticle = updateAllMotion(lstParticle);
        
        printPositionInAList(lstParticle);
        console.log("------------");
    }
}