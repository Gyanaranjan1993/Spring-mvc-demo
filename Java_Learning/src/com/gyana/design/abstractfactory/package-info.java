/**
 * This module describes the abstract factory design pattern. It is one of the mostly used
 * creation design pattern in java and is an extension of factory design pattern.
 * <p>
 * It is used when we have multiple type of implementation of related family of objects. i.e when we have factory of
 * factories.
 * <p>
 * e.g.
 * <p>
 * This package demonstrates a {@link com.gyana.design.abstractfactory.CarFactory}example.
 *
 * Consider we have a car factory which can give you a HondaFactory or
 * NissanFactory. HondaFactory has its own type of systems like MusicSystem, GearChangeSystem and SteeringSystem and so
 * does NissanFactory.
 *
 * Client application just needs a FactoryProvider and it can pass necessary input to create a factory of its choice.
 */
package com.gyana.design.abstractfactory;