package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.annotations.Test;

public class WomenTest extends TestBase
{
    HomePage homePage = new HomePage();
    JacketsPage jack = new JacketsPage();

    @Test
    public void verifyWomenMenuSuccessfully()
    {
        homePage.mouseHover();
        homePage.mouseHoverTop();
        homePage.mouseHoverAndClickJackets();
        jack.filterProductName();
        jack.displayProductInAlphabeticalOrder();
    }

    @Test
    public void verifyTheSortByPriceFilter()
    {
        homePage.mouseHover();
        homePage.mouseHoverTop();
        homePage.mouseHoverAndClickJackets();
        jack.sortJacketsByPrice();
        jack.displayJacketsLowToHigh();

    }
}
