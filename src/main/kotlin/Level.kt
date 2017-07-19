class Level(val cells: Array<Array<Cell>>) {

	var down: Level? = null
	var up: Level? = null
	var character: Character? = null

	init {
		cells.forEach { it.forEach { it.level = this } }
	}
	
	private fun findCoords(cell:Cell) : Pair<Int,Int>? {
	    var x = 0
		var y = 0
	    return null
	}
	
	fun display() : String {
//		val center = character?.location?.also {  } ?: return "Nobody here"
        val sb = StringBuilder()
		for (j in 0..cells.lastIndex) {
            for (i in 0..cells[0].lastIndex) {
                sb.append(cells[j][i].display())
            }
            sb.append("\n")
        }
		return sb.toString()
	}


}