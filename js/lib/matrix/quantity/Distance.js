function Distance(p1, p2){
    this.getDistance = function(){
        var distance = Math.pow(
                Math.pow( p1.position.x - p2.position.x, 2 ) +
                Math.pow( p1.position.y - p2.position.y, 2 ) +
                Math.pow( p1.position.z - p2.position.z, 2 ), 0.5 );
        return distance;
    }
}