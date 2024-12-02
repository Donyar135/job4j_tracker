package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ProfilesTest {

    @Test
    void whenTestMethodCollect() {
        Address first = new Address("City1", "Street1", 1, 1);
        Address second = new Address("City2", "Street2", 2, 2);
        Address third = new Address("City3", "Street3", 3, 3);
        List<Profile> profiles = Arrays.asList(
                new Profile(first, first.getCity()),
                new Profile(second, second.getCity()),
                new Profile(third, third.getCity())
        );
        List<Address> result = Profiles.collect(profiles);
        List<Address> expected = Arrays.asList(first, second, third);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenTestMethodCollectSortWithoutDuplicate() {
        Address first = new Address("City1", "Street1", 1, 1);
        Address second = new Address("City2", "Street2", 2, 2);
        Address third = new Address("City3", "Street3", 3, 3);
        Address fourth = new Address("City1", "Street1", 1, 1);
        Address fifth = new Address("City2", "Street2", 2, 2);
        Address seventh = new Address("City3", "Street3", 3, 3);
        List<Profile> profiles = Arrays.asList(
                new Profile(second, second.getCity()),
                new Profile(fourth, fourth.getCity()),
                new Profile(fifth, fifth.getCity()),
                new Profile(first, first.getCity()),
                new Profile(seventh, seventh.getCity()),
                new Profile(third, third.getCity())
        );
        List<Address> result = Profiles.collectSortWithoutDuplicate(profiles);
        List<Address> expected = Arrays.asList(first, second, third);
        assertThat(result).isEqualTo(expected);
    }
}