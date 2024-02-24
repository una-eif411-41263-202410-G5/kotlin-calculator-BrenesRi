package design.patterns.calculator

import com.github.stefanbirkner.systemlambda.SystemLambda
import design.patterns.design.patterns.singleton.MyClass
import design.patterns.design.patterns.calculator.Calculator
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class CalculatorTest {

    @Test
    fun testSumar() {
        val calculadora = Calculator()
        val resultado = calculadora.sumar(5.0, 3.0)
        assertEquals(8.0, resultado)
    }

    @Test
    fun testRestar() {
        val calculadora = Calculator()
        val resultado = calculadora.restar(5.0, 3.0)
        assertEquals(2.0, resultado)
    }

    @Test
    fun testMultiplicar() {
        val calculadora = Calculator()
        val resultado = calculadora.multiplicar(5.0, 3.0)
        assertEquals(15.0, resultado)
    }

    @Test
    fun testDividir() {
        val calculadora = Calculator()
        val resultadoExitoso = calculadora.dividir(6.0, 3.0)
        assertEquals(2.0, resultadoExitoso)
    }
}
