package com.one.learn;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author One
 * @date 2019/09/07
 */
public class CollectionObjectsTest {
    class Event {
        private String name;
        private String source;

        private Event(String name, String source) {
            this.name = name;
            this.source = source;
        }

        @Override
        public String toString() {
            return "Event{" +
                    "name='" + name + '\'' +
                    ", source='" + source + '\'' +
                    '}';
        }
    }

    @Test
    void test() {
        Collection collection = new ArrayList();
        collection.add("hello");
        collection.add(5);
        collection.add(new Event("GREETINGS", "guest"));
        String result = new Gson().toJson(collection);
        System.out.println(result);
    }
}
