package com.jhipster.demo.store.domain;

import static com.jhipster.demo.store.domain.AssertUtils.bigDecimalCompareTo;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductOrderAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductOrderAllPropertiesEquals(ProductOrder expected, ProductOrder actual) {
        assertProductOrderAutoGeneratedPropertiesEquals(expected, actual);
        assertProductOrderAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductOrderAllUpdatablePropertiesEquals(ProductOrder expected, ProductOrder actual) {
        assertProductOrderUpdatableFieldsEquals(expected, actual);
        assertProductOrderUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductOrderAutoGeneratedPropertiesEquals(ProductOrder expected, ProductOrder actual) {
        assertThat(actual)
            .as("Verify ProductOrder auto generated properties")
            .satisfies(a -> assertThat(a.getId()).as("check id").isEqualTo(expected.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductOrderUpdatableFieldsEquals(ProductOrder expected, ProductOrder actual) {
        assertThat(actual)
            .as("Verify ProductOrder relevant properties")
            .satisfies(a -> assertThat(a.getQuantity()).as("check quantity").isEqualTo(expected.getQuantity()))
            .satisfies(a ->
                assertThat(a.getTotalPrice())
                    .as("check totalPrice")
                    .usingComparator(bigDecimalCompareTo)
                    .isEqualTo(expected.getTotalPrice())
            );
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertProductOrderUpdatableRelationshipsEquals(ProductOrder expected, ProductOrder actual) {
        assertThat(actual)
            .as("Verify ProductOrder relationships")
            .satisfies(a -> assertThat(a.getProduct()).as("check product").isEqualTo(expected.getProduct()))
            .satisfies(a -> assertThat(a.getCart()).as("check cart").isEqualTo(expected.getCart()));
    }
}
