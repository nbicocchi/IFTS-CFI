package com.nbicocchi.exercises.classes;

import java.util.Objects;

public class RationalNumber {
    int num;
    int den;

    public RationalNumber(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                num + " / " + den +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return num == that.num && den == that.den;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, den);
    }

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public RationalNumber add(RationalNumber other) {
        int mcm = leastCommonMultiple(den, other.den);
        int a = mcm / den * num + mcm / other.den * other.num;
        int b = mcm;
        return new RationalNumber(a,b);
    }

    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(num * other.num, den * other.den);
    }



    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(1, 2);
        RationalNumber r3 = new RationalNumber(1, 2);
        System.out.println(r1.multiply(r2));
        System.out.println(r1.add(r2).add(r3));
    }
}
