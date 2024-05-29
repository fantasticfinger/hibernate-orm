/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html.
 */
package org.hibernate.boot.models.annotations.internal;

import java.lang.annotation.Annotation;

import org.hibernate.boot.models.JpaAnnotations;
import org.hibernate.models.spi.SourceModelBuildingContext;

import org.jboss.jandex.AnnotationInstance;

import jakarta.persistence.EntityListeners;

import static org.hibernate.boot.models.internal.OrmAnnotationHelper.extractJandexValue;

@SuppressWarnings({ "ClassExplicitlyAnnotation", "unused" })
@jakarta.annotation.Generated("org.hibernate.orm.build.annotations.ClassGeneratorProcessor")
public class EntityListenersJpaAnnotation implements EntityListeners {
	private java.lang.Class<?>[] value;

	/**
	 * Used in creating dynamic annotation instances (e.g. from XML)
	 */
	public EntityListenersJpaAnnotation(SourceModelBuildingContext modelContext) {
	}

	/**
	 * Used in creating annotation instances from JDK variant
	 */
	public EntityListenersJpaAnnotation(EntityListeners annotation, SourceModelBuildingContext modelContext) {
		this.value = annotation.value();
	}

	/**
	 * Used in creating annotation instances from Jandex variant
	 */
	public EntityListenersJpaAnnotation(AnnotationInstance annotation, SourceModelBuildingContext modelContext) {
		this.value = extractJandexValue( annotation, JpaAnnotations.ENTITY_LISTENERS, "value", modelContext );
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		return EntityListeners.class;
	}

	@Override
	public java.lang.Class<?>[] value() {
		return value;
	}

	public void value(java.lang.Class<?>[] value) {
		this.value = value;
	}


}
