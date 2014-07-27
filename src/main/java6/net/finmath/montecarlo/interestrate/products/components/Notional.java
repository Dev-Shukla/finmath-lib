/*
 * Created on 05.12.2009
 *
 * (c) Copyright Christian P. Fries, Germany. All rights reserved. Contact: email@christian-fries.de.
 */
package net.finmath.montecarlo.interestrate.products.components;

import net.finmath.montecarlo.RandomVariable;
import net.finmath.montecarlo.interestrate.LIBORModelMonteCarloSimulationInterface;
import net.finmath.stochastic.RandomVariableInterface;

/**
 * A constant (non-stochastic) notional.
 * 
 * @author Christian Fries
 */
public class Notional implements AbstractNotional {
	
	private final RandomVariable notional;
	
	/**
	 * Creates a constant (non-stochastic) notional.
	 * 
	 * @param notional The constant notional value.
	 */
	public Notional(double notional) {
		super();
		this.notional = new RandomVariable(0.0,notional);
	}

	@Override
	public RandomVariableInterface getNotionalAtPeriodEnd( AbstractPeriod period, LIBORModelMonteCarloSimulationInterface model) {
		return notional;
	}

	@Override
	public RandomVariableInterface getNotionalAtPeriodStart(
			AbstractPeriod period, LIBORModelMonteCarloSimulationInterface model) {
		return notional;
	}
}
