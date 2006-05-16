/**
 *
 * Copyright 2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.xbean.recipe;

import java.net.URL;

/**
 * @version $Rev$ $Date$
 */
public class Person {

    private String name;
    private int age;
    private URL homePage;
    private boolean started;

    public Person(String name, int age, URL homePage) {
        this.name = name;
        this.age = age;
        this.homePage = homePage;
    }

    public static Person newInstance(String name, int age, URL homePage){
        return new Person(name, age, homePage);        
    }

    public static Person justName(String name){
        return new Person(name, 0, null);
    }

    public static Person nameAndAge(String name, int age){
        return new Person(name, age, null);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public URL getHomePage() {
        return homePage;
    }

    public void setHomePage(URL homePage) {
        this.homePage = homePage;
    }

    public void start() {
        started = true;
    }

    public boolean wasStarted() {
        return started;
    }

    public String toString() {
        return super.toString() + " (name=\"" + name + "\", age=\"" + age + "\", homePage=\"" + homePage + "\")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person that = (Person) obj;
            return this.name.equals(that.name) && this.age == that.age && this.homePage.equals(that.homePage);
        }
        return false;
    }
}