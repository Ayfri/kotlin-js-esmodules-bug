data class Point(val x: Int, val y: Int) {
	operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}

fun main() {
	val point = Point(1, 2)
	val point2 = Point(3, 4)

	console.log(point + point2)
}
