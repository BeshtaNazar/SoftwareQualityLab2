import org.example.Exception.EmptyMarkListException;
import org.example.Exception.MarkOutOfRangeException;
import org.example.Model.Student;
import org.example.RatingCalculator;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RatingCalculatorTest {
    private final RatingCalculator calc = new RatingCalculator();
    @Test
    public void testAverageCalculatorWithMarks(){
        Collection<Double> marks = new ArrayList<>(Arrays.asList(70.0, 85.0, 78.0, 95.0, 67.0));
        Student student = new Student("Nazar", "Beshta", marks);
        assertEquals(79.0, calc.calculateAverageRating(student.getMarks()),0.01);
    }

    @Test
    public void testAverageCalculatorWithoutMarks(){
        assertThrows(EmptyMarkListException.class,()-> calc.calculateAverageRating(Collections.emptyList()));
    }
    @Test
    public void testAverageCalculatorWithOneMark(){
        Collection<Double> marks = new ArrayList<>(List.of(70.0));
        Student student = new Student("Nazar", "Beshta", marks);
        assertEquals(70.0,calc.calculateAverageRating(student.getMarks()),0.01);
    }
    @Test
    public void testAverageCalculatorMarksInRange(){
        Collection<Double> marks = new ArrayList<>(List.of(-100.0,120.0));
        Student student = new Student("Nazar", "Beshta", marks);
        assertThrows(MarkOutOfRangeException.class,()-> calc.calculateAverageRating(student.getMarks()));
    }
}
