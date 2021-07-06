/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.chart;

/**
Builder class for javafx.scene.chart.BarChart
@see javafx.scene.chart.BarChart
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class BarChartBuilder<X, Y, B extends javafx.scene.chart.BarChartBuilder<X, Y, B>> extends javafx.scene.chart.XYChartBuilder<X, Y, B> {
    protected BarChartBuilder() {
    }

    /** Creates a new instance of BarChartBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <X, Y> javafx.scene.chart.BarChartBuilder<X, Y, ?> create() {
        return new javafx.scene.chart.BarChartBuilder();
    }

    private int __set;
    public void applyTo(javafx.scene.chart.BarChart<X, Y> x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setBarGap(this.barGap);
        if ((set & (1 << 1)) != 0) x.setCategoryGap(this.categoryGap);
    }

    private double barGap;
    /**
    Set the value of the {@link javafx.scene.chart.BarChart#getBarGap() barGap} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B barGap(double x) {
        this.barGap = x;
        __set |= 1 << 0;
        return (B) this;
    }

    private double categoryGap;
    /**
    Set the value of the {@link javafx.scene.chart.BarChart#getCategoryGap() categoryGap} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B categoryGap(double x) {
        this.categoryGap = x;
        __set |= 1 << 1;
        return (B) this;
    }

    private javafx.scene.chart.Axis<X> XAxis;
    /**
    Set the value of the {@link javafx.scene.chart.BarChart#getXAxis() XAxis} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B XAxis(javafx.scene.chart.Axis<X> x) {
        this.XAxis = x;
        return (B) this;
    }

    private javafx.scene.chart.Axis<Y> YAxis;
    /**
    Set the value of the {@link javafx.scene.chart.BarChart#getYAxis() YAxis} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B YAxis(javafx.scene.chart.Axis<Y> x) {
        this.YAxis = x;
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.chart.BarChart} based on the properties set on this builder.
    */
    public javafx.scene.chart.BarChart<X, Y> build() {
        javafx.scene.chart.BarChart<X, Y> x = new javafx.scene.chart.BarChart<X, Y>(this.XAxis, this.YAxis);
        applyTo(x);
        return x;
    }
}
