package org.example;

import org.example.Exception.MarkOutOfRangeException;
import org.example.Exception.EmptyMarkListException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RatingCalculator {
    public double calculateAverageRating(Collection<Double> marks) {
        int lowerLimit = 0;
        int upperLimit = 100;
        double sum = 0;
        double avg;
        if(!marks.isEmpty()){
            for (double mark : marks){
             if(mark<lowerLimit || mark>upperLimit){
                 String markOutOfRangeExceptionMessage = "Marks must be from "+lowerLimit+" to "+ upperLimit;
                 throw new MarkOutOfRangeException(markOutOfRangeExceptionMessage);
             }
            }
            for (double mark : marks){
                sum +=mark;
            }
            avg = sum/marks.size();
            return avg;
        }
        else {
            throw new EmptyMarkListException("Student's mark list was empty");
        }
    }
}
