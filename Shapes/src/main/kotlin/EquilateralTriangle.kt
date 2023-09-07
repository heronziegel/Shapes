class EquilateralTriangle(_name : String, _side : Double) : Triangle(_name, _side, _side, _side) {

    var side = _side

    fun setDimensions(_s : Double){
        side = _s
    }

}