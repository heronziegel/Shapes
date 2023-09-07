class Circle(_name : String, _radius : Double) : Shape(_name)  {

    var radius = _radius

    override fun printDimensions(){
        println("Radius: $radius")
    }

    fun setDimensions(_rad : Double){
        radius = _rad
    }

    override fun getArea() : Double{
        return Math.PI*radius*radius
    }

}