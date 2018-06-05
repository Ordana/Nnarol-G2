package controller;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AIManagerTest.class, CollisionManagerTest.class, HeroManagerTest.class, MoveManagerTest.class })
public class AllTests {

}
