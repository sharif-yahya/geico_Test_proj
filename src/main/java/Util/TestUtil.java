package Util;

import Base.TestBase;
import org.openqa.selenium.Alert;

import java.util.Iterator;
import java.util.Set;

public class TestUtil extends TestBase {


    public static long PAGE_LOAD_TIMEOUT = 60;
    public static long IMPLICIT_WAIT = 60;

    Alert alert = driver.switchTo().alert();

    Set<String> hand = driver.getWindowHandles();

    Iterator<String> it = hand.iterator();

    String child2 = it.next();



}
