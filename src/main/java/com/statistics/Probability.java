package com.statistics;

import java.util.Objects;

public class Probability {

    private float value;

    public Probability(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Float.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }

    public Probability eventAsEqual(Probability probabilityB) {
        return new Probability(this.value * probabilityB.value);
    }

    public Probability eventNotEqual() {
        return new Probability(1 - this.value);
    }

    public Probability eitherThisEventOrThatEventOccurred(Probability probabilityB){
        return new Probability(this.value + probabilityB.value - this.eitherThisEventOrThatEventOccurred(probabilityB).value);
    }


}
