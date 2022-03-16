package mx.tecnm.tepic.ladm_u2_ejercicio7_coroutinescanvas

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import kotlin.random.Random

import kotlin.random.Random.Default.nextLong

class Lienzo(este:MainActivity): View(este) {
    var este = este
    var circulos = Array<Circulos>(10,{Circulos(this@Lienzo)})
    override fun onDraw(c: Canvas) {
        val fondo= Color.BLACK
        c.drawColor(fondo)
        super.onDraw(c)
        var p = Paint()



        val m =true
        val ini=true
        p.color = circulos[0].color
        c.drawCircle(circulos[0].cX.toFloat()-circulos[0].movX.toFloat(),
            circulos[0].cY.toFloat()+circulos[0].movY.toFloat(),10f,p)


    }
}

class Circulos(lienzo: Lienzo){
    var li=lienzo
    val rgb1 = List(3) { Random.nextInt(0, 255) }
    val color = Color.rgb(rgb1[0],rgb1[1],rgb1[2])
    var cY= Random.nextDouble(0.0,715.0)
    var cX= Random.nextDouble(0.0,1332.0)
    val movX = Random.nextDouble(5.0,10.0)
    val movY = Random.nextDouble(5.0,10.0)
}